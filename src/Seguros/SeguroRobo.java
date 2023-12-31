package Seguros;

import java.util.Date;
import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */

//4.4 Seguro contra robo. Tiempo de robo(horas).

public class SeguroRobo extends Seguro {

    private int tiempoRobo;//En horas

    public SeguroRobo(int tiempoRobo, String numPoliza, String fechaInicio, String fechaVencimiento, boolean aplicaSeguro, String descripcion,
            Double precio, Double montoAsegurado) {
        super(numPoliza, fechaInicio, fechaVencimiento, aplicaSeguro, descripcion, precio, montoAsegurado);
        this.tiempoRobo = tiempoRobo;
    }

    public int getTiempoRobo() {
        return tiempoRobo;
    }

    public void setTiempoRobo(int tiempoRobo) {
        this.tiempoRobo = tiempoRobo;
    }

    public void informe() {
        String informe = "El reporte de seguro es el siguiente:\n" + toString();
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
