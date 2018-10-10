/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.UsuarioRepositorio;
import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    
    private Usuario usuario;
    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicio() {
    }

    public List<Usuario> getAllUsuario() {
        return usuarioRepositorio.getAllUsuarios();
    }
    
  
    public String crearUsuario(Usuario usuario) {
        long usuarioId = usuarioRepositorio.crearUsuario(usuario);
        return "Usuario creado con ID:" + usuarioId;
    }
    
    public String LoginUsuario(String correo, String password){
        
       String correoU= usuarioRepositorio.LoginUsuario(correo, password);
        
       return correoU;
               
        
    }
    
}
