/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;

/**
 *
 * @author julit
 */
public class persona {
    private int id = -1;
    private String nombre;
    private int dni;
    private long celular;
    
    public persona()
    {
        this.id = -1;
    }

    public persona(int dni) {
        this.dni = dni;
    }
    
    
    
    public persona(String nombre, int dni, long celular)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public long getCelular() {
        return celular;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
}
