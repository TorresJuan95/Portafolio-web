/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "conductor")
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conductor")
    private Integer conductorId;

    @Column(name = "nombre_conductor")
    private String nombreUsuario;

    @Column(name = "usuario")
    private String usuarioConductor;

    @Column(name = "password")
    private String passwordConductor;

    @Column(name = "correo")
    private String correoConductor;

    @Column(name = "ciudad_conductor")
    private String ciudadConductor;

    @Column(name = "punto_inicial")
    private String puntoInicialConductor;

    @Column(name = "punto_final")
    private String puntoFinalConductor;

    @OneToMany(mappedBy = "conductor")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "conductorCarro")
    private List<Carro> carros;

    public Conductor() {
    }

    public Integer getConductorId() {
        return conductorId;
    }

    public void setConductorId(Integer conductorId) {
        this.conductorId = conductorId;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordConductor() {
        return passwordConductor;
    }

    public void setPasswordConductor(String passwordConductor) {
        this.passwordConductor = passwordConductor;
    }

    public String getCorreoConductor() {
        return correoConductor;
    }

    public void setCorreoConductor(String correoConductor) {
        this.correoConductor = correoConductor;
    }

    public String getCiudadConductor() {
        return ciudadConductor;
    }

    public void setCiudadConductor(String ciudadConductor) {
        this.ciudadConductor = ciudadConductor;
    }

    public String getPuntoInicialConductor() {
        return puntoInicialConductor;
    }

    public void setPuntoInicialConductor(String puntoInicialConductor) {
        this.puntoInicialConductor = puntoInicialConductor;
    }

    public String getPuntoFinalConductor() {
        return puntoFinalConductor;
    }

    public void setPuntoFinalConductor(String puntoFinalConductor) {
        this.puntoFinalConductor = puntoFinalConductor;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

}
