package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class ClienteNuevo extends Cliente {

    private static boolean mensajeMostrado = false;

    public ClienteNuevo(String nombre, String apellido, String numTelefonon, int antiguedad) {
        super(nombre, apellido, numTelefonon, antiguedad);
        if (!mensajeMostrado) {
            Leer.showDatos("==El TIPO CLIENTE FRECUENTE ES MENOR A 5 AÑOS==");
            mensajeMostrado = true; // Marcar que el mensaje ha sido mostrado
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Nuevo").append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

    public String getData() {
        return toString();

    }

    @Override
    public int getCliente() {
        tipoCliente(getAntiguedad());
        return getAntiguedad();
    }

    //Condicion Cliente Nuevo menor a 5 años
    private void tipoCliente(int antiguedad) {
        if (antiguedad < 5) {
            Leer.showDatos("Este es un tipo De cliente nuevo por tener" + getAntiguedad() + "de antiguedad" + "\n");
        }

    }

}
