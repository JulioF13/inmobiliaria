/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author julit
 */
public class persona_data {
    private Connection connection = null;

    public persona_data(Conexion conexion) {
        try
        {
            connection = conexion.getConexion();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public void insertarPersona(persona persona1)
    {
        
        try {
            String sql = "INSERT INTO persona (nombre, DNI, celular) VALUES (?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
        statement.setString(1, persona1.getNombre());
        statement.setInt(2, persona1.getDni());
        statement.setInt(3, persona1.getCelular());
        
        statement.executeUpdate();
        
        ResultSet rs = statement.getGeneratedKeys();
        
        if (rs.next())
        {
            persona1.setId(rs.getInt(1));
        }
        else
        {
            System.out.println("No se pudo obtener el id luego de insertar una persona");
        }
        statement.close();
        }
        catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
    
    public void borrarPersona(persona persona1)
    {
        try
        {
            String sql = "DELETE FROM persona WHERE id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, persona1.getId());
            
            statement.executeUpdate();
            
        }
        catch(Exception ex)
        {
            System.out.println("Error al borrar una persona: " + ex.getMessage());
        }        
    }
    
    public void actualizarPersona(persona persona1, String nombre, int dni, int celular, int id)
    {
        try
        {
            String sql = "UPDATE persona SET nombre = ?, dni = ?, celular = ? WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setInt(2, dni);
            ps.setInt(3, celular);
            ps.setInt(4, id);
            
            ps.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar persona: " + ex.getMessage());
        }
    }
    
    public List<persona> obtenerPersonas()
    {
        List<persona> personas = new ArrayList<persona>();
        
        try
        {
            String sql = "SELECT * FROM persona;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            persona persona1;
            
            while(rs.next())
            {
                persona1 = new persona();
                persona1.setId(rs.getInt("id"));
                persona1.setNombre(rs.getString("nombre"));
                persona1.setCelular(rs.getInt("celular"));
                
                personas.add(persona1);
            }
            ps.close();
           
        }
        catch(Exception ex)
        {
            System.out.println("Error al listar persona: " + ex.getMessage());
        }
        return personas;
    }
    
}
