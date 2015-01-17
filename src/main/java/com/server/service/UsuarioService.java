package com.server.service;

import com.server.entity.Usuario;
import java.util.List;

public interface UsuarioService {
    
    Usuario login(String user, String password);
    
    List<Usuario> getUsuarios();
    
    Usuario persistUsuario(Usuario usuario);//INSERT

    Usuario mergeUsuario(Usuario usuario);//UPDATE
    
    void removeUsuario(String idUsuario);//DELETE
    
   
    
}
