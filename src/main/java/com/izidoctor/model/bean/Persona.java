package com.izidoctor.model.bean;

import java.util.Date;

public class Persona {
    int idPersona, idPaisNacionalidad, idTipoDocumento;
    String nombre, apellidoPaterno, apellidoMaterno, celular, correo, nroDocumento;
    Date fechaNacimieno;

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Date getFechaNacimieno() {
        return fechaNacimieno;
    }

    public void setFechaNacimieno(Date fechaNacimieno) {
        this.fechaNacimieno = fechaNacimieno;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdPaisNacionalidad() {
        return idPaisNacionalidad;
    }

    public void setIdPaisNacionalidad(int idPaisNacionalidad) {
        this.idPaisNacionalidad = idPaisNacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
