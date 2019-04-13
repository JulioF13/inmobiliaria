/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.sql.*;
import java.sql.Date;
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
            String sql = "INSERT INTO alquiler (fechaInicio, fechaFin, costo, id_inmueble, id_persona) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(alquiler1.getFechaInicio()));
            ps.setDate(2, Date.valueOf(alquiler1.getFechaFin()));
            ps.setInt(3, alquiler1.getCosto());
            ps.setLong(4, alquiler1.getId_inmueble());
            ps.setLong(5, alquiler1.getId_persona());
            
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
            String sql = "DELETE FROM alquiler WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, alquiler1.getId());
            
            ps.executeUpdate();
            
        }
        catch(Exception ex)
        {
            System.out.println("Error al borrar un inmueble: " + ex.getMessage());
        }
    }
    
    public void actualizarAlquiler(Alquiler alquiler1)
    {
        try
        {
            String sql = "UPDATE alquiler SET fechaInicio = ?, fechaFin = ?, costo = ?, id_inmueble = ?, id_persona = ? WHERE id = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setDate(1, Date.valueOf(alquiler1.getFechaInicio()));
            ps.setDate(2, Date.valueOf(alquiler1.getFechaFin()));
            ps.setInt(3, alquiler1.getCosto());
            ps.setLong(4, alquiler1.getId_inmueble());
            ps.setLong(5, alquiler1.getId_persona());
            ps.setInt(6, alquiler1.getId());
                    
            ps.executeUpdate();       
                    
        }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar un inmueble: " + ex.getMessage());
        }
    }
}
