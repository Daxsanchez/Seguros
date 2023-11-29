package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class ClienteNuevo extends Cliente {

    public ClienteNuevo(String nombre, String apellido, String numTelefonon, int antiguedad) {
        super(nombre, apellido, numTelefonon, antiguedad);
        while (super.getAntiguedad() >= 5) {
            Leer.showDatos("La antigüedad para este cliente va de 0 a 5 años");
            super.setAntiguedad(Leer.leerEntero("Ingrese una antiguedad con estos rangos:"));
        }
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

    //Condicion Cliente Nuevo menor a 5 años
    private void tipoCliente(int antiguedad) {
        if (antiguedad < 5) {
            Leer.showDatos("Este es un tipo De cliente nuevo por tener" + getAntiguedad() + "de antiguedad" + "\n");
        }

    }

}
