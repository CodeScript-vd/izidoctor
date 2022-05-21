package com.izidoctor.model.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "centroMedicoEspecialidadBeans")
@RequestScoped
public class CentroMedicoEspecialidadBeans {

    private int idEspecialidad;
    private String nombre;
    private String indicadorActivo;
    private String precio;
    private String Especialidadcol;
    private int idCentroMedicoSucursal;

    public CentroMedicoEspecialidadBeans() {
    }

    public CentroMedicoEspecialidadBeans(int idEspecialidad, String nombre, String indicadorActivo, String precio, String Especialidadcol, int idCentroMedicoSucursal) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.indicadorActivo = indicadorActivo;
        this.precio = precio;
        this.Especialidadcol = Especialidadcol;
        this.idCentroMedicoSucursal = idCentroMedicoSucursal;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIndicadorActivo() {
        return indicadorActivo;
    }

    public void setIndicadorActivo(String indicadorActivo) {
        this.indicadorActivo = indicadorActivo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEspecialidadcol() {
        return Especialidadcol;
    }

    public void setEspecialidadcol(String Especialidadcol) {
        this.Especialidadcol = Especialidadcol;
    }

    public int getIdCentroMedicoSucursal() {
        return idCentroMedicoSucursal;
    }

    public void setIdCentroMedicoSucursal(int idCentroMedicoSucursal) {
        this.idCentroMedicoSucursal = idCentroMedicoSucursal;
    }
    
}
