/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio4;

/**
 *
 * @author Francisco Sitjar
 */
public class Billete {
    private double distancia;
    private int dias;
    
    
    
    public Billete(){
        
    }
    
    public Billete(double distancia, int dias){
        this.distancia = distancia;
        this.dias = dias;
    }
    
    public double importa(){
        double precio;
        
        if(distancia > 800 && dias > 7){
            
            precio =  ((distancia * 0.6) - ((distancia * 0.6) * 0.3));
            
        }else{
            
            precio = distancia * 0.6;
            
        }
        return precio;
    }
    
    
}
