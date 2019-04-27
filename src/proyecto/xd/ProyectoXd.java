/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.xd;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import Vistas.ventanaPrincipal;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;*/
/**
 *
 * @author julit
 */
public class ProyectoXd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            
            persona p = new persona();
            p.se
        
            persona_data personadata = new persona_data(cn);
            personadata.borrarPersona(p);
            
            
       
       ventanaPrincipal vp = new ventanaPrincipal();
       
       vp.setVisible(true);
    }
        catch(Exception ex)
        {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        
        */
        
        ventanaPrincipal vp = new ventanaPrincipal();
       
       vp.setVisible(true);
}
}
