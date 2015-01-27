package com.bap.erp.servicios.impl.cpp;

import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppFormaPagoCobro;
import com.bap.erp.servicios.cpp.CppFormaPagoCobroService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CppFormaPagoCobroServiceImpl implements CppFormaPagoCobroService {
    
    IGenericDao<CppFormaPagoCobro> dao;
    
   @Autowired
   public void setDao( IGenericDao<CppFormaPagoCobro> daoToSet ){
      dao = daoToSet;
      dao.setClazz(CppFormaPagoCobro.class );
   }

    public CppFormaPagoCobro persistCppFormaPagoCobro(CppFormaPagoCobro cppFormaPagoCobro) {        
        cppFormaPagoCobro.setIdFormaPagoCobro(null);
        cppFormaPagoCobro.setFechaAlta(new Date());
        cppFormaPagoCobro.setUsuarioAlta("TEST");
        
        dao.create(cppFormaPagoCobro);
        return cppFormaPagoCobro;
    }

    public CppFormaPagoCobro mergeCppFormaPagoCobro(CppFormaPagoCobro cppFormaPagoCobro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCppFormaPagoCobro(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CppFormaPagoCobro> getCppFormaPagoCobro() {
        return dao.findAll();
    }

}
