package Persona;

import excepciones.ExcClienteFrecuente;
import excepciones.ExcClienteLeal;
import excepciones.ExcClienteNuevo;
import leer.Leer;

/**
 *
 * @author rafae
 */
public class ProcesarClienteFrecuente {

    public void showClientes(Cliente[] cliente) {
        for (Cliente d : cliente) {

            try {

                clienteFrecuente(d);

            } catch (ExcClienteFrecuente ex) {
                Leer.showDatos("INCORRECTO==>" + ex.getMessage());
            }
            Leer.showDatos(d.getData());
        }
    }

    private void clienteFrecuente(Cliente d) throws ExcClienteFrecuente {
        if (d.getAntiguedad() < 4 || d.getAntiguedad() > 10) {
            throw new ExcClienteFrecuente();
        }
    }

}
