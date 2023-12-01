package Principal;

import Persona.ClienteFrecuente;
import Persona.ClienteLeal;
import Persona.ClienteNuevo;
import Persona.ProcesarCliente;

/**
 *
 * @author Dax Sánchez
 */
public class Funcionalidad {

    public void pruebasCliente() {
        ClienteFrecuente[] c = new ClienteFrecuente[2];

        c[0] = new Persona.ClienteFrecuente("Ruffino", "Perez", "311567908", 2);
        c[1] = new Persona.ClienteFrecuente("Pedro", "Perez", "311567908", 5);
        ProcesarCliente p = new ProcesarCliente();

        p.showClientes(c);

        Persona.ClienteNuevo[] clienteNuevo = new ClienteNuevo[2];
        clienteNuevo[0] = new ClienteNuevo("Pedro", "Macias", "311-532-643", 7);
        clienteNuevo[1] = new ClienteNuevo("Edgar", "Soto", "311-632-243", 3);
        p.showClientes(clienteNuevo);

        Persona.ClienteLeal[] clienteLeal = new ClienteLeal[2];
        clienteLeal[0] = new ClienteLeal("Ernesto Lopez", "Mateos", "311-234-242", 12);
        clienteLeal[1] = new ClienteLeal("José", "Huerta", "311-532-532", 10);

        p.showClientes(clienteLeal);
    }
}
