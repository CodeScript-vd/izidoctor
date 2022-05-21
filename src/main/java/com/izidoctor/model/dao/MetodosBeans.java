/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.izidoctor.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import com.izidoctor.model.bean.UsuarioBeans;
import com.izidoctor.util.ConexionDB;

/**
 *
 * @author DAVID
 */
@Named(value = "metodosBeans")
@Dependent
public class MetodosBeans {
   
    @Inject
    private UsuarioBeans usu;
   

    public MetodosBeans() {
    }
    
    public ArrayList<UsuarioBeans> getListaUsu() throws SQLException{
        ArrayList<UsuarioBeans> data=new ArrayList<>();
        ConexionDB cn=new ConexionDB();
        try {
            Statement sql=cn.getConexion().createStatement();
            ResultSet rs=(ResultSet) sql.executeQuery("select * from usuarios");
            while(rs.next()){
                UsuarioBeans u=new UsuarioBeans(rs.getString(1),rs.getString(2),                
                rs.getString(3),rs.getString(4),rs.getString(5));
                
                data.add(u);
            }
        
        
        }catch(Exception e){        }
        
        return data;
    }
    
    public void insertar(){
        ConexionDB cn=new ConexionDB();
        try{
            PreparedStatement psta=cn.getConexion().
                    prepareStatement("insert into usuarios values(?,?,?,?,?)");
            psta.setString(1,usu.getCodUsu());
            psta.setString(2,usu.getNombre());
            psta.setString(3,usu.getPerfil());
            psta.setString(4,usu.getCorreo());
            psta.setString(5,usu.getPass());
            psta.executeUpdate();
        }catch(Exception e){}
    
    
    }
    public void eliminar(){
        ConexionDB cn=new ConexionDB();
        try{
            PreparedStatement psta=cn.getConexion().
                    prepareStatement("delete from usuarios where codusu=?");
            psta.setString(1,usu.getCodUsu());            
            psta.executeUpdate();
        }catch(Exception e){}
    
    
    }
}
