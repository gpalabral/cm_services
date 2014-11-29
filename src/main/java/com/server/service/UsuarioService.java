/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.service;

import com.server.entity.Usuario;
import java.util.List;

/**
 *
 * @author gus
 */
public interface UsuarioService {
    
    Usuario login(String user, String password);
    
    List<Usuario> getUsuarios();
    
}
