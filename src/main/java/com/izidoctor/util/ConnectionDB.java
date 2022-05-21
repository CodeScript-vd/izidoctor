package com.izidoctor.util;

import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.DriverManager;

public class ConnectionDB {

    public static ConnectionImpl getConnection() {
        ConnectionImpl cnx = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String cadena = "jdbc:mysql://desa-web-integrado.mysql.database.azure.com:3306/izidoctor?user=mysqlusr&password=X8MQ*sWvEQ4Uu692&useSSL=true";
            cnx = (ConnectionImpl) DriverManager.getConnection(cadena);
            System.out.println("Conexion OK");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return cnx;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        getConnection();
    }
}
