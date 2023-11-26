/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Renovaciones;
import Seguros.Seguro;
/**
 *
 * @author rafae
 */
public class RenovacionEstandar  implements Renovacion{
    private String numRenovacion;
    private String fechaRenovacion;
    private int duracion=1;//En años
    private Seguro seguro;
    private String formaDePago;

    public RenovacionEstandar(String numRenovacion, String fechaRenovacion, Seguro seguro, String formaDePago) {
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

    public String getFechaRenovacion() {
        return fechaRenovacion;
    }

    public void setFechaRenovacion(String fechaRenovacion) {
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
   
        return getSeguro().getPrecio()*duracion;
    }


    
    
}
