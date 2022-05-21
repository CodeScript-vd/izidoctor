package com.izidoctor.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DAVID
 */
public class ConnectionDB {
public Connection getConnection()  {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //con=DriverManager.getConnection("jdbc:mysql://desa-web-integrado.mysql.database.azure.com:3306/izidoctor?user=mysqlusr&password=X8MQ*sWvEQ4Uu692&useSSL=true");
            con=DriverManager.getConnection("jdbc:mysql://localhost/izidoctor?user=root&password=");
            
            System.out.println("Conexion satisfactoria");
            
        }catch(Exception e){
            System.out.println("Error Conexion:  "+e);
        }
        return con;
    }

    public static void main(String[] args) {
        ConnectionDB cn = new ConnectionDB();
        cn.getConnection();
        
   
    }
    
}
