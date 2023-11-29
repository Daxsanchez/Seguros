/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import excepciones.ExcClienteFrecuente;
import excepciones.ExcClienteLeal;
import excepciones.ExcClienteNuevo;
import leer.Leer;

/**
 *
 * @author rafae
 */
public class ProcesarCliente {

    public void MostrarCliente(Cliente[] cliente) {
        for (Cliente d : cliente) {

            try {
                clienteNuevo(d);
                clienteFrecuente(d);
                clienteLeal(d);
            } catch (ExcClienteNuevo|ExcClienteFrecuente|ExcClienteLeal ex) {
                Leer.showDatos("INCORRECTO==>"+ex.getMessage());
            }
            Leer.showDatos(d.getData());
            Leer.showDatos(d.calcDescuento(3) + "");

        }

    }

    private void clienteNuevo(Cliente d) throws ExcClienteNuevo, ExcClienteFrecuente, ExcClienteLeal {
        if (d.getAntiguedad() > 5) {
            throw new ExcClienteNuevo();
        }
    }

    private void clienteFrecuente(Cliente d) throws ExcClienteFrecuente {
        if (d.getAntiguedad() < 4 && d.getAntiguedad() > 10) {
            throw new ExcClienteFrecuente();
        }
    }

    private void clienteLeal(Cliente d) throws ExcClienteLeal {

        if (d.getAntiguedad() > 10) {
            throw new excepciones.ExcClienteLeal();
        }
    }

}
