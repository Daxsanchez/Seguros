package Persona;

import excepciones.ExcClienteFrecuente;
import excepciones.ExcClienteLeal;
import excepciones.ExcClienteNuevo;
import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */
public class ProcesarCliente {

    public void showClientes(Cliente[] cliente) {
        for (Cliente d : cliente) {
            validarCliente(d);
            Leer.showDatos(d.getData());
        }
    }

    //Función para validar el tipo de cliente
    private void validarCliente(Cliente d) {
        try {
            if (d.getClass().equals(ClienteFrecuente.class)) {
                if (d.getAntiguedad() < 5 || d.getAntiguedad() > 10) {
                    throw new ExcClienteFrecuente();
                }
            } else if (d.getClass().equals(ClienteNuevo.class)) {
                if (d.getAntiguedad() > 5) {
                    throw new ExcClienteNuevo();
                }
            } else if (d.getClass().equals(ClienteLeal.class)) {
                if (d.getAntiguedad() < 10) {
                    throw new ExcClienteLeal();
                }
            }
        } catch (ExcClienteFrecuente | ExcClienteNuevo | ExcClienteLeal ex) {
            Leer.showDatos("INCORRECTO==>" + ex.getMessage());
            d.setAntiguedad(Leer.leerEntero("Vuelva a ingresar la antiguedad: "));
            //Recursividad para volver a evaluar el cliente
            validarCliente(d);
        }
    }
}
