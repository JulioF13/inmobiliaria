/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
    
    public void actualizarAlquiler(Alquiler alquiler1, String Nombre, LocalDate fechaInicio, LocalDate fechaFin, int costo, int id_inmueble, int id_persona, int id)
    {
        try
        {
            String sql = "UPDATE alquiler SET Nombre = ?, fechaInicio = ?, fechaFin = ?, costo = ?, id_inmueble = ?, id_persona = ? WHERE id = ?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, Nombre);
            ps.setDate(2, Date.valueOf(fechaInicio));
            ps.setDate(3, Date.valueOf(fechaFin));
            ps.setInt(4, costo);
            ps.setLong(5, id_inmueble);
            ps.setLong(6, id_persona);
            ps.setInt(7, id);
                    
            ps.executeUpdate();       
                    
        }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar un alquiler: " + ex.getMessage());
        }
    }
    
    public List<Alquiler> obtenerAlquileres()
    {
        List<Alquiler> alquileres = new ArrayList<Alquiler>();
        
        try
        {
            String sql = "SELECT * FROM alquiler;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Alquiler alquiler1;
            
            while(rs.next())
            {
                   alquiler1 = new Alquiler();
                   alquiler1.setId(rs.getInt("id"));
                   alquiler1.setNombre(rs.getString("Nombre"));
                   alquiler1.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                   alquiler1.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                   alquiler1.setCosto(rs.getInt("costo"));
                   alquiler1.setId_persona(rs.getInt("id_persona"));
                   alquiler1.setId_inmueble(rs.getInt("id_inmueble"));

                   alquileres.add(alquiler1);
            }
            ps.close();
    }
        catch(Exception e)
        {
            System.out.println("Error al listar inmuebles: " + e.getMessage());
        }
        return alquileres;
}
    
    public List<Alquiler> obtenerAlquileresPorFiltro(String filtro, String busqueda)
    {
        List<Alquiler>alquileres = new ArrayList<Alquiler>();
        
        try
        {
           String sql = "SELECT * FROM alquiler WHERE "+filtro+" LIKE '%"+busqueda+"%';";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Alquiler alquilercito;
            
            while(rs.next())
            {
                alquilercito = new Alquiler();
                alquilercito.setId(rs.getInt("id"));
                alquilercito.setNombre(rs.getString("Nombre"));
                alquilercito.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                alquilercito.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                alquilercito.setCosto(rs.getInt("costo"));
                alquilercito.setId_inmueble(rs.getLong("id_inmueble"));
                alquilercito.setId_persona(rs.getLong("id_persona"));
                
                alquileres.add(alquilercito);
            }
            ps.close();  
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        return alquileres;
    }
}
