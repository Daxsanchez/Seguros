package Persona;


import excepciones.ExcClienteNuevo;
import leer.Leer;

/**
 *
 * @author rafae
 */
public class ProcesarClienteNuevo {

    public void showClientes(Cliente[] cliente) {
        for (Cliente d : cliente) {

            try {
                clienteNuevo(d);

            } catch (ExcClienteNuevo ex) {
                Leer.showDatos("INCORRECTO==>" + ex.getMessage());
            }
            Leer.showDatos(d.getData());
        }
    }

    private void clienteNuevo(Cliente d) throws ExcClienteNuevo {
        if (d.getAntiguedad() > 5) {
            throw new ExcClienteNuevo();
        }
    }



}
