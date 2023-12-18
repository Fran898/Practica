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
    private Scanner teclado;
    private int[] a = new int[5];
    
    
    public Vectores(){
        teclado = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.println("Inserte el valor de la posicion: " + i);
            a[i] = teclado.nextInt();
        }
              
    }
    
    public int menor(){
        int temp = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < temp)
                temp = a[i];
            
        }
        
        return temp;
        
        
    }
    
    
       public int mayor(){
        int temp = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > temp)
                temp = a[i];
            
        }
        
        return temp;
        
        
    }
       
       
        public int media(){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            temp += a[i];
            
        }
        
        return temp/a.length;
        
        
    }
       
       
    
    
}
