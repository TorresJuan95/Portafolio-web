/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Integer carroId;

    @Column(name = "marca_carro")
    private String marcaCarro;

    @Column(name = "placa_carro")
    private String placaCarro;

    @Column(name = "asientos_carro")
    private String asientosCarro;

    @ManyToOne
    @JoinColumn(name = "id_conductor")

    private Conductor conductorCarro;

    public Carro() {
    }

    public Integer getCarroId() {
        return carroId;
    }

    public void setCarroId(Integer carroId) {
        this.carroId = carroId;
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getAsientosCarro() {
        return asientosCarro;
    }

    public void setAsientosCarro(String asientosCarro) {
        this.asientosCarro = asientosCarro;
    }

}
