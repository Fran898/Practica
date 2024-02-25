/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio4;

/**
 *
 * @author Francisco Sitjar
 */
public class MiExcepcion extends Exception{
    private String temp;
    
    public MiExcepcion(String temp){
        this.temp = temp;
    }
    
    @Override
    public String toString(){
        return temp;
        
    }
  
    
    
}
