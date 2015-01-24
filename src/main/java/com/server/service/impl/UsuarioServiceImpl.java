/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.service.impl;

import com.server.entity.Usuario;
import com.bap.erp.dao.IGenericDao;
import com.server.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    IGenericDao<Usuario> dao;
    
   @Autowired
   public void setDao( IGenericDao<Usuario> daoToSet ){
      dao = daoToSet;
      dao.setClazz(Usuario.class );
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
        dao.create(usuario);
        return usuario;
    }

    public Usuario mergeUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removeUsuario(String idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
