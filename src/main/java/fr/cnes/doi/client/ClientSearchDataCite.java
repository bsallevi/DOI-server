/*
 * Copyright (C) 2017-2018 Centre National d'Etudes Spatiales (CNES).
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package fr.cnes.doi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cnes.doi.exception.DoiRuntimeException;
import fr.cnes.doi.settings.Consts;
import fr.cnes.doi.settings.DoiSettings;
import fr.cnes.doi.utils.spec.Requirement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.restlet.data.Status;
import org.restlet.representation.Representation;

/**
 * Class to search DOI from metadata
 *
 * @author Jean-Christophe Malapert (jean-christophe.malapert@cnes.fr)
 */
@Requirement(reqId = Requirement.DOI_INTER_010, reqName = Requirement.DOI_INTER_010_NAME)
public class ClientSearchDataCite extends BaseClient {

    /**
     * Base URI for the search API {@value #BASE_URI}.
     */
    private static final String BASE_URI = "https://search.datacite.org/api?";

    /**
     * Default pagination {@value #COUNT}.
     */
    private static final int COUNT = 1000;

    /**
     * List of Doi as search result.
     */
    private final List<String> doiList = new ArrayList<>();

    /**
     * Constructor.
     *
     * @throws Exception when an error happens
     */
    public ClientSearchDataCite() throws Exception {
        this(DoiSettings.getInstance().getString(Consts.INIST_DOI));
    }

    /**
     * Constructor.
     *
     * @param doi_prefix DOI prefix
     * @throws Exception when an error happens
     */
    public ClientSearchDataCite(final String doi_prefix) throws Exception {
        super(BASE_URI);
        computeListDOI(0, doi_prefix);
    }

    /**
     * Computes recursively the response.
     *
     * @param start page number
     * @param doi_prefix DOI prefix
     * @throws DoiRuntimeException - if the status of the query is not 200
     * @throws java.io.IOException - if an error happens in the stream
     */
    public final void computeListDOI(final int start,
            final String doi_prefix) throws DoiRuntimeException, IOException {
        this.getClient().setReference(BASE_URI);
        this.getClient().addQueryParameter("q", "prefix:" + doi_prefix);
        this.getClient().addQueryParameter("fl", "doi");
        this.getClient().addQueryParameter("wt", "json");
        this.getClient().addQueryParameter("indent", "true");
        this.getClient().addQueryParameter("rows", String.valueOf(COUNT));
        this.getClient().addQueryParameter("start", String.valueOf(start));
        final Representation rep = this.getClient().get();
        final Status status = this.getClient().getStatus();
        if (status.isSuccess()) {
            final ObjectMapper mapper = new ObjectMapper();
            final Map responseJson = mapper.readValue(rep.getStream(), Map.class);
            final Map responseMap = (Map) responseJson.get("response");
            final int numFound = (int) responseMap.get("numFound");
            final List<Map> dois = (List) responseMap.getOrDefault("docs", Collections.EMPTY_LIST);
            for (final Map doi : dois) {
                this.doiList.add(String.valueOf(doi.get("doi")));
            }
            if (this.doiList.size() != numFound) {
                computeListDOI(this.doiList.size(), doi_prefix);
            }

        } else {
            throw new DoiRuntimeException(status.getDescription(), status.getThrowable());
        }
    }

    /**
     * Returns the search result.
     *
     * @return the search result
     */
    public List<String> getDois() {
        return Collections.unmodifiableList(this.doiList);
    }

    /**
     * Returns only the dois within the specified project from the search result.
     *
     * @return the search result
     */
    public List<String> getDois(String idProject) {
        List<String> doiListFiltered = new ArrayList<>();
        for (String doi : this.doiList) {
            if (doi.contains(idProject)) {
                doiListFiltered.add(doi);
            }
        }
        return Collections.unmodifiableList(doiListFiltered);
    }

}
