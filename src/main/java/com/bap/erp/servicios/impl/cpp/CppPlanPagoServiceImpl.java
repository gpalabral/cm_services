/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.servicios.impl.cpp;

import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppPlanPago;
import com.bap.erp.servicios.cpp.CppPlanPagoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jonas
 */
@Service
public class CppPlanPagoServiceImpl implements CppPlanPagoService {

    IGenericDao<CppPlanPago> dao;

    @Autowired
    public void setDao(IGenericDao<CppPlanPago> daoToSet) {
        dao = daoToSet;
        dao.setClazz(CppPlanPago.class);
    }

    public CppPlanPago persistCppPlanPago(CppPlanPago cppPlanPago) {
        cppPlanPago.setIdPlanPago(null);
        cppPlanPago.setFechaAlta(new Date());
        cppPlanPago.setUsuarioAlta("TEST");

        dao.create(cppPlanPago);
        return cppPlanPago;
    }

    public CppPlanPago mergeCppPlanPago(CppPlanPago cppPlanPago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCppPlanPago(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CppPlanPago> getCppPlanPago() {
        return dao.findAll();
    }

}
