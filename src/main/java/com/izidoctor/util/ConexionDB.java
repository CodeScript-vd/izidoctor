/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.izidoctor.util;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author DAVID
 */
public class ConexionDB {
    public static Connection getConexion(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/semana6?user=root&password=");
            System.out.println("Conexion satisfactoria");
            
        }catch(Exception e){
            System.out.println("Error Conexion:  "+e);
        }
        return con;
    }
     public static void main(String[] args) {
        // TODO code application logic here
        getConexion();
        
   
    }
}
