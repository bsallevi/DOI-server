//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.11 at 04:29:56 PM CET 
//

package org.datacite.schema.kernel_4;

import fr.cnes.doi.utils.spec.Requirement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for contributorType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="contributorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ContactPerson"/&gt;
 *     &lt;enumeration value="DataCollector"/&gt;
 *     &lt;enumeration value="DataCurator"/&gt;
 *     &lt;enumeration value="DataManager"/&gt;
 *     &lt;enumeration value="Distributor"/&gt;
 *     &lt;enumeration value="Editor"/&gt;
 *     &lt;enumeration value="HostingInstitution"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Producer"/&gt;
 *     &lt;enumeration value="ProjectLeader"/&gt;
 *     &lt;enumeration value="ProjectManager"/&gt;
 *     &lt;enumeration value="ProjectMember"/&gt;
 *     &lt;enumeration value="RegistrationAgency"/&gt;
 *     &lt;enumeration value="RegistrationAuthority"/&gt;
 *     &lt;enumeration value="RelatedPerson"/&gt;
 *     &lt;enumeration value="ResearchGroup"/&gt;
 *     &lt;enumeration value="RightsHolder"/&gt;
 *     &lt;enumeration value="Researcher"/&gt;
 *     &lt;enumeration value="Sponsor"/&gt;
 *     &lt;enumeration value="Supervisor"/&gt;
 *     &lt;enumeration value="WorkPackageLeader"/&gt;
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@Requirement(reqId = Requirement.DOI_SRV_010, reqName = Requirement.DOI_SRV_010_NAME)
@Requirement(reqId = Requirement.DOI_SRV_040, reqName = Requirement.DOI_SRV_040_NAME)
@Requirement(reqId = Requirement.DOI_INTER_060, reqName = Requirement.DOI_INTER_060_NAME)
@XmlType(name = "contributorType")
@XmlEnum
public enum ContributorType {

    /**
     * Person with knowledge of how to access, troubleshoot, or otherwise field
     * issues related to the resource. May also be "Point of Contact" in
     * organisation that controls access to the resource, if that organisation is
     * different from Publisher, Distributor, Data Manager
     */
    @XmlEnumValue("ContactPerson")
    CONTACT_PERSON("ContactPerson"),
    /**
     * Person/institution responsible for finding, gathering/collecting data under
     * the guidelines of the author(s) or Principal Investigator (PI). May also use
     * when crediting survey conductors, interviewers, event or condition observers,
     * person responsible for monitoring key instrument data.
     */
    @XmlEnumValue("DataCollector")
    DATA_COLLECTOR("DataCollector"),
    /**
     * Person tasked with reviewing, enhancing, cleaning, or standardizing metadata
     * and the associated data submitted for storage, use, and maintenance within a
     * data centre or repository. While the "DataManager" is concerned with digital
     * maintenance, the DataCurator’s role encompasses quality assurance focused on
     * content and metadata. This includes checking whether the submitted dataset is
     * complete, with all files and components as described by submitter, whether
     * the metadata is standardized to appropriate systems and schema, whether
     * specialized metadata is needed to add value and ensure access across
     * disciplines, and determining how the metadata might map to search engines,
     * database products, and automated feeds.
     */
    @XmlEnumValue("DataCurator")
    DATA_CURATOR("DataCurator"),
    /**
     * Person (or organisation with a staff of data managers, such as a data centre)
     * responsible for maintaining the finished resource. The work done by this
     * person or organisation ensures that the resource is periodically "refreshed"
     * in terms of software/hardware support, is kept available or is protected from
     * unauthorized access, is stored in accordance with industry standards, and is
     * handled in accordance with the records management requirements applicable to
     * it.
     */
    @XmlEnumValue("DataManager")
    DATA_MANAGER("DataManager"),
    /**
     * Institution tasked with responsibility to generate/disseminate copies of the
     * resource in either electronic or print form. Works stored in more than one
     * archive/repository may credit each as a distributor.
     */
    @XmlEnumValue("Distributor")
    DISTRIBUTOR("Distributor"),
    /**
     * A person who oversees the details related to the publication format of the
     * resource. Note: if the Editor is to be credited in place of multiple
     * creators, the Editor's name may be supplied as Creator, with "(Ed.)" appended
     * to the name.
     */
    @XmlEnumValue("Editor")
    EDITOR("Editor"),
    /**
     * Typically, the organisation allowing the resource to be available on the
     * internet through the provision of its hardware/software/operating support.
     * May also be used for an organisation that stores the data offline. Often a
     * data centre (if that data centre is not the "publisher" of the resource.)
     */
    @XmlEnumValue("HostingInstitution")
    HOSTING_INSTITUTION("HostingInstitution"),
    /**
     * Any person or institution making a significant contribution to the
     * development and/or maintenance of the resource, but whose contribution does
     * not “fit” other controlled vocabulary for contributorType. Could be a
     * photographer, artist, or writer whose contribution helped to publicize the
     * resource (as opposed to creating it), a reviewer of the resource, someone
     * providing administrative services to the author (such as depositing updates
     * into an online repository, analysing usage, etc.), or one of many other
     * roles.
     */
    @XmlEnumValue("Other")
    OTHER("Other"),
    /**
     * Typically a person or organisation responsible for the artistry and form of a
     * media product. In the data industry, this may be a company "producing" DVDs
     * that package data for future dissemination by a distributor
     */
    @XmlEnumValue("Producer")
    PRODUCER("Producer"),
    /**
     * Person officially designated as head of project team or sub‐project team
     * instrumental in the work necessary to development of the resource. The
     * Project Leader is not "removed" from the work that resulted in the resource;
     * he or she remains intimately involved throughout the life of the particular
     * project team.
     */
    @XmlEnumValue("ProjectLeader")
    PROJECT_LEADER("ProjectLeader"),
    /**
     * Person officially designated as manager of a project. Project may consist of
     * one or many project teams and sub‐teams. The manager of a project normally
     * has more administrative responsibility than actual work involvement.
     */
    @XmlEnumValue("ProjectManager")
    PROJECT_MANAGER("ProjectManager"),
    /**
     * Person on the membership list of a designated project/project team. This
     * vocabulary may or may not indicate the quality, quantity, or substance of the
     * person's involvement.
     */
    @XmlEnumValue("ProjectMember")
    PROJECT_MEMBER("ProjectMember"),
    /**
     * Institution/organisation officially appointed by a Registration Authority to
     * handle specific tasks within a defined area of responsibility. DataCite is a
     * Registration Agency for the International DOI Foundation (IDF). One of
     * DataCite's tasks is to assign DOI prefixes to the allocating agents who then
     * assign the full, specific character string to data clients, provide metadata
     * back to the DataCite registry, etc
     */
    @XmlEnumValue("RegistrationAgency")
    REGISTRATION_AGENCY("RegistrationAgency"),
    /**
     * A standards‐setting body from which Registration Agencies obtain official
     * recognition and guidance. The IDF serves as the Registration Authority for
     * the International Standards Organisation (ISO) in the area/domain of Digital
     * Object Identifiers.
     */
    @XmlEnumValue("RegistrationAuthority")
    REGISTRATION_AUTHORITY("RegistrationAuthority"),
    /**
     * A person without a specifically defined role in the development of the
     * resource, but who is someone the author wishes to recognize. This person
     * could be an author's intellectual mentor, a person providing intellectual
     * leadership in the discipline or subject domain, etc
     */
    @XmlEnumValue("RelatedPerson")
    RELATED_PERSON("RelatedPerson"),
    /**
     * Typically refers to a group of individuals with a lab, department, or
     * division; the group has a particular, defined focus of activity. May operate
     * at a narrower level of scope; may or may not hold less administrative
     * responsibility than a project team.
     */
    @XmlEnumValue("ResearchGroup")
    RESEARCH_GROUP("ResearchGroup"),
    /**
     * Person or institution owning or managing property rights, including
     * intellectual property rights over the resource.
     */
    @XmlEnumValue("RightsHolder")
    RIGHTS_HOLDER("RightsHolder"),
    /**
     * A person involved in analyzing data or the results of an experiment or formal
     * study. May indicate an intern or assistant to one of the authors who helped
     * with research but who was not so "key" as to be listed as an author. Should
     * be a person, not an institution. Note that a person involved in the gathering
     * of data would fall under the contributorType "DataCollector." The researcher
     * may find additional data online and correlate it to the data collected for
     * the experiment or study, for example.
     */
    @XmlEnumValue("Researcher")
    RESEARCHER("Researcher"),
    /**
     * Person or organisation that issued a contract or under the auspices of which
     * a work has been written, printed, published, developed, etc. Includes
     * organisations that provide in‐kind support, through donation, provision of
     * people or a facility or instrumentation necessary for the development of the
     * resource, etc.
     */
    @XmlEnumValue("Sponsor")
    SPONSOR("Sponsor"),
    /**
     * Designated administrator over one or more groups/teams working to produce a
     * resource or over one or more steps of a development process.
     */
    @XmlEnumValue("Supervisor")
    SUPERVISOR("Supervisor"),
    /**
     * A Work Package is a recognized data product, not all of which is included in
     * publication. The package, instead, may include notes, discarded documents,
     * etc. The Work Package Leader is responsible for ensuring the comprehensive
     * contents, versioning, and availability of the Work Package during the
     * development of the resource.
     */
    @XmlEnumValue("WorkPackageLeader")
    WORK_PACKAGE_LEADER("WorkPackageLeader");
    private final String value;

    ContributorType(String v) {
	value = v;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String value() {
	return value;
    }

    /**
     * Gets the contributor type from a value
     *
     * @param v
     *            value
     * @return the contributor type
     * @throws IllegalArgumentException
     *             - if contributor type not found
     */
    public static ContributorType fromValue(String v) {
	for (ContributorType c : ContributorType.values()) {
	    if (c.value.equals(v)) {
		return c;
	    }
	}
	throw new IllegalArgumentException(v);
    }

}
