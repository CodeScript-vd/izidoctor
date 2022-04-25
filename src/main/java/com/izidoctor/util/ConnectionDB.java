package com.izidoctor.util;

import com.mysql.cj.jdbc.ConnectionImpl;
import java.sql.DriverManager;

public class ConnectionDB {

    public static ConnectionImpl getConnection() {
        ConnectionImpl cnx = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String cadena = "jdbc:mysql://localhost/izidoctor?user=root&password=root";
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
