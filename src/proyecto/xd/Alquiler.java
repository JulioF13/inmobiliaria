/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.xd;
import java.time.LocalDate;
/**
 *
 * @author julit
 */
public class Alquiler {
    private int id = -1;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int costo;
    private long id_inmueble;
    private long id_persona;

    public Alquiler() {
        this.id = -1;
    }

    public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, int costo, long id_inmueble, long id_persona) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.id_inmueble = id_inmueble;
        this.id_persona = id_persona;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getCosto() {
        return costo;
    }

    public long getId_inmueble() {
        return id_inmueble;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setId_inmueble(long id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }
    
}
