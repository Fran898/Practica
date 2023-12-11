/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Recursividad {
    

    public Recursividad() {

    }
    
    public static int factorial(int num){
        
        int facto = num <= 1 ? 1 : num*factorial(num-1);
        return facto;
    }
    
    public static int sumaSusNumeros(int num){
        
        int suma = num <= 1 ? 1 : num+sumaSusNumeros(num-1);
        return suma;
    }
    
    public static int imprimeNumeros(int num){
                  
         
        return 
    }

}
