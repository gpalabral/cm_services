/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.ws;

import com.bap.erp.modelo.cpp.CppContacto;
import com.bap.erp.servicios.cpp.CppContactoService;
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

/**
 *
 * @author paola
 */
@Component
@Path("/cppcontacto")
@Api(value="cppcontacto", description="WS for CppContacto")
public class CppContactoWS {
    @Autowired
    private CppContactoService cppContactoService;
    
    public CppContactoWS()
    {
    }
    
    @GET
    @Path("/get")
    @ApiOperation(value="Retrieves all cppContacto")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCppContacto() {
        List<CppContacto> list=cppContactoService.getCppContacto();
        return Response.status(200).entity(list).build();
    }
    
    @PUT
    @Path("/put")
    @ApiOperation(value="operation to INSERT a cppcontacto")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putCppContacto(
		@ApiParam(value="cppcontacto",required=true)  CppContacto cppContacto) {
        
        cppContactoService.persistCppContacto(cppContacto);
        
        return Response.status(200).entity(cppContacto).build();
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
