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
public class ClienteFrecuente extends Cliente {

    public ClienteFrecuente(String nombre, String apellido, String numTelefonon, int antiguedad) {
        super(nombre, apellido, numTelefonon, antiguedad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Frecuente").append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    public String getData() {
        tipoCliente(super.getAntiguedad());
        return toString();
    }

    //Condicion Cliente Frecuente por tener de 4 a 9 años
    private void tipoCliente(int antiguedad) {
        if (antiguedad > 4 && antiguedad < 10) {

            Leer.showDatos("Este es un tipo De cliente Frecuente por tener" + getAntiguedad() + "de antiguedad" + "\n");

        }

    }

    @Override
    public double calcDeducible(double deducible) {
        char tipoCliente = 'Z';
        if (getAntiguedad() > 4 && getAntiguedad() < 10) {
            tipoCliente = 'F';

        }
        return tipoCliente;
    }
}
