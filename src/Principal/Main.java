package Principal;

import Persona.AgenteDeSeguros;
import Persona.AnalistaRiesgos;
import Persona.Empleado;
import Persona.ProcesarCliente;
import Persona.ProcesarEmpleado;
import Renovaciones.RenovacionEstandar;
import Seguros.Seguro;
import Seguros.SeguroColision;
import archivos.Archivo;
import excepciones.ProcesarNumero;
import java.util.Date;

/**
 *
 * @author Dax Sánchez
 */
public class Main {

    public static void main(String[] args) {
        SeguroColision segu = new SeguroColision(4, "DJNAS3", new Date(), new Date(), true, "PRUEBA", 54.0, 43.0);
        RenovacionEstandar renoEstan = new RenovacionEstandar("Fomg56", new Date(), segu, "EFECTIVO");
        renoEstan.renovar();
        /*Archivo archivo = new Archivo("prueba.csv", "PRUEBA");
        archivo.escribrir("PRUEBA DE ESCRITURA EN EL ARCHIVO, RSENFJDNFDS, IJSFIDSN");*/
    }
}
