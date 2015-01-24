package com.server.ws;

import com.server.entity.Usuario;
import com.server.service.UsuarioService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.jaxrs.PATCH;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//@Component
@Path("/usuario")
@Api(value="usuario", description="WS for Usuario")
public class UsuarioWS {
    
    @Context
    private UriInfo context;
    
    @Autowired
    private UsuarioService usuarioService;
    
    public UsuarioWS()
    {
    }
    
    
    @GET
    @Path("/login")
    @ApiOperation(value="login operation to authenticate the user")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(
		@ApiParam(value="user",required=true) @QueryParam("user") String user,
		@ApiParam(value="password",required=true) @QueryParam("password") String password) {
        System.out.println("usuarioService:::: "+usuarioService);
        Usuario usuario=usuarioService.login(user, password);
        
        return Response.status(200).entity(usuario).build();
    }
    
    //Adding a test commit for Git
    @GET
    @Path("/get")
    @ApiOperation(value="Retrieves all users")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuarios() {
        List<Usuario> usuariosList=usuarioService.getUsuarios();
        return Response.status(200).entity(usuariosList).build();
    }
    
    @PUT
    @Path("/put")
    @ApiOperation(value="operation to INSERT a user")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putUsuario(
		@ApiParam(value="user",required=true)  Usuario usuario) {
        System.out.println("usuarioService:::: "+usuarioService);
        usuario=usuarioService.persistUsuario(usuario);
        
        return Response.status(200).entity(usuario).build();
    }
    
    @PATCH
    @Path("/patch")
    @ApiOperation(value="operation to UPDATE a user")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response patchUsuario(
		@ApiParam(value="user",required=true)  Usuario usuario) {
        System.out.println("usuarioService:::: "+usuarioService);
        usuario=usuarioService.mergeUsuario(usuario);
        
        return Response.status(200).entity(usuario).build();
    }
    
    @DELETE
    @Path("/delete")
    @ApiOperation(value="operation to DELETE a user")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUsuario(
		@ApiParam(value="idUsuario",required=true) @QueryParam("idUsuario")  String idUsuario) {
        System.out.println("usuarioService:::: "+usuarioService);
        usuarioService.removeUsuario(idUsuario);
        
        return Response.status(200).entity(idUsuario).build();
    }
    

    
}
