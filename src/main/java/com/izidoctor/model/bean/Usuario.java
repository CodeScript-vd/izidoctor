package com.izidoctor.model.bean;

public class Usuario extends Persona{
    int idUsuario, indActivo, indEliminado, intentosFallidos;
    String contrasenia;

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(int indActivo) {
        this.indActivo = indActivo;
    }

    public int getIndEliminado() {
        return indEliminado;
    }

    public void setIndEliminado(int indEliminado) {
        this.indEliminado = indEliminado;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
