package Seguros;

import java.util.Date;
import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */
public class SeguroColision extends Seguro {

    private int gravedad;

    public SeguroColision(int gravedad, String numPoliza, Date fechaInicio, Date fechaVencimiento, boolean aplicaSeguro, String descripcion,
            Double precio, Double montoAsegurado) {
        super(numPoliza, fechaInicio, fechaVencimiento, aplicaSeguro, descripcion, precio, montoAsegurado);
        this.gravedad = gravedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public void informe() {
        String informe = "El reporte de seguro es el siguiente: " + toString();
        Leer.showDatos(informe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Gravedad: ").append(gravedad).append("\n");
        return sb.toString();
    }

}
