/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Griego extends Guerrero {
    
    public Griego(String n, int edad, int fuerza){
        super(n, edad, fuerza);
        
    }
    
    
    @Override
    public boolean retirarse(){
        boolean temp = false;
        if(super.isHerido() == true && super.isMuerto() == false){
            temp = true;
        }
        return temp;
    }
    
    
}
