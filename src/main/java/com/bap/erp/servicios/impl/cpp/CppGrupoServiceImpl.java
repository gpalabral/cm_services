package com.bap.erp.servicios.impl.cpp;

import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppGrupo;
import com.bap.erp.servicios.cpp.CppGrupoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CppGrupoServiceImpl implements CppGrupoService {
    
    IGenericDao<CppGrupo> dao;
    
   @Autowired
   public void setDao( IGenericDao<CppGrupo> daoToSet ){
      dao = daoToSet;
      dao.setClazz(CppGrupo.class );
   }

    public CppGrupo persistCppGrupo(CppGrupo cppGrupo) {
        
        cppGrupo.setIdGrupo(null);
        cppGrupo.setFechaAlta(new Date());
        cppGrupo.setUsuarioAlta("GUS");
        
        dao.create(cppGrupo);
        return cppGrupo;
    }

    public CppGrupo mergeCppGrupo(CppGrupo cppGrupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCppGrupo(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CppGrupo> getCppGrupo() {
        return dao.findAll();
    }

    
    
}
