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
import vehiculos.Vehiculo;
import ventas.Venta;

/**
 *
 * @author Dax Sánchez
 */
public class Funcionalidad {

    public void funcionesCliente() {
        ProcesarCliente clientes = new ProcesarCliente();

        Cliente[] cliente = clientes();
        clientes.showClientes(cliente);

    }

    public void funcionesEmpleado() {
        ProcesarEmpleado p = new ProcesarEmpleado();
        Empleado[] empleados = empleados();
        p.mostrarEmpleado(empleados);

    }

    public void funcionesVehiculo() {
        Vehiculo[] vehiculos = vehiculos();
        vehiculos[0].obtenerInformacion(true);
    }

    private Empleado[] empleados() {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new AgenteDeSeguros(true, 300, 2134142, "Superior", 12000.00, "Arturo", "Bañuelos", "311-424-221");
        empleados[1] = new AnalistaRiesgos(2636363, "Analista experto", 18000.00, "Miguel", "Miramontes", "311-232-832", 34);
        empleados[1] = new AgenteDeSeguros(false, 100, 55235225, "Nuevo", 7000.00, "Samuel", "Gomez", "311-534-821");
        return empleados;
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

    public Vehiculo[] vehiculos() {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Vehiculo("RCV-454-ER3", "Toyota", "GR TOYOTA GAZOO RACING");
        vehiculos[1] = new Vehiculo("PLV-R32-FSD", "Verde", 2002);
        vehiculos[2] = new Vehiculo("PDA-GR3-G41", "suzuki", "FRONX BOOSTERGREEN ", "Rojo", 2012);
        return vehiculos;
    }

    public Venta[] ventas() {
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
