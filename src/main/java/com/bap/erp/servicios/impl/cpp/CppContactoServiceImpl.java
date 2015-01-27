/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bap.erp.servicios.impl.cpp;

import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppContacto;
import com.bap.erp.servicios.cpp.CppContactoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author paola
 */
@Service
public class CppContactoServiceImpl implements CppContactoService {
    
    IGenericDao<CppContacto> dao;
    
   @Autowired
   public void setDao( IGenericDao<CppContacto> daoToSet ){
      dao = daoToSet;
      dao.setClazz(CppContacto.class );
   }

    public CppContacto persistCppContacto(CppContacto cppContacto) {
        
        cppContacto.setIdContacto(null);
        cppContacto.setFechaAlta(new Date());
        cppContacto.setUsuarioAlta("PAO");
        
        dao.create(cppContacto);
        return cppContacto;
    }

    public CppContacto mergeCppContacto(CppContacto cppContacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCppContacto(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CppContacto> getCppContacto() {
        return dao.findAll();
    }

    
    
}
