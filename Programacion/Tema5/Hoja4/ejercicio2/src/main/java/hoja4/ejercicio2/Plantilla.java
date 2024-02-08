/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Plantilla {
    private static Empleado[] em;
    private static int contador;
    
    
    public Plantilla(int n){
        em = new Empleado[n];
        contador = 0;
                
    }
    
    public void insertar(Empleado n){
        em[contador] = n;       
        contador++;
    }
    
    
}
