/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;

import com.helloworld.apispring.model.dao.CarroRepositorio;
import com.helloworld.apispring.model.entity.Carro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroServicio {

    @Autowired
    private CarroRepositorio carroRepositorio;

    public CarroServicio() {
    }

    public List<Carro> getAllCarro() {
        return carroRepositorio.getAllCarros();
    }

    public String crearCarro(Carro carro) {
        long carroId = carroRepositorio.crearCarro(carro);
        return "Carro creado con ID:" + carroId;
    }
}
