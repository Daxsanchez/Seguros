package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
//2.3- El cliente frecuente tiene 5 años de antigüedad, cuenta con nombre, apellidos y teléfono,
public class ClienteFrecuente extends Cliente {

    // Variable estática para rastrear si el mensaje se ha mostrado
    private static boolean mensajeMostrado = false;

    // Constructor de la clase ClienteFrecuente
    public ClienteFrecuente(String nombre, String apellido, String numTelefono, int antiguedad) {
        super(nombre, apellido, numTelefono, antiguedad);

        // Verificar si el mensaje no se ha mostrado y mostrarlo
        if (!mensajeMostrado) {
            Leer.showDatos("==El TIPO CLIENTE FRECUENTE ES DE 5 A 9 AÑOS==");
            mensajeMostrado = true; // Marcar que el mensaje ha sido mostrado
        }
    }

    // Método toString para representar la información del cliente frecuente
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Frecuente").append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    // Método para obtener información del cliente
    public String getData() {
        return toString();
    }

    // Método para obtener la antigüedad del cliente y mostrar un mensaje si es frecuente
    public int getCliente() {
        int antiguedad = getAntiguedad();
        calcCliente(antiguedad);
        return antiguedad;
    }

    // Método privado para calcular si el cliente es frecuente
    private void calcCliente(int antiguedad) {
        if (antiguedad >= 5 && antiguedad <= 9) {
            Leer.showDatos("Cliente de tipo Frecuente");
        }
    }
}
