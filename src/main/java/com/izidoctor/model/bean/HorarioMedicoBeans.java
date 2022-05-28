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
@Named(value = "horarioMedicoBeans")
@RequestScoped
public class HorarioMedicoBeans {

    private int idHorarioMedico;
    private String horaInicio;
    private int duracion;
    private int indicadorActivo;
    private int idEspecialidad;
    private int idMedico;

        
    public HorarioMedicoBeans() {
    }

    public HorarioMedicoBeans(int idHorarioMedico, String horaInicio, int duracion, int indicadorActivo, int idEspecialidad, int idMedico) {
        this.idHorarioMedico = idHorarioMedico;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.indicadorActivo = indicadorActivo;
        this.idEspecialidad = idEspecialidad;
        this.idMedico = idMedico;
    }

    public int getIdHorarioMedico() {
        return idHorarioMedico;
    }

    public void setIdHorarioMedico(int idHorarioMedico) {
        this.idHorarioMedico = idHorarioMedico;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getIndicadorActivo() {
        return indicadorActivo;
    }

    public void setIndicadorActivo(int indicadorActivo) {
        this.indicadorActivo = indicadorActivo;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    
    
    
}
