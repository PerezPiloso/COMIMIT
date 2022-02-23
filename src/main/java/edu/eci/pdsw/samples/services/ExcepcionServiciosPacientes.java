
package edu.eci.pdsw.samples.services;

public class ExcepcionServiciosPacientes extends Exception {

    public ExcepcionServiciosPacientes() {
    }

    public ExcepcionServiciosPacientes(String message) {
        super(message);
    }

    public ExcepcionServiciosPacientes(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionServiciosPacientes(Throwable cause) {
        super(cause);
    }
    
}
