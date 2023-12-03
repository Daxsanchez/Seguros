/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rafae
 */
public class ExcClienteLeal extends Exception {
    //7.2
    @Override
    public String getMessage() {
        return "Este tipo de cliente está por arribe de los 10 años de antiguedad";

    }

}
