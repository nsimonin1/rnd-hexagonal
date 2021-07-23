package org.afrinnov.rnd.hex;

import org.afrinnov.rnd.hex.dto.UserIdentity;
import org.afrinnov.rnd.hex.port.ReadAccessCode;
import org.afrinnov.rnd.hex.ui.AccessCodeUI;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/generator")
public class GreetingResource {
    @Inject
    private ReadAccessCode readAccessCode;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AccessCodeUI generator(@QueryParam("email") String email) {
        return new AccessCodeUI(readAccessCode.generate(new UserIdentity(email)));
    }
}