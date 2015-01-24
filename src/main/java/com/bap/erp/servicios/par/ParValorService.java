package com.bap.erp.servicios.par;

import com.bap.erp.modelo.par.ParValor;
import java.util.List;

public interface ParValorService {
    
    ParValor persistParValor(ParValor ParValor);//CREATE

    List<ParValor> getParValor(); //RETRIEVE
    
}
