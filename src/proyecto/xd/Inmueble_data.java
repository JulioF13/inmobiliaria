/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import proyecto.xd.*;
import proyecto.xd.Inmueble;
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
            String sql = "DELETE FROM inmueble WHERE direccion = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, inmueble1.getDireccion());
            
            statement.executeUpdate();
            
            
        }
        catch(Exception ex)
        {
            System.out.println("Error al borrar un inmueble: " + ex.getMessage());
        }        
    }
    
    public void actualizarInmueble(Inmueble inmueble1, String direccion, int cantAmbientes, int costo, int disponibilidad, String direcciona)
    {
        try
        {
        String sql = "UPDATE inmueble SET direccion = ?, cantAmbientes = ?, costo = ?, disponibilidad = ? WHERE direccion = ?;";
        
        PreparedStatement ps = connection.prepareStatement(sql);
        
        ps.setString(1, direccion);
        ps.setInt(2, cantAmbientes);
        ps.setInt(3, costo);
        ps.setInt(4, disponibilidad);
        ps.setString(5, direcciona);
        
        ps.executeUpdate();
      }
        catch(Exception ex)
        {
            System.out.println("Error al actualizar inmueble: " + ex.getMessage());
        }
    }
    
    public List<Inmueble> obtenerInmuebles()
    {
        List<Inmueble> inmuebles = new ArrayList<Inmueble>();
        
        try
        {
            String sql = "SELECT * FROM inmueble;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inmueble inmueble1;
            
            while(rs.next())
            {
                inmueble1 = new Inmueble();
                inmueble1.setId(rs.getInt("id"));
                inmueble1.setDireccion(rs.getString("direccion"));
                inmueble1.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueble1.setCosto(rs.getInt("costo"));
                inmueble1.setDisponibilidad(rs.getInt("disponibilidad"));
                
                inmuebles.add(inmueble1);
            }
            ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error al listar inmuebles: " + e.getMessage());
        }
        return inmuebles;
    }
    
    public List<Inmueble> obtenerInmueblesPorFiltro(String filtro, String busqueda)
    {
        List<Inmueble>inmuebles = new ArrayList<Inmueble>();
        
        try
        {
           String sql = "SELECT * FROM inmueble WHERE "+filtro+" LIKE '%"+busqueda+"%';";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inmueble inmueblecito;
            
            while(rs.next())
            {
                inmueblecito = new Inmueble();
                inmueblecito.setId(rs.getInt("id"));
                inmueblecito.setDireccion(rs.getString("direccion"));
                inmueblecito.setCantAmbientes(rs.getInt("cantAmbientes"));
                inmueblecito.setCosto(rs.getInt("costo"));
               inmueblecito.setDisponibilidad(rs.getInt("disponibilidad"));
                
                inmuebles.add(inmueblecito);
            }
            ps.close();  
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        return inmuebles;
    }
}

