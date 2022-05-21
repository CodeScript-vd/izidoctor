package com.izidoctor.model.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "centroMedicoSucursalBeans")
@RequestScoped
public class CentroMedicoSucursalBeans {

    private int idCentroMedicoSucursal;
    private String direccion,numero;
    private int indicadorActivo;
    private String referencia;
    private int idCentroMedico,idDireccion;

    public CentroMedicoSucursalBeans() {
    }

    public CentroMedicoSucursalBeans(int idCentroMedicoSucursal, String direccion, String numero, int indicadorActivo, String referencia, int idCentroMedico, int idDireccion) {
        this.idCentroMedicoSucursal = idCentroMedicoSucursal;
        this.direccion = direccion;
        this.numero = numero;
        this.indicadorActivo = indicadorActivo;
        this.referencia = referencia;
        this.idCentroMedico = idCentroMedico;
        this.idDireccion = idDireccion;
    }

    public int getIdCentroMedicoSucursal() {
        return idCentroMedicoSucursal;
    }

    public void setIdCentroMedicoSucursal(int idCentroMedicoSucursal) {
        this.idCentroMedicoSucursal = idCentroMedicoSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIndicadorActivo() {
        return indicadorActivo;
    }

    public void setIndicadorActivo(int indicadorActivo) {
        this.indicadorActivo = indicadorActivo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getIdCentroMedico() {
        return idCentroMedico;
    }

    public void setIdCentroMedico(int idCentroMedico) {
        this.idCentroMedico = idCentroMedico;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }
    
}
