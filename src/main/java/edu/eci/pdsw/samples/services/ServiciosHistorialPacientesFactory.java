
package edu.eci.pdsw.samples.services;

import com.google.inject.AbstractModule;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.pdsw.samples.services.impl.ServiciosPacientesMock;


public class ServiciosHistorialPacientesFactory {

    private static ServiciosHistorialPacientesFactory instance = new ServiciosHistorialPacientesFactory();

    private static Injector injector;

    public ServiciosHistorialPacientesFactory() {

        injector = createInjector(new AbstractModule() {

            @Override
            protected void configure() {
                bind(ServiciosPacientes.class).to(ServiciosPacientesMock.class);
            }

        }
        );

    }

    public ServiciosPacientes getServiciosPaciente() {
        return injector.getInstance(ServiciosPacientes.class);
    }

    public static ServiciosHistorialPacientesFactory getInstance() {
        return instance;
    }

}
