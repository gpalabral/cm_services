package com.bap.erp.servicios.cpp;

import com.bap.erp.modelo.cpp.CppProveedorCliente;
import java.util.List;

public interface CppProveedorClienteService {
    
    CppProveedorCliente persistCppProveedorCliente(CppProveedorCliente cppProveedorCliente);//CREATE

    CppProveedorCliente mergeCppProveedorCliente(CppProveedorCliente cppProveedorCliente);//UPDATE
    
    void removeCppProveedorCliente(String idUsuario);//DELETE
    
    List<CppProveedorCliente> getCppProveedorCliente(); //RETRIEVE
    
}
