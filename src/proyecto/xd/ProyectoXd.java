/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.xd;

import java.sql.*;

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
        
        try
        {
            Conexion cn = new Conexion("jdbc:mysql://localhost/inmobiliaria", "root", "");
            persona_data personadata = new persona_data(cn);
            Inmueble_data inmuebledata = new Inmueble_data(cn);
            
            Inmueble inmueble2 = new Inmueble("Ayacucho 325", 3, 3000000, 1);
            /**inmuebledata.insertarInmueble(inmueble2);
            */
            //inmuebledata.actualizarInmueble(inmueble2, "Pringles 268", 4, 5000000, 1, 5);
            
            /**inmueble2.setId(5);
            inmuebledata.borrarInmueble(inmueble2);
            */
            
            //persona b = new persona();
            /**persona c = new persona();
            *c.setId(5);
            *personadata.actualizarPersona(c, "Juanito Perez", 46638759, 265730987, 5);
            *System.out.println("Se ha actualizado la persona");
            */
            
            /**b.setId(2);
            *persona julio = new persona("Julio", 44718358, 7328793);
            *personadata.insertarPersona(julio);
            *System.out.println("La id del alumno es: " + julio.getId());
            
            
            *personadata.borrarPersona(b);
            */
            
            Inmueble i = new Inmueble("Belgrano 876", 3, 56000, 1);
            
            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
