package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class ClienteFrecuente extends Cliente {

    public ClienteFrecuente(String nombre, String apellido, String numTelefonon, int antiguedad) {
        super(nombre, apellido, numTelefonon, antiguedad);
        while (super.getAntiguedad() < 4 || antiguedad > 9) {
            Leer.showDatos("La antigüedad para este cliente va de 4 a 9 años");
            super.setAntiguedad(Leer.leerEntero("Ingrese una antiguedad con estos rangos:"));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Frecuente").append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    public String getData() {
        return toString();
    }

    //Condicion Cliente Frecuente por tener de 5 a 9 años
}
