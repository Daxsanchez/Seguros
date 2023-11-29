package Persona;

import excepciones.ExcNumero;
import excepciones.ProcesarNumero;
import java.util.logging.Level;
import java.util.logging.Logger;
import leer.Leer;

/**
 *
 * @author rafae
 */
public class ProcesarEmpleado {

    public void mostrarEmpleado(Empleado[] empleado) {
        ProcesarNumero pNum = new ProcesarNumero();

        for (Empleado d : empleado) {
            try {
                pNum.validarNum(d.getSalario(), true);
            } catch (ExcNumero ex) {
                ex.errorNumNegativo();
                d.setSalario(Leer.leerDouble("Ingrese un valor positivo: "));
            }
            Leer.showDatos(d.getData());
            Leer.showDatos(d.calcSueldo() + "");
        }

    }
}
