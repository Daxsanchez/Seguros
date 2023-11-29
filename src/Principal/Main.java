package Principal;

import Persona.AnalistaRiesgos;
import Persona.Cliente;
import Persona.ClienteFrecuente;
import Persona.ClienteLeal;
import Persona.ClienteNuevo;
import Persona.ProcesarClienteFrecuente;
import Persona.ProcesarClienteLeal;
import Persona.ProcesarClienteNuevo;
import Renovaciones.RenovacionEstandar;
import Renovaciones.RenovacionPlus;
import Seguros.SeguroColision;
import archivos.ArchivoBin;
import java.util.Date;
import vehiculos.Vehiculo;
import ventas.ProcesarVenta;
import ventas.Venta;

public class Main {

    public static void main(String[] args) {

        /* SeguroColision segu = new SeguroColision(4, "DJNAS3", new Date(), new Date(), true, "PRUEBA", 5000.0, 10000.0);
        RenovacionEstandar renoEstan = new RenovacionEstandar("Fomg56", new Date(), segu, "EFECTIVO");
        Cliente c1 = new ClienteFrecuente("Pedro", "Sanchez", "311432543", 3);
        RenovacionPlus renoPlus = new RenovacionPlus("F55DSfdsfsd", new Date(), segu, "Tarjeta", c1);
       // Prueba archivos de texto
        //*renoEstan.renovar();
        renoPlus.renovar();
  Vehiculo v1 = new Vehiculo("FDS34", "Hinda", "dsoafds");
        AnalistaRiesgos ar = new AnalistaRiesgos(5, "Gerente", 500.0, "Pedro", "Sanchez", "4353443", 5);

        Venta[] ventas = new Venta[3];

        ventas[0] = new Venta(5, new Date(), c1, ar, v1, 11000.0, segu);
        ventas[1] = new Venta(5, new Date(), c1, ar, v1, 6000.0, segu);
        ventas[2] = new Venta(5, new Date(), c1, ar, v1, 15000.0, segu);

        ProcesarVenta pv = new ProcesarVenta();
        pv.totalVentasSeguros(ventas);
        pv.totalPagoAseguradora(ventas);

        //Prueba archivos binarios
        //Vehiculo v1 = new Vehiculo("FDS34", "Hinda", "dsoafds");
        v1.guardarArchivoVehiculo();
        Vehiculo v2 = v1.getVehiculo();
        System.out.println(v2.toString());*/
        ClienteFrecuente[] c = new ClienteFrecuente[2];

        c[0] = new Persona.ClienteFrecuente("Ruffino", "Perez", "311567908", 4);
        c[1] = new Persona.ClienteFrecuente("Ruffino", "Perez", "311567908", 5);
        ProcesarClienteFrecuente p = new ProcesarClienteFrecuente();

        p.showClientes(c);

        Persona.ClienteNuevo[] clienteNuevo = new ClienteNuevo[2];
        clienteNuevo[0] = new ClienteNuevo("Pedro", "Macias", "311-532-643", 1);
        clienteNuevo[1] = new ClienteNuevo("Edgar", "Soto", "311-632-243", 5);
        Persona.ProcesarClienteNuevo n = new ProcesarClienteNuevo();
        n.showClientes(clienteNuevo);

        Persona.ClienteLeal[] clienteLeal = new ClienteLeal[2];
        clienteLeal[0]=new ClienteLeal("Ernesto Lopez", "Mateos", "311-234-242", 12);
        clienteLeal[1]=new ClienteLeal("José", "Huerta", "311-532-532", 9);
        
        Persona.ProcesarClienteLeal cl = new ProcesarClienteLeal();
        
        cl.showClientes(clienteLeal);
        

    }
}
