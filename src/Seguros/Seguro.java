package Seguros;

import java.util.Date;

/**
 *
 * @author Dax Sánchez
 */
public abstract class Seguro {

    private String numPoliza;
    private Date fechaInicio;
    private Date fechaVencimiento;
    private boolean aplicaSeguro;
    private String descripcion;
    private final String tipo = this.getClass().getSimpleName();

    public Seguro(String numPoliza, Date fechaInicio, Date fechaVencimiento, boolean aplicaSeguro, String descripcion) {
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.aplicaSeguro = aplicaSeguro;
        this.descripcion = descripcion;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isAplicaSeguro() {
        return aplicaSeguro;
    }

    public void setAplicaSeguro(boolean aplicaSeguro) {
        this.aplicaSeguro = aplicaSeguro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void informe();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Seguro " + tipo + " :").append("\n");
        sb.append("Número de póliza: ").append(numPoliza).append("\n");
        sb.append("Fecha inicio: ").append(fechaInicio).append("\n");
        sb.append("Fecha vencimiento: ").append(fechaVencimiento).append("\n");
        sb.append("Aplica el seguro: ").append(aplicaSeguro).append("\n");
        sb.append("Descripción: ").append(descripcion).append("\n");
        return sb.toString();
    }

}
