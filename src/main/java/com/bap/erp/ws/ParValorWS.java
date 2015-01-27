package com.bap.erp.ws;

import com.bap.erp.modelo.cpp.CppGrupo;
import com.bap.erp.modelo.par.ParValor;
import com.bap.erp.servicios.par.ParValorService;
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
@Path("/parvalor")
@Api(value="parvalor", description="WS for ParValor")
public class ParValorWS {
    
    @Autowired
    private ParValorService parValorService;
    
    public ParValorWS()
    {
    }
    
    @GET
    @Path("/get")
    @ApiOperation(value="Retrieves all ParValor")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getParValor() {
        List<ParValor> list=parValorService.getParValor();
        return Response.status(200).entity(list).build();
    }
    
    @PUT
    @Path("/put")
    @ApiOperation(value="operation to INSERT a ParValor")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putParValor(
		@ApiParam(value="cppgrupo",required=true)  ParValor parValor) {
        
        parValorService.persistParValor(parValor);
        
        return Response.status(200).entity(parValor).build();
    }
    
}
