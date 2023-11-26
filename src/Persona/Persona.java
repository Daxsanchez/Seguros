/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author rafae
 */
//Clase Padre extendera a Cliente y Persona
public class Persona {

    private String nombre;
    private String apellido;
    private String numTelefonon;

    public Persona(String nombre, String apellido, String numTelefonon) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefonon = numTelefonon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumTelefonon() {
        return numTelefonon;
    }

    public void setNumTelefonon(String numTelefonon) {
        this.numTelefonon = numTelefonon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Persona: ").append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellidos: ").append(apellido).append("\n");
        sb.append("Número de Teléfono: ").append(numTelefonon).append("\n");
        return sb.toString();
    }

}
