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
import Persona.AgenteDeSeguros;
import Persona.AnalistaRiesgos;
import Persona.Empleado;
import Persona.ProcesarEmpleado;
import leer.Leer;
import vehiculos.Vehiculo;
import ventas.ProcesarVenta;
import ventas.Venta;

/**
 *
 * @author Dax Sánchez
 */
public class Funcionalidad {

    public void funcionesCliente() {
        ProcesarCliente procesarCliente = new ProcesarCliente();

        Cliente[] clientes = clientes();
        procesarCliente.showClientes(clientes);
    }

    public void funcionesEmpleado() {
        ProcesarEmpleado p = new ProcesarEmpleado();
        Empleado[] empleados = empleados();
        p.mostrarEmpleado(empleados);

    }

    public void funcionesVehiculo() {
        //Sobrecarga de métodos
        Vehiculo[] vehiculos = vehiculos();
        vehiculos[1].obtenerInformacion();
        vehiculos[0].obtenerInformacion(true);
        //Crear archivo binario
        vehiculos[2].guardarArchivoVehiculo();
        //Obtener archivo binario
        Vehiculo v = vehiculos[2].getVehiculoArchivo();
        Leer.showDatos(v.toString());
    }

    //Reporte de informe de seguros
    public void funcionesSeguros() {
        Seguro[] seguros = seguros();
        seguros[0].informe();
    }

    //Uso de archivos txt
    public void funcionesRenovaciones() {
        Renovacion[] renovaciones = renovaciones();
        //Renovación estándar
        double precioRenovacion = renovaciones[0].renovar();
        Leer.showDatos("El precio de la renovación " + renovaciones[0].getClass().getSimpleName()
                + " es: " + precioRenovacion);
        renovaciones[0].showArchivoRenovacion();
        //Renovación plus
        precioRenovacion = renovaciones[1].renovar();
        Leer.showDatos("El precio de la renovación " + renovaciones[1].getClass().getSimpleName()
                + " es: " + precioRenovacion);
        renovaciones[1].showArchivoRenovacion();
    }

    public void funcionesVentas() {
        ProcesarVenta procesarVenta = new ProcesarVenta();
        Venta[] ventas = ventas();
        //Muestra el total de todas las ventas
        procesarVenta.totalVentasSeguros(ventas);
        //Total a pagar por la aseguradora si hay un accidente
        //Solo se llamará a este método cuando haya un accidente en todas las ventas
        procesarVenta.totalPagoAseguradora(ventas);
    }

    private Empleado[] empleados() {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new AgenteDeSeguros(true, 300, 2134142, "Superior", 12000.00, "Arturo", "Bañuelos", "311-424-221");
        empleados[1] = new AnalistaRiesgos(2636363, "Analista experto", 18000.00, "Miguel", "Miramontes", "311-232-832", 34);
        empleados[2] = new AgenteDeSeguros(false, 100, 55235225, "Nuevo", -7000.00, "Samuel", "Gomez", "311-534-821");
        return empleados;
    }

    private Seguro[] seguros() {
        Seguro[] seguros = new Seguro[3];
        seguros[0] = new SeguroColision(5, "10014313", "01-12-2023", "05-07-2026", true,
                "Seguro contra daños de colisión", 9000.0, 100000.0);
        seguros[1] = new SeguroResponsabilidadCivil("Auto y pavimento", "0124321", "01-12-2023",
                "30-11-2025", false, "Seguro contra daños a terceros", 10000.0, 150000.0);
        seguros[2] = new SeguroRobo(4, "01247686", "01-12-2023", "05-06-2030", true,
                "Seguro contra robo", 6000.0, 50000.0);
        return seguros;
    }

    private Renovacion[] renovaciones() {
        Renovacion[] renovaciones = new Renovacion[3];
        Seguro[] seguros = seguros();
        Cliente[] clientes = clientes();
        renovaciones[0] = new RenovacionEstandar("543", "01-12-2023", seguros[0], "Efectivo");
        renovaciones[1] = new RenovacionPlus("952", "01-12-2023", seguros[1], "Tarjeta", clientes[0]);
        renovaciones[2] = new RenovacionPlus("368", "01-12-2023", seguros[2], "Transferencia", clientes[1]);
        return renovaciones;
    }

    private Cliente[] clientes() {
        Cliente[] clientes = new Cliente[3];
        clientes[0] = new ClienteNuevo("Juan", "Sánchez", "311-356-2443", 3);
        //Cliente con una antigüedad no correcta para generar error
        clientes[1] = new ClienteFrecuente("Pedro", "López", "311-343-3254", 2);
        clientes[2] = new ClienteLeal("Edgar ", "Soto", "311-354-2323", 11, 'M', "edgsoto@gmail.com");
        return clientes;
    }

    private Vehiculo[] vehiculos() {
        //Sobrecarga de constructores
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("RCV-454-ER3", "Toyota", "GR TOYOTA GAZOO RACING");
        vehiculos[1] = new Vehiculo("PLV-R32-FSD", "Verde", 2002);
        vehiculos[2] = new Vehiculo("PDA-GR3-G41", "suzuki", "FRONX BOOSTERGREEN ", "Rojo", 2012);
        return vehiculos;
    }

    private Venta[] ventas() {
        Venta[] ventas = new Venta[3];
        Cliente[] clientes = clientes();
        Empleado[] empleados = empleados();
        Vehiculo[] vehiculos = vehiculos();
        Seguro[] seguros = seguros();

        ventas[0] = new Venta(4023, new Date(), clientes[0], empleados[0], vehiculos[0], 9000.0, seguros[0]);
        ventas[1] = new Venta(5354, new Date(), clientes[1], empleados[1], vehiculos[1], 11000.0, seguros[1]);
        ventas[2] = new Venta(8756, new Date(), clientes[2], empleados[2], vehiculos[2], 6000.0, seguros[2]);

        return ventas;
    }
}
