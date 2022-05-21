package com.izidoctor.model.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "centroMedicoBeans")
@RequestScoped
public class CentroMedicoBeans {

    private String nombre;
    private int indicadorActivo,idCentroMedico;
    
    public CentroMedicoBeans() {
    }

    public CentroMedicoBeans(int idCentroMedico,String nombre, int indicadorActivo ) {
        this.nombre = nombre;
        this.indicadorActivo = indicadorActivo;
        this.idCentroMedico = idCentroMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndicadorActivo() {
        return indicadorActivo;
    }

    public void setIndicadorActivo(int indicadorActivo) {
        this.indicadorActivo = indicadorActivo;
    }

    public int getIdCentroMedico() {
        return idCentroMedico;
    }

    public void setIdCentroMedico(int idCentroMedico) {
        this.idCentroMedico = idCentroMedico;
    }
    
}
