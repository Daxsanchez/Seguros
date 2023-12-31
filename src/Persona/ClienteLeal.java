package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */

//2.4-El cliente frecuente tiene 5 años de antigüedad, cuenta con nombre, apellidos y teléfono
public class ClienteLeal extends Cliente {

    private static boolean mensajeMostrado = false;
    private  char genero;
    private String correo;
    public ClienteLeal(String nombre, String apellido, String numTelefonon, int antiguedad,char genero,String correo) {
        super(nombre, apellido, numTelefonon, antiguedad);
        this.genero=genero;
        this.correo=correo;
        if (!mensajeMostrado) {
            Leer.showDatos("====El TIPO CLIENTE LEAL ES MAYOR A 10 AÑOS==");
            mensajeMostrado = true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cliente Leal: ").append("\n");
        sb.append(super.toString()).append("\n");
        sb.append("Género: ").append(genero).append("\n");
        sb.append("Correo Eléctronico: ").append(correo).append("\n");
        return sb.toString();
    }


    @Override
    public String getData() {
        return toString();

    }
    //Condicion Cliente leal mayor igual a 10 años

    private void tipoCliente(int antiguedad) {
        if (antiguedad >= 10) {
            Leer.showDatos("Este es un tipo De cliente leal por tener" + getAntiguedad() + "de antiguedad" + "\n");

        }

    }

    @Override
    public int getCliente() {
        tipoCliente(getAntiguedad());
        return getAntiguedad();
    }

}
