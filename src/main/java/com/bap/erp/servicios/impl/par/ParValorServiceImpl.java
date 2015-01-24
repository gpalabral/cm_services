package com.bap.erp.servicios.impl.par;

import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppGrupo;
import com.bap.erp.modelo.par.ParValor;
import com.bap.erp.servicios.par.ParValorService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParValorServiceImpl implements ParValorService {
    
    IGenericDao<ParValor> dao;
    
   @Autowired
   public void setDao( IGenericDao<ParValor> daoToSet ){
      dao = daoToSet;
      dao.setClazz(ParValor.class );
   }

    public ParValor persistParValor(ParValor parValor) {
        
        parValor.setIdParValor(null);
        parValor.setFechaAlta(new Date());
        parValor.setUsuarioAlta("GUS");
        
        dao.create(parValor);
        return parValor;
    }

    public List<ParValor> getParValor() {
        return dao.findAll();
    }

    
}
