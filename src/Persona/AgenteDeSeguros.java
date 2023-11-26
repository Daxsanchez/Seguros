/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import leer.Leer;

/**
 *
 * @author rafae
 */
public class AgenteDeSeguros extends Empleado {

    private boolean comision;
    private int numVentas;

    public AgenteDeSeguros(boolean comision, int numVentas, int id, String puesto, Double salario, String nombre, String apellido, String numTelefonon) {
        super(id, puesto, salario, nombre, apellido, numTelefonon);
        this.comision = comision;
        this.numVentas = numVentas;
    }

    public boolean isComision() {
        return comision;
    }

    public void setComision(boolean comision) {
        this.comision = comision;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Agente De seguros").append("\n");
        sb.append(super.toString()).append("\n");
        sb.append("Comisión: ").append(comision).append("\n");
        sb.append("Numero de ventas: ").append(numVentas).append("\n");
        return sb.toString();
    }

    @Override
    public double calcSueldo() {
        calcComision(comision);
        calcVenta(numVentas);
        return getSalario();
    }

    @Override
    public String getData() {
        return "Informacion de Agente Seguros: " + toString() + "Sueldo: " + calcSueldo();
    }

    private void calcComision(boolean comision) {
        if (comision == true) {
            setSalario(getSalario() + (getSalario() * 0.5));
            Leer.showDatos(getSalario().toString());
        }

    }

    private void calcVenta(int numVentas) {
        if (numVentas > 20) {
            setSalario(getSalario() + (getSalario() * 0.10));
            Leer.showDatos(getSalario().toString());
        }
    }

}
