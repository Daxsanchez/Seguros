/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class ProcesarCliente {

    public void MostrarCliente(Cliente[] cliente) {
        for (Cliente d : cliente) {
            Leer.showDatos(d.getData());
            Leer.showDatos(d.calcDescuento(3) + "");

        }

    }

}
