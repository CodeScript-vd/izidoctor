/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.izidoctor.model.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author DAVID
 */
@Named(value = "usuarioBeans")
@Dependent
public class UsuarioBeans {
private String codUsu,nombre,perfil,correo,pass;
    
    public UsuarioBeans() {
    }

    public UsuarioBeans(String codUsu,String nombre, String perfil, String correo, String pass) {
        this.codUsu = codUsu;
        this.nombre = nombre;
        this.perfil = perfil;
        this.correo = correo;
        this.pass = pass;
    }


    public String getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(String codUsu) {
        this.codUsu = codUsu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
