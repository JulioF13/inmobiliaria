/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author julit
 */
public class Alquiler_data {
    private Connection connection = null;
    
    public Alquiler_data(Conexion conexion) {
        try
        {
            connection = conexion.getConexion();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void insertarAlquiler(Alquiler alquiler1)
    {
        try
        {
            String sql = "INSERT INTO alquiler (Nombre, fechaInicio, fechaFin, costo, id_inmueble, id_persona) VALUES (? ,?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, alquiler1.getNombre());
            ps.setDate(2, Date.valueOf(alquiler1.getFechaInicio()));
            ps.setDate(3, Date.valueOf(alquiler1.getFechaFin()));
            ps.setInt(4, alquiler1.getCosto());
            ps.setLong(5, alquiler1.getId_inmueble());
            ps.setLong(6, alquiler1.getId_persona());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
             if (rs.next())
        {
            alquiler1.setId(rs.getInt(1));
        }
        else
        {
            System.out.println("No se pudo obtener el id luego de insertar un alquiler");
        }
        ps.close();
        }
        
        catch(Exception ex)
        {
           System.out.println("Error al insertar un alquiler: " + ex.getMessage());
        }
    }
    
    public void borrarAlquiler(Alquiler alquiler1)
    {
        try
        {
            String sql = "DELETE FROM alquiler WHERE Nombre = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, alquiler1.getNombre());
            
            ps.executeUpdate();
            
        }
        catch(Exception ex)
        {
            System.out.println("Error al borrar un inmueble: " + ex.getMessage());
        }
    }
    
    public void actualizarAlquiler(Alquiler alquiler1, String Nombre, LocalDate fechaInicio, LocalDate fechaFin, int costo, int id_persona, int id_inmueble, String Nombrea)
    {
        try
        {
            String sql = "UPDATE alquiler SET Nombre = ?, fechaInicio = ?, fechaFin = ?, costo = ?, id_inmueble = ?, id_persona = ? WHERE Nombre = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, Nombre);
            ps.setDate(2, Date.valueOf(fechaInicio));
            ps.setDate(3, Date.valueOf(fechaFin));
            ps.setInt(4, costo);
            ps.setLong(5, id_persona);
            ps.setLong(6, id_inmueble);
            ps.setString(7, Nombrea);
                    
            ps.executeUpdate();       
                    
        }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar un inmueble: " + ex.getMessage());
        }
    }
}
