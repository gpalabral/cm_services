package com.bap.erp.servicios.cpp;

import com.bap.erp.modelo.cpp.CppGrupo;
import java.util.List;

public interface CppGrupoService {
    
    CppGrupo persistCppGrupo(CppGrupo cppGrupo);//CREATE

    CppGrupo mergeCppGrupo(CppGrupo cppGrupo);//UPDATE
    
    void removeCppGrupo(String idUsuario);//DELETE
    
    List<CppGrupo> getCppGrupo(); //RETRIEVE
    
}
