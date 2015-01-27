package com.bap.erp.servicios.cpp;

import com.bap.erp.modelo.cpp.CppFormaPagoCobro;
import java.util.List;

public interface CppFormaPagoCobroService {
    
    CppFormaPagoCobro persistCppFormaPagoCobro(CppFormaPagoCobro cppFormaPagoCobro);//CREATE

    CppFormaPagoCobro mergeCppFormaPagoCobro(CppFormaPagoCobro cppFormaPagoCobro);//UPDATE
    
    void removeCppFormaPagoCobro(String idFormaPagoCobro);//DELETE
    
    List<CppFormaPagoCobro> getCppFormaPagoCobro(); //RETRIEVE
    
}
