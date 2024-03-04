/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Troyano extends Guerrero {
    
    public Troyano(String n, int edad, int fuerza){
        super(n,edad,fuerza);
    }
    
    @Override
   public boolean retirarse(){
       return false;
   }
    
}
