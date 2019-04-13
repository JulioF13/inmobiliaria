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
public class Inmueble {
    private int id = -1;
    private String direccion;
    private int cantAmbientes;
    private int costo;
    private int disponibilidad;

    public Inmueble() 
    {
        this.id = -1;
    }

    public Inmueble(String direccion, int cantAmbientes, int costo, int disponibilidad) {
        this.direccion = direccion;
        this.cantAmbientes = cantAmbientes;
        this.costo = costo;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantAmbientes() {
        return cantAmbientes;
    }

    public int getCosto() {
        return costo;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
    
}
