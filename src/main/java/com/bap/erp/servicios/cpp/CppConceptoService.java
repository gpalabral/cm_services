/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.servicios.cpp;

import com.bap.erp.modelo.cpp.CppConcepto;
import java.util.List;

/**
 *
 * @author paola
 */
public interface CppConceptoService {
    
    CppConcepto persistCppConcepto(CppConcepto cppConcepto);//CREATE

    CppConcepto mergeCppConcepto(CppConcepto cppConcepto);//UPDATE
    
    void removeCppConcepto(String idUsuario);//DELETE
    
    List<CppConcepto> getCppConcepto(); //RETRIEVE
    
}
