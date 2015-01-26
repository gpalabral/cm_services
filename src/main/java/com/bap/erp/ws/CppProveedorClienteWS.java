package com.bap.erp.ws;

import com.bap.erp.modelo.cpp.CppGrupo;
import com.bap.erp.modelo.cpp.CppProveedorCliente;
import com.bap.erp.servicios.cpp.CppGrupoService;
import com.bap.erp.servicios.cpp.CppProveedorClienteService;
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
@Path("/cppProveedorCliente")
@Api(value="cppProveedorCliente", description="WS for CppProveedorCliente")
public class CppProveedorClienteWS {
    
    @Autowired
    private CppProveedorClienteService cppProveedorClienteService;
    
    public CppProveedorClienteWS()
    {
    }
    
    @GET
    @Path("/get")
    @ApiOperation(value="Retrieves all cppProveedorCliente")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCppProveedorCliente() {
        List<CppProveedorCliente> list=cppProveedorClienteService.getCppProveedorCliente();
        return Response.status(200).entity(list).build();
    }
    
    @PUT
    @Path("/put")
    @ApiOperation(value="operation to INSERT a cppProveedorCliente")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putCppProveedorCliente(
		@ApiParam(value="cppProveedorCliente",required=true)  CppProveedorCliente cppProveedorCliente) {
        
        cppProveedorClienteService.persistCppProveedorCliente(cppProveedorCliente);
        
        return Response.status(200).entity(cppProveedorCliente).build();
    }
    
}
