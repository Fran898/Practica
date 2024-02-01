/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Encargado extends Empleado {
   
    public Encargado(){
        super();
        SUELDO *= 1.1;
        
    }
    
    @Override
    public double getSueldo(){
        
        return SUELDO;
    }
    
    
}
