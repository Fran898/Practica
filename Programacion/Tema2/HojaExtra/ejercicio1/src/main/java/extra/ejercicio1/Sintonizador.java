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
    
    //Constructor por defecto
    public Sintonizador(){
      frecuencia = 80;  
    }
    //Constructor con argumento
    public Sintonizador(double frecuencia){
        this.frecuencia = frecuencia > 108 ? 108 : frecuencia;
        this.frecuencia = frecuencia < 80  ? 80 : this.frecuencia;
        
    }
    //Constructor Copia
    public Sintonizador(Sintonizador n){
        this.frecuencia = n.frecuencia;
    }
    //Metodo para subir frecuencia 0.5
    public void up(){
        frecuencia = frecuencia < 108 ? frecuencia + 0.5 : 80;
    }
    
    //Metodo para bajar la frecuencia 0.5
    public void down(){
        frecuencia = frecuencia > 80 ? frecuencia - 0.5 : 108; 
    }
    //Metodo para devolver frecuencia
    public double getFrecuencia(){
        return frecuencia;
    }
}
