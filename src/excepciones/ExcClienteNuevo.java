/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rafae
 */
public class ExcClienteNuevo extends Exception {
    //7.2
    @Override
    public String getMessage() {
        return "El tipo de cliente Nuevo no es mayor a 5 años";

    }
    
    
    
    
}
