/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.servicios.impl.cpp;


import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppConcepto;
import com.bap.erp.servicios.cpp.CppConceptoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author paola
 */
@Service
public class CppConceptoServiceImpl implements CppConceptoService {
    IGenericDao<CppConcepto> dao;
    
    @Autowired
   public void setDao( IGenericDao<CppConcepto> daoToSet ){
      dao = daoToSet;
      dao.setClazz(CppConcepto.class );
   }

    public CppConcepto persistCppConcepto(CppConcepto cppConcepto) {
        cppConcepto.setIdConcepto(null);
        cppConcepto.setFechaAlta(new Date());
        cppConcepto.setUsuarioAlta("PAO");
        
        dao.create(cppConcepto);
        return cppConcepto;
   }

    public CppConcepto mergeCppConcepto(CppConcepto cppConcepto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCppConcepto(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CppConcepto> getCppConcepto() {
        return dao.findAll();
    }
    
    
}
