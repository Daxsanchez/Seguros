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
public class ProcesarEmpleado {
    
    
    
    public void mostrarEmpleado(Empleado[]empleado){
       
        for(Empleado d:empleado){
            Leer.showDatos(d.getData());
            Leer.showDatos(d.calcSueldo()+"");
        }
        
    }    
}
