package com.bap.erp.servicios.impl.cpp;

import com.bap.erp.dao.IGenericDao;
import com.bap.erp.modelo.cpp.CppProveedorCliente;
import com.bap.erp.servicios.cpp.CppProveedorClienteService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CppProveedorClienteServiceImpl implements CppProveedorClienteService {
    
    IGenericDao<CppProveedorCliente> dao;
    
   @Autowired
   public void setDao( IGenericDao<CppProveedorCliente> daoToSet ){
      dao = daoToSet;
      dao.setClazz(CppProveedorCliente.class );
   }

    public CppProveedorCliente persistCppProveedorCliente(CppProveedorCliente cppProveedorCliente) {
        cppProveedorCliente.setIdProveedorCliente(null);
        cppProveedorCliente.setFechaAlta(new Date());
        cppProveedorCliente.setUsuarioAlta("TEST");
        
        dao.create(cppProveedorCliente);
        
        return cppProveedorCliente;
    }

    public CppProveedorCliente mergeCppProveedorCliente(CppProveedorCliente cppProveedorCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeCppProveedorCliente(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CppProveedorCliente> getCppProveedorCliente() {
        return dao.findAll();
    }

   

    
    
}
