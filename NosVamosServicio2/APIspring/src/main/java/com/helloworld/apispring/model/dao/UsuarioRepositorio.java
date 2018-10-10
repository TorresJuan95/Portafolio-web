/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioRepositorio {
    
    

    @Autowired
    private SessionFactory sessionFactory;    
    private Usuario usuario;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Usuario> getAllUsuarios() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
        return criteria.list();
    }
    
     public List<Usuario> getAllUsuariosReserva(int reserva) {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("reserva",reserva));
        return criteria.list();
    }
     

    public long crearUsuario(Usuario usuario) {
        getSessionFactory().getCurrentSession().save(usuario);
        return usuario.getUsuarioId();
    }
     public String LoginUsuario(String correo, String password){
         
          if(usuario.correoUsuario==correo && usuario.passwordUsuario==password){
            
            return "Bienvenido"+usuario.getCorreoUsuario();
        }else{
            return "Correo incorrecto";
        }
     }

}
