package com.server.ws;

import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/auth")
public class AuthenticationResources {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AuthenticationResources
     */
    public AuthenticationResources() {
    }

    @POST
    //@Produces("application/json")
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUser(Credenciales credenciales) {

        System.out.println("credenciales:::: " + credenciales);

        ObjectMapper mapper = new ObjectMapper();
        String json="{'user':'"+credenciales.getUserName()+"','pass':'"+credenciales.getPassword()+"'}";

        try {

            json = mapper.writeValueAsString(json);
            System.out.println("json::: " + json);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //return admUsuarios;
        return Response.status(200).entity(json).build();
        //return Response.status(200).entity(new Track().toString()).build();
    }
    
    
    
    @GET
    @Path("/postQuery")
    @Produces(MediaType.APPLICATION_JSON)
    public Response authenticateUserQuery(
		@QueryParam("user") String user,
		@QueryParam("password") String password) {


        ObjectMapper mapper = new ObjectMapper();
        String json="{}";

        try {

            json = mapper.writeValueAsString(json);
            System.out.println("json::: " + json);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //return admUsuarios;
        return Response.status(200).entity(json).build();
        //return Response.status(200).entity(new Track().toString()).build();
    }
    
}
