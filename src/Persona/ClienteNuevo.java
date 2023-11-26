/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author rafae
 */
public class ClienteNuevo extends Cliente {

    public ClienteNuevo(String nombre, String apellido, String numTelefonon, int antiguedad) {
        super(nombre, apellido, numTelefonon, antiguedad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Nuevo").append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

    public String getData() {
        tipoCliente(super.getAntiguedad());
        return toString();

    }

    private void tipoCliente(int antiguedad) {
        if (antiguedad < 5) {
            System.out.println("Este es un tipo De cliente nuevo por tener 0 meses de antiguedad" + "\n");
        }

    }

}
