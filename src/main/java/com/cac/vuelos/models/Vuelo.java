package com.cac.vuelos.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String destino;
    LocalDateTime fechaHoraSalida;
    LocalDateTime fechaHoraLlegada;
    double precioEnPesos;
    String frecuencia;
    String origen;


    public Vuelo(){};

    public Vuelo(String destino, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraLlegada, double precioEnPesos, String frecuencia, String origen) {
        this.destino = destino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.precioEnPesos = precioEnPesos;
        this.frecuencia = frecuencia;
        this.origen = origen;
    }

    public Vuelo(Long id, String destino, LocalDateTime fechaHoraSalida, LocalDateTime fechaHoraLlegada, double precioEnPesos, String frecuencia, String origen) {
        this.id = id;
        this.destino = destino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.precioEnPesos = precioEnPesos;
        this.frecuencia = frecuencia;
        this.origen = origen;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public LocalDateTime getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public void setFechaHoraLlegada(LocalDateTime fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    public double getPrecioEnPesos() {
        return precioEnPesos;
    }

    public void setPrecioEnPesos(double precioEnPesos) {
        this.precioEnPesos = precioEnPesos;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

}
