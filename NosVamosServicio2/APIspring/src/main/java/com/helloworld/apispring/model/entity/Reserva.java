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
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Integer reservaId;

    @Column(name = "fecha_reserva")
    private String fechaReserva;

    @Column(name = "precio")
    private String precioReserva;

    @Column(name = "punto_inicial")
    private String puntoInicialReserva;

    @Column(name = "punto_final")
    private String puntoFinalReserva;

    @Column(name = "carro_reserva")
    private String carroReserva;

    @Column(name = "modelo_carro_reserva")
    private String modeloCarroReserva;

    @Column(name = "placa_carro_reserva")
    private String placaCarroReserva;

    @Column(name = "ciudad_reserva")
    private String ciudadReserva;

    @Column(name = "asientos_reserva")
    private String asientosReserva;
    
     @Column(name = "conductor_reserva")
    private String conductorReserva;

    @ManyToOne
    @JoinColumn(name = "id_usuario")

    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_conductor")

    private Conductor conductor;

    public Reserva() {
    }

    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(String precioReserva) {
        this.precioReserva = precioReserva;
    }

    public String getPuntoInicialReserva() {
        return puntoInicialReserva;
    }

    public void setPuntoInicialReserva(String puntoInicialReserva) {
        this.puntoInicialReserva = puntoInicialReserva;
    }

    public String getPuntoFinalReserva() {
        return puntoFinalReserva;
    }

    public void setPuntoFinalReserva(String puntoFinalReserva) {
        this.puntoFinalReserva = puntoFinalReserva;
    }

    public String getCarroReserva() {
        return carroReserva;
    }

    public void setCarroReserva(String carroReserva) {
        this.carroReserva = carroReserva;
    }

    public String getModeloCarroReserva() {
        return modeloCarroReserva;
    }

    public void setModeloCarroReserva(String modeloCarroReserva) {
        this.modeloCarroReserva = modeloCarroReserva;
    }

    public String getPlacaCarroReserva() {
        return placaCarroReserva;
    }

    public void setPlacaCarroReserva(String placaCarroReserva) {
        this.placaCarroReserva = placaCarroReserva;
    }

    public String getCiudadReserva() {
        return ciudadReserva;
    }

    public void setCiudadReserva(String ciudadReserva) {
        this.ciudadReserva = ciudadReserva;
    }

    public String getAsientosReserva() {
        return asientosReserva;
    }

    public void setAsientosReserva(String asientosReserva) {
        this.asientosReserva = asientosReserva;
    }

    public String getConductorReserva() {
        return conductorReserva;
    }

    public void setConductorReserva(String conductorReserva) {
        this.conductorReserva = conductorReserva;
    }
    
    

}
