/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Renovaciones;

import Seguros.Seguro;
import archivos.Archivo;
import java.util.Date;

/**
 *
 * @author rafae
 */
public class RenovacionEstandar implements Renovacion {

    private String numRenovacion;
    private Date fechaRenovacion;
    private int duracion = 1;//En años
    private Seguro seguro;
    private String formaDePago;

    public RenovacionEstandar(String numRenovacion, Date fechaRenovacion, Seguro seguro, String formaDePago) {
        this.numRenovacion = numRenovacion;
        this.fechaRenovacion = fechaRenovacion;
        this.seguro = seguro;
        this.formaDePago = formaDePago;
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

    @Override
    public double renovar() {
        String formatoNombre = "Renovacion_" + this.numRenovacion;
        Archivo archivo = new Archivo(formatoNombre, "Renovaciones Estándar");
        archivo.escribrir(toString());
        return getSeguro().getPrecio() * duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Renovacion estándar:").append("\n");
        sb.append("Número de renovación: ").append(numRenovacion).append("\n");
        sb.append("Fecha de renovación: ").append(fechaRenovacion).append("\n");
        sb.append("Duración: ").append(duracion).append("\n");
        sb.append("Seguro: ").append(seguro.toString()).append("\n");
        sb.append("Forma de pago:").append(formaDePago).append("\n");
        return sb.toString();
    }

}
