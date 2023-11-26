package ventas;

import Persona.Cliente;
import Persona.Empleado;
import java.util.Date;
import Seguros.Seguro;

/**
 *
 * @author Dax Sánchez
 */
public class Venta {

    private int numPoliza;
    private Date fechaVenta;
    private Cliente cliente;
    private Empleado empleado;
    private String vehiculo;
    private Double montoAsegurado;
    private Double prima;
    private Double deducible;
    private Seguro seguro;

    public Venta(int numPoliza, Date fechaVenta, Cliente cliente, Empleado empleado, String vehiculo, Double montoAsegurado, Double prima, Double deducible, Seguro seguro) {
        this.numPoliza = numPoliza;
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.montoAsegurado = montoAsegurado;
        this.prima = prima;
        this.deducible = deducible;
        this.seguro = seguro;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public Double getPrima() {
        return prima;
    }

    public void setPrima(Double prima) {
        this.prima = prima;
    }

    public Double getDeducible() {
        return deducible;
    }

    public void setDeducible(Double deducible) {
        this.deducible = deducible;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta:");
        sb.append("Número de poliza: ").append(numPoliza).append("\n");
        sb.append("Fecha de venta: ").append(fechaVenta).append("\n");
        sb.append("Cliente: ").append(cliente.toString()).append("\n");
        sb.append("Empleado: ").append(empleado.toString()).append("\n");
        sb.append("Vehiculo: ").append(vehiculo).append("\n");
        sb.append("Monto asegurado: ").append(montoAsegurado).append("\n");
        sb.append("Prima: ").append(prima).append("\n");
        sb.append("Deducible: ").append(deducible).append("\n");
        sb.append("Seguro: ").append(seguro.toString()).append("\n");
        return sb.toString();
    }

}
