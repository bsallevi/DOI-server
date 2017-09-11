/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cnes.doi.logging.api;

import fr.cnes.doi.utils.Requirement;
import java.io.IOException;
import java.util.logging.Level;
import org.restlet.engine.log.AccessLogFileHandler;

/**
 * FileHandler to log request and responses.
 *
 * @author Jean-Christophe Malapert (jean-christophe.malapert@cnes.fr)
 */
@Requirement(
        reqId = "DOI_ARCHI_040",
        reqName = "Logs"
)
public final class FileHandlerLogAPIServer extends AccessLogFileHandler {

    /**
     * File handler for API.
     *
     * @throws IOException - Exception
     * @throws SecurityException - Exception
     */
    public FileHandlerLogAPIServer() throws IOException, SecurityException {
        super();
        this.setLevel(Level.INFO);
    }

    @Override
    public final synchronized void setLevel(final Level level) {
        super.setLevel(level);
    }

}
