/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.ConductorRepositorio;
import com.helloworld.apispring.model.entity.Conductor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConductorServicio {

    @Autowired
    private ConductorRepositorio conductorRepositorio;

    public ConductorServicio() {
    }

    public List<Conductor> getAllConductor() {
        return conductorRepositorio.getAllConductores();
    }

    public String crearConductor(Conductor conductor) {
        long conductorId = conductorRepositorio.crearConductor(conductor);
        return "Conductor creado con ID:" + conductorId;
    }
    
}
