package Renovaciones;

import Persona.Cliente;
import Seguros.Seguro;
import archivos.Archivo;
import java.util.Date;

/**
 *
 * @author rafae
 */
public class RenovacionPlus implements Renovacion {

    private String numRenovacion;
    private Date fechaRenovacion;
    private int duracion = 5;//En años
    private Seguro seguro;
    private String formaDePago;
    private Cliente cliente;

    public RenovacionPlus(String numRenovacion, Date fechaRenovacion, Seguro seguro, String formaDePago, Cliente cliente) {
        this.numRenovacion = numRenovacion;
        this.fechaRenovacion = fechaRenovacion;
        this.seguro = seguro;
        this.formaDePago = formaDePago;
        this.cliente = cliente;
    }

    public String getNumRenovacion() {
        return numRenovacion;
    }

    public void setNumRenovacion(String numRenovacion) {
        this.numRenovacion = numRenovacion;
    }

    public Date getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(Date fechaRenovacion) {
        this.fechaRenovacion = fechaRenovacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    //Este médoto genera una renovación de tipo plus y genera un archivo de texto con la información de la renovación
    @Override
    public double renovar() {
        String formatoNombre = "Renovacion_" + this.numRenovacion;
        Archivo archivo = new Archivo(formatoNombre, "Renovaciones Plus");
        archivo.escribrir(toString());
        return cliente.calcDescuento(seguro.getPrecio()) * duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Renovacion plus:").append("\n");
        sb.append("Número de renovacion: ").append(numRenovacion).append("\n");
        sb.append("Fecha de renovación: ").append(fechaRenovacion).append("\n");
        sb.append("Duración: ").append(duracion).append("\n");
        sb.append("Seguro: ").append(seguro.toString()).append("\n");
        sb.append("Forma de pago: ").append(formaDePago).append("\n");
        sb.append("Cliente: ").append(cliente.toString()).append("\n");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void getArchivoRenovacion() {
        String formatoNombre = "Renovacion_" + this.numRenovacion;
        Archivo archivo = new Archivo(formatoNombre, "Renovaciones Plus");
        archivo.leerArchivo();
    }

}
