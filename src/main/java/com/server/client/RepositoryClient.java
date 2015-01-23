package com.server.client;

import com.server.entity.Usuario;
import com.server.service.UsuarioService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RepositoryClient {
    
    public static void main(String args[])
    {   ApplicationContext context = new FileSystemXmlApplicationContext("//Users//gus//Documents//GUS//COMMUNITY//cm_services//src//main//webapp//WEB-INF//applicationContext.xml");
        UsuarioService usuarioService = (UsuarioService) context.getBean("usuarioServiceImpl");
        
        System.out.println("usuarioService:::"+usuarioService);
        
        Usuario usuario=new Usuario();
        usuario.setLogin("gpalabral");
        usuarioService.persistUsuario(usuario);
        
    }
    
}
