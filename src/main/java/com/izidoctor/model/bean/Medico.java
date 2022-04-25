package com.izidoctor.model.bean;

public class Medico extends Persona{
    int idMedico, idEspecialidad, indActivo;
    String contrasenia, nroColegiado;

    public Medico() {
    }

    public Medico(int idMedico, int idEspecialidad, int indActivo, String contrasenia, String nroColegiado) {
        this.idMedico = idMedico;
        this.idEspecialidad = idEspecialidad;
        this.indActivo = indActivo;
        this.contrasenia = contrasenia;
        this.nroColegiado = nroColegiado;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public int getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(int indActivo) {
        this.indActivo = indActivo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNroColegiado() {
        return nroColegiado;
    }

    public void setNroColegiado(String nroColegiado) {
        this.nroColegiado = nroColegiado;
    }
}
