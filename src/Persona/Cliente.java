/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author rafae
 */
public abstract class Cliente extends Persona {

    private int antiguedad;

    public Cliente(String nombre, String apellido, String numTelefonon, int antiguedad) {

        super(nombre, apellido, numTelefonon);
        this.antiguedad =antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append("\n");
        sb.append("Antiguedad: ").append(antiguedad).append("\n");
        sb.append(super.toString()).append("\n");
        return sb.toString();
    }

    public abstract String getData();

}
