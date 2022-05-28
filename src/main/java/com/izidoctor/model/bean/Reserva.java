/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.izidoctor.model.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author DAVID
 */
@Named(value = "reserva")
@RequestScoped
public class Reserva {

private int idReserva;
private int idUsuario;
private int indicadorActivo;
private int indicadorCancelado;
private int idHorarioMedico;

    public Reserva() {
    }

    public Reserva(int idReserva, int idUsuario, int indicadorActivo, int indicadorCancelado, int idHorarioMedico) {
        this.idReserva = idReserva;
        this.idUsuario = idUsuario;
        this.indicadorActivo = indicadorActivo;
        this.indicadorCancelado = indicadorCancelado;
        this.idHorarioMedico = idHorarioMedico;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIndicadorActivo() {
        return indicadorActivo;
    }

    public void setIndicadorActivo(int indicadorActivo) {
        this.indicadorActivo = indicadorActivo;
    }

    public int getIndicadorCancelado() {
        return indicadorCancelado;
    }

    public void setIndicadorCancelado(int indicadorCancelado) {
        this.indicadorCancelado = indicadorCancelado;
    }

    public int getIdHorarioMedico() {
        return idHorarioMedico;
    }

    public void setIdHorarioMedico(int idHorarioMedico) {
        this.idHorarioMedico = idHorarioMedico;
    }
    
}
