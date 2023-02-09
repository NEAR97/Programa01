/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa01;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author braum
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "postgres";
    String password = "123456"; 
    String bd = "ejemplo";
    String ip = "localhost";
    String port = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+port+"/"+bd;
    
    public Connection establecerConexion(){
        
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, password);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar" + e.toString());
        }
        return conectar;
    }
}
