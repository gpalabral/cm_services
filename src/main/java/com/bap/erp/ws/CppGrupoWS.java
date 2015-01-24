package com.bap.erp.ws;

import com.bap.erp.modelo.cpp.CppGrupo;
import com.bap.erp.servicios.cpp.CppGrupoService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Path("/cppgrupo")
@Api(value="cppgrupo", description="WS for CppGrupo")
public class CppGrupoWS {
    
    @Autowired
    private CppGrupoService cppGrupoService;
    
    public CppGrupoWS()
    {
    }
    
    @GET
    @Path("/get")
    @ApiOperation(value="Retrieves all cppGrupo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCppGrupo() {
        List<CppGrupo> list=cppGrupoService.getCppGrupo();
        return Response.status(200).entity(list).build();
    }
    
    @PUT
    @Path("/put")
    @ApiOperation(value="operation to INSERT a cppgrupo")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putCppGrupo(
		@ApiParam(value="cppgrupo",required=true)  CppGrupo cppGrupo) {
        
        cppGrupoService.persistCppGrupo(cppGrupo);
        
        return Response.status(200).entity(cppGrupo).build();
    }
    
//    @PATCH
//    @Path("/patch")
//    @ApiOperation(value="operation to UPDATE a user")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response patchUsuario(
//		@ApiParam(value="user",required=true)  Usuario usuario) {
//        System.out.println("usuarioService:::: "+usuarioService);
//        usuario=usuarioService.mergeUsuario(usuario);
//        
//        return Response.status(200).entity(usuario).build();
//    }
//    
//    @DELETE
//    @Path("/delete")
//    @ApiOperation(value="operation to DELETE a user")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response deleteUsuario(
//		@ApiParam(value="idUsuario",required=true) @QueryParam("idUsuario")  String idUsuario) {
//        System.out.println("usuarioService:::: "+usuarioService);
//        usuarioService.removeUsuario(idUsuario);
//        
//        return Response.status(200).entity(idUsuario).build();
//    }
    

    
}
