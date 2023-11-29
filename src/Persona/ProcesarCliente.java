package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class ProcesarCliente {

    public void showClientes(Cliente[] cliente) {
        for (Cliente d : cliente) {
            Leer.showDatos(d.getData());
        }
    }

}
