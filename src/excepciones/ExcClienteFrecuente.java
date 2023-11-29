/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rafae
 */
public class ExcClienteFrecuente extends Exception {

    @Override
    public String getMessage() {
        return "Este tipo de cliente no puede tener mas de 5 años de antiguedad";

    }
    
    
    
    
}
