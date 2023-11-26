package Principal;

import Persona.AgenteDeSeguros;
import Persona.AnalistaRiesgos;
import Persona.Empleado;
import Persona.ProcesarCliente;
import Persona.ProcesarEmpleado;
import excepciones.ProcesarNumero;

/**
 *
 * @author Dax Sánchez
 */
public class Main {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new AgenteDeSeguros(true, 5, 1, "Gerente", 5000.0, "Juan", "Hernández", "311545345");
        empleados[1] = new AgenteDeSeguros(false, 21, 2, "Oficina", 4000.0, "Eduardo", "Sánchez", "1545345");
        empleados[2] = new AnalistaRiesgos(3, "Gerente", 3000.0, "Rodrigo", "López", "r43432", 5);
        
        ProcesarEmpleado pe = new ProcesarEmpleado();
        pe.mostrarEmpleado(empleados);
    }
}
