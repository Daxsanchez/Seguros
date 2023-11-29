package Principal;

import Persona.AnalistaRiesgos;
import Persona.Cliente;
import Persona.ClienteFrecuente;
import Renovaciones.RenovacionEstandar;
import Renovaciones.RenovacionPlus;
import Seguros.SeguroColision;
import archivos.ArchivoBin;
import java.util.Date;
import vehiculos.Vehiculo;
import ventas.ProcesarVenta;
import ventas.Venta;

/**
 *
 * @author Dax Sánchez
 */
public class Main {

    public static void main(String[] args) {
        SeguroColision segu = new SeguroColision(4, "DJNAS3", new Date(), new Date(), true, "PRUEBA", 5000.0, 10000.0);
        RenovacionEstandar renoEstan = new RenovacionEstandar("Fomg56", new Date(), segu, "EFECTIVO");
        Cliente c1 = new ClienteFrecuente("Pedro", "Sanchez", "311432543", 3);
        RenovacionPlus renoPlus = new RenovacionPlus("F55DSfdsfsd", new Date(), segu, "Tarjeta", c1);
        //Prueba archivos de texto
        /*renoEstan.renovar();
        renoPlus.renovar();*/
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
        /*Vehiculo v1 = new Vehiculo("FDS34", "Hinda", "dsoafds");
        v1.guardarArchivoVehiculo();
        Vehiculo v2 = v1.getVehiculo();
        System.out.println(v2.toString());*/
    }
}
