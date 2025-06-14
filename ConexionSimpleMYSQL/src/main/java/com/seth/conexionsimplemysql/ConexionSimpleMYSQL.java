/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.seth.conexionsimplemysql;

import java.sql.*;

/**
 *
 * @author seth
 */
public class ConexionSimpleMYSQL {

    public static void main(String[] args) {
       
        // Cadena de conexión de MYSQL
        String cadenaConexion = "jdbc:mysql://localhost:3306/dbTiendaVideoJuegos?useUnicode=true& useJDBCCompliantTimezoneShift=true& useLegacyDatetimeCode=false&serverTimezone=UTC& useSSL=false";
        
        //Cargar el driver
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            //crear la conexion en un objeto
            Connection conexion = (Connection)DriverManager.getConnection(cadenaConexion,"root","1234");
            
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        
    }
}
