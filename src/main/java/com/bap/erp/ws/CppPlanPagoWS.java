/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.ws;

import com.bap.erp.modelo.cpp.CppPlanPago;
import com.bap.erp.servicios.cpp.CppPlanPagoService;
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
 * @author jonas
 */
@Component
@Path("/cppPlanPago")
@Api(value = "cppPlanPago", description = "WS for CppPlanPago")
public class CppPlanPagoWS {

    @Autowired
    private CppPlanPagoService cppPlanPagoService;

    public CppPlanPagoWS() {

    }

    @GET
    @Path("/get")
    @ApiOperation(value = "Retrieves all cppPlanPago")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCppPlanPago() {
        List<CppPlanPago> list = cppPlanPagoService.getCppPlanPago();
        return Response.status(200).entity(list).build();
    }

    @PUT
    @Path("/put")
    @ApiOperation(value = "operation to INSERT a cppPlanPago")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putCppPlanPago(@ApiParam(value = "cppPlanPago", required = true) CppPlanPago cppPlanPago) {
        cppPlanPagoService.persistCppPlanPago(cppPlanPago);
        return Response.status(200).entity(cppPlanPago).build();

    }
}
