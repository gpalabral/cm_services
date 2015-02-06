/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.servicios.cpp;

import com.bap.erp.modelo.cpp.CppPlanPago;
import java.util.List;

/**
 *
 * @author jonas
 */
public interface CppPlanPagoService {
    
    CppPlanPago persistCppPlanPago(CppPlanPago cppPlanPago);//CREATE

    CppPlanPago mergeCppPlanPago(CppPlanPago cppPlanPago);//UPDATE
    
    void removeCppPlanPago(String idPlanPago);//DELETE
    
    List<CppPlanPago> getCppPlanPago(); //RETRIEVE
    
}
