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
        Usuario usuario=new Usuario();
        usuario.setLogin(user);
        usuario.setPassword(password);
        usuario.setCorreoElectronico("gus@gmail.com");
        return usuario;
    }

    public List<Usuario> getUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario persistUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Usuario mergeUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
