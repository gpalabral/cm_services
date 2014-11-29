/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.service.impl;

import com.server.entity.Usuario;
import com.server.service.UsuarioService;
import java.util.List;

/**
 *
 * @author gus
 */
public class UsuarioServiceImpl implements UsuarioService {

    public Usuario login(String user, String password) {
        System.out.println("Authenticating the user........"+user+"..... "+password);
        return new Usuario();
    }

    public List<Usuario> getUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
