/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.sql.*;
/**
 *
 * @author julit
 */
public class Inmueble_data {
    private Connection connection = null;

    public Inmueble_data(Conexion conexion) {
        try
        {
            connection = conexion.getConexion();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void insertarInmueble(Inmueble inmueble1)
    {
        try
        {
            String sql = "INSERT INTO inmueble (direccion, cantAmbientes, costo, disponibilidad) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, inmueble1.getDireccion());
            ps.setInt(2, inmueble1.getCantAmbientes());
            ps.setInt(3, inmueble1.getCosto());
            ps.setInt(4, inmueble1.getDisponibilidad());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next())
        {
            inmueble1.setId(rs.getInt(1));
        }
        else
        {
            System.out.println("No se pudo obtener el id luego de insertar un inmueble");
        }
        ps.close();
        }
        catch (SQLException ex) {
            System.out.println("Error al insertar un inmueble: " + ex.getMessage());
        }
            
        }
    
    public void borrarInmueble(Inmueble inmueble1)
    {
        try
        {
            String sql = "DELETE FROM inmueble WHERE id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, inmueble1.getId());
            
            statement.executeUpdate();
            
            
        }
        catch(Exception ex)
        {
            System.out.println("Error al borrar un inmueble: " + ex.getMessage());
        }        
    }
    
    public void actualizarInmueble(Inmueble inmueble1, String direccion, int cantAmbientes, int costo, int disponibilidad, int id)
    {
        try
        {
        String sql = "UPDATE inmueble SET direccion = ?, cantAmbientes = ?, costo = ?, disponibilidad = ? WHERE id = ?;";
        
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1, direccion);
        ps.setInt(2, cantAmbientes);
        ps.setInt(3, costo);
        ps.setInt(4, disponibilidad);
        ps.setInt(5, id);
        
        ps.executeUpdate();
      }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar inmueble: " + ex.getMessage());
        }
    }
}
