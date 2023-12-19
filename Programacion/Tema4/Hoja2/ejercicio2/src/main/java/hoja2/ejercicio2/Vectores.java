/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Vectores {
    private int[] a;
    
    
    public Vectores(){
        Scanner teclado;
        a = new int[5];        
        for(int i = 0; i < a.length; i++){
            teclado = new Scanner(System.in);
            System.out.println("Inserte el valor de la posicion: " + i);
            a[i] = teclado.nextInt();
        }
              
    }
    
    public int menor(){
        int temp = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < temp){
                temp = a[i];
            }
                
            
        }
        
        return temp;
        
        
    }
    
    
       public int mayor(){
        int temp = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > temp){
                 temp = a[i];
            }
               
            
        }
        
        return temp;
        
        
    }
       
       
        public double media(){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            temp += a[i];
            
        }
        
        return temp/a.length;
        
        
    }
       
       
    
    
}
