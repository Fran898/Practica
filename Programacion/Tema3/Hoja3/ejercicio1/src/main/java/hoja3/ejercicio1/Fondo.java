/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author Francisco Sitjar 
 */
public class Fondo {
    private double C;
    private double I;
    private int N;
    
    public Fondo(){
        
    }
    
    public Fondo(double C, double I, int N){
        this.C = C;
        this.I = I;
        this.N = N;
    }
    
    public void evolucion(){
        int i = 1;
        
        while (i <= N){
            
             System.out.printf("En el año %d hay %,.2f euros\n",i, (C + (C*I/100*i)));
             i++;
        }
        
    }
    
    
}
