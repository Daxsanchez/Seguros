package Principal;

import Persona.Cliente;
import Persona.ClienteFrecuente;
import Persona.ClienteLeal;
import Persona.ClienteNuevo;
import Persona.ProcesarCliente;
import Seguros.Seguro;
import Seguros.SeguroColision;
import Seguros.SeguroResponsabilidadCivil;
import Seguros.SeguroRobo;
import java.util.Date;
import Renovaciones.Renovacion;
import Renovaciones.RenovacionEstandar;
import Renovaciones.RenovacionPlus;

/**
 *
 * @author Dax Sánchez
 */
public class Funcionalidad {

    public void funcionesCliente() {
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

    public Seguro[] seguros() {
        Seguro[] seguros = new Seguro[3];
        seguros[0] = new SeguroColision(5, "10014313", new Date(), new Date(), true,
                "Seguro contra daños de colisión", 9000.0, 100000.0);
        seguros[1] = new SeguroResponsabilidadCivil("Auto y pavimento", "0124321", new Date(),
                new Date(), false, "Seguro contra daños a terceros", 10000.0, 150000.0);
        seguros[2] = new SeguroRobo(4, "01247686", new Date(), new Date(), true,
                "Seguro contra robo", 6000.0, 50000.0);
        return seguros;
    }

    public Renovacion[] renovaciones() {
        Renovacion[] renovaciones = new Renovacion[3];
        Seguro[] seguros = seguros();
        Cliente[] clientes = clientes();
        renovaciones[0] = new RenovacionEstandar("543", new Date(), seguros[0], "Efectivo");
        renovaciones[1] = new RenovacionPlus("952", new Date(), seguros[1], "Tarjeta", clientes[0]);
        renovaciones[2] = new RenovacionPlus("368", new Date(), seguros[2], "Transferencia", clientes[1]);
        return renovaciones;
    }

    public Cliente[] clientes() {
        Cliente[] clientes = new Cliente[3];
        clientes[0] = new ClienteNuevo("Juan", "Sánchez", "31135643", 3);
        clientes[1] = new ClienteFrecuente("Pedro", "López", "31134354", 7);
        clientes[2] = new ClienteLeal("Edgar", "Hernández", "311354565", 15);
        return clientes;
    }
}
