/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.ws;

import com.bap.erp.modelo.cpp.CppConcepto;
import com.bap.erp.servicios.cpp.CppConceptoService;
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
@Path("/cppconcepto")
@Api(value = "cppconcepto", description = "WS for CppConcepto")
public class CppConceptoWS {

    @Autowired
    private CppConceptoService cppConceptoService;

    public CppConceptoWS() {

    }

    @GET
    @Path("/get")
    @ApiOperation(value = "Retrieves all cppConcepto")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCppConcepto() {
        List<CppConcepto> list = cppConceptoService.getCppConcepto();
        return Response.status(200).entity(list).build();
    }

    @PUT
    @Path("/put")
    @ApiOperation(value = "operation to INSERT a cppconcepto")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putCppConcepto(@ApiParam(value = "cppconcepto", required = true) CppConcepto cppConcepto) {
        cppConceptoService.persistCppConcepto(cppConcepto);
        return Response.status(200).entity(cppConcepto).build();

    }
}
