package Seguros;

import java.util.Date;
import leer.Leer;

/**
 *
 * @author Dax Sánchez
 */
public class SeguroResponsabilidadCivil extends Seguro {

    private String objetosAfectados;

    public SeguroResponsabilidadCivil(String objetosAfectados, String numPoliza, Date fechaInicio,
            Date fechaVencimiento, boolean aplicaSeguro, String descripcion, Double precio, Double montoAsegurado) {
        super(numPoliza, fechaInicio, fechaVencimiento, aplicaSeguro, descripcion, precio, montoAsegurado);
        this.objetosAfectados = objetosAfectados;
    }

    public String getObjetosAfectados() {
        return objetosAfectados;
    }

    public void setObjetosAfectados(String objetosAfectados) {
        this.objetosAfectados = objetosAfectados;
    }

    public void informe() {
        String informe = "El reporte de seguro es el siguiente: " + toString();
        Leer.showDatos(informe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Objetos afectados: ").append(objetosAfectados).append("\n");
        return sb.toString();
    }

}
