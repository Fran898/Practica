/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Llamada {
    private int duracion;
    
    public Llamada(){
        
    }
    
    public double aPagar(int minutos, int segundos){
        duracion = (minutos*60) + segundos;
        
        if (duracion >= 60){
            
            return 0.25 + (((duracion - 60)/10)*0.1);
        }else{
            return 0.25;
        }        
        
    }
    
}
