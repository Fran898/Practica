/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extra.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Sintonizador {
    private double frecuencia;
    
    
    public Sintonizador(){
      frecuencia = 80;  
    }
    
    public Sintonizador(double frecuencia){
        this.frecuencia = frecuencia > 108 ? 108 : frecuencia;
        this.frecuencia = frecuencia < 80  ? 80 : this.frecuencia;
        
    }
    
    public Sintonizador(Sintonizador n){
        this.frecuencia = n.frecuencia;
    }
    
    public void up(){
        frecuencia = frecuencia < 108 ? frecuencia + 0.5 : 80;
    }
    
    
    public void down(){
        frecuencia = frecuencia > 80 ? frecuencia - 0.5 : 108; 
    }
    
    public double getFrecuencia(){
        return frecuencia;
    }
}
