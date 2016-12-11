package de.fhe.ai.diashowgenerator.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Kiddolocke on 25.11.2016.
 */

@Path("/hello")
public class HelloResource
{
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreeting()
    {
        return "HELLO!";
    }
}
