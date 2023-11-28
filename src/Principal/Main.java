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
import ventas.Venta;

/**
 *
 * @author Dax Sánchez
 */
public class Main {

    public static void main(String[] args) {
        SeguroColision segu = new SeguroColision(4, "DJNAS3", new Date(), new Date(), true, "PRUEBA", 54.0, 43.0);
        RenovacionEstandar renoEstan = new RenovacionEstandar("Fomg56", new Date(), segu, "EFECTIVO");
        Cliente c1 = new ClienteFrecuente("Pedro", "Sanchez", "311432543", 5);
        RenovacionPlus renoPlus = new RenovacionPlus("F55DS", new Date(), segu, "Tarjeta", c1);
        renoEstan.renovar();
        renoPlus.renovar();
        AnalistaRiesgos ar = new AnalistaRiesgos(5, "Gerente", 500.0, "Pedro","Sanchez", "4353443", 5);
        Vehiculo v1 = new Vehiculo();
        Venta venta = new Venta(5, new Date(), c1, ar, v1, 900.0, segu);
        venta.calcVenta();
        Venta v2 = venta.getVenta();
        System.out.println(v2.toString());
        /*Archivo archivo = new Archivo("prueba.csv", "PRUEBA");
        archivo.escribrir("PRUEBA DE ESCRITURA EN EL ARCHIVO, RSENFJDNFDS, IJSFIDSN");*/
    }
}
