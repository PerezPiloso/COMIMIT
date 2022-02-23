
package edu.eci.pdsw.samples.entities;


import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Paciente {
    
    private int id;
    private String tipoId;
    private String nombre;
    private Date fechaNacimiento;
    Set<Consulta> consultas=new LinkedHashSet<>();;
    private Eps eps;
    

    public Paciente(int id,String tipoid, String nombre, Date fechaNacimiento,Eps eps) {
        this.id = id;
        this.tipoId = tipoid;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        consultas=new LinkedHashSet<>();
        this.eps=eps;
    }

    public Paciente(){
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Eps getEps(){
        return eps;
    }

    public void setEps(Eps eps){
        this.eps = eps;
    }
    
    
    public String getTipoId(){
        return tipoId;
    }

    public void setTipoId(String tipoId){
        this.tipoId = tipoId;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public Set<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(Set<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        String rep="Paciente:["+id+","+tipoId+","+nombre+","+fechaNacimiento+"]\n";
        for (Consulta c:consultas){
            rep+="\t["+c+"]\n";
        }
        return rep;
    }
    
    
    
}
