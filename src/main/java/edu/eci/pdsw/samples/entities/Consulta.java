
package edu.eci.pdsw.samples.entities;

import java.util.Date;


public class Consulta {
    //el identificador es asignado por la base de datos,
    //por eso no se incluye en el constructor.
    private int id;
    private Date fechayHora;
    private String resumen;
    private long costo;

    
    
    public Consulta(Date fechayHora, String resumen,long costo) {
        this.id=-1;
        this.fechayHora = fechayHora;
        this.resumen = resumen;
        this.costo=costo;
    }    
    
    public Consulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public void setFechayHora(Date fechayHora) {
        this.fechayHora = fechayHora;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }
    
    

    @Override
    public String toString() {
        return "("+id+","+fechayHora+","+resumen+")"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
