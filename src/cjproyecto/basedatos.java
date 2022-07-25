/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjproyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Carlos Sanchez Nuñez
 */
public class basedatos extends alimentos {
    
    //Metodo mostrar dietas segun numero indicado
    public String listar (double cc){
          int i=0;
        String linea ="";
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectocj","root","");
                String sql = "select * from dietas where calorias=" + cc;
                Statement sentencia =conexion.createStatement();
                ResultSet resultado = sentencia.executeQuery(sql);
                
                while (resultado.next()){     
                    if (cc == cc){
                    linea = linea + ("Dieta: \t" + resultado.getString(1) + "\n" +
                                    "Calorias: \t" + resultado.getString(2)+ " kCal" + "\n" +
                                    "Desayuno: \t" + resultado.getString(3) + "\n" +
                                    "Mediodia: \t" + resultado.getString(4) + "\n" + 
                                    "Almuerzo: \t" + resultado.getString(5) + "\n" + 
                                    "Merienda: \t" + resultado.getString(6) + "\n" + 
                                    "Cena: \t" + resultado.getString(7) + "\n");
                    }               
                  
                    else{
                        JOptionPane.showMessageDialog(null, 
                        "Introduce una cantidad de calorias correcta", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }             
                sentencia.close();
                conexion.close();
                                
          } catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(basedatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return linea;
    }
    
    //Mostrar dietas totales
    public String listardietas (){
          int i=0;
        String linea ="";
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/proyectocj","root","");
                String sql = "select * from dietas";
                Statement sentencia =conexion.createStatement();
                ResultSet resultado = sentencia.executeQuery(sql);
                
                while (resultado.next()){         
                    linea = linea +("Dieta: \t" + resultado.getString(1) + "\n" +
                                    "Calorias: \t" + resultado.getString(2)+ " kCal\n");

                }
               
                sentencia.close();
                conexion.close();
                                
          } catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(basedatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return linea;
    }
     
     
     
     
     
     
     
     
}