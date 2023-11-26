package Seguros;

import java.util.Date;
import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */
public class SeguroRobo extends Seguro {

    private int tiempoRobo;//En horas

    public SeguroRobo(int tiempoRobo, String numPoliza, Date fechaInicio, Date fechaVencimiento, boolean aplicaSeguro, String descripcion) {
        super(numPoliza, fechaInicio, fechaVencimiento, aplicaSeguro, descripcion);
        this.tiempoRobo = tiempoRobo;
    }

    public int getTiempoRobo() {
        return tiempoRobo;
    }

    public void setTiempoRobo(int tiempoRobo) {
        this.tiempoRobo = tiempoRobo;
    }

    public void informe() {
        String informe = "El reporte de seguro es el siguiente: " + toString();
        Leer.showDatos(informe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tiempo de robo: ").append(tiempoRobo).append("\n");
        return sb.toString();
    }

}
