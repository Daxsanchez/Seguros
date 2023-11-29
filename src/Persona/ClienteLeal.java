package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class ClienteLeal extends Cliente {

    public ClienteLeal(String nombre, String apellido, String numTelefonon, int antiguedad) {
        super(nombre, apellido, numTelefonon, antiguedad);
        while (super.getAntiguedad() < 10) {
            Leer.showDatos("La antigüedad para este cliente va de 10 años en adelante");
            super.setAntiguedad(Leer.leerEntero("Ingrese una antiguedad con estos rangos:"));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Leal").append("\n");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public String getData() {
        tipoCliente(getAntiguedad());
        return toString();

    }
    //Condicion Cliente leal mayor igual a 10 años

    private void tipoCliente(int antiguedad) {
        if (antiguedad >= 10) {
            Leer.showDatos("Este es un tipo De cliente leal por tener" + getAntiguedad() + "de antiguedad" + "\n");

        }

    }

}
