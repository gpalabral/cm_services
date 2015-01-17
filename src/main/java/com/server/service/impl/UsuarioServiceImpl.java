/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.service.impl;

import com.server.entity.Usuario;
import com.server.service.AbstractJpaDAO;
import com.server.service.UsuarioService;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gus
 */
@Repository
public class UsuarioServiceImpl extends AbstractJpaDAO<Usuario> implements UsuarioService {

    public UsuarioServiceImpl() {
        super();

        setClazz(Usuario.class);
    }
    
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

    public void removeUsuario(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
