package Persona;

/**
 *
 * @author rafae
 */
public abstract class Cliente extends Persona {

    private int antiguedad;

    public Cliente(String nombre, String apellido, String numTelefonon, int antiguedad) {

        super(nombre, apellido, numTelefonon);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append("\n");
        sb.append("Antiguedad: ").append(antiguedad).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

    //Descuento es la variable que se le cobrará al cliente, y se manda para que la retorne con el descuento aplicado
    public double calcDescuento(double descuento) {
        //Nuevo
        if (antiguedad < 5) {
            descuento -= (descuento * 0.05);
            //Frecuente
        } else if (antiguedad > 4 && antiguedad < 10) {
            descuento -= (descuento * 0.1);
            //Leal
        } else if (antiguedad >= 10) {
            descuento -= (descuento * 0.2);
        }
        return descuento;
    }

    public abstract String getData();
    public abstract int getCliente();

}
