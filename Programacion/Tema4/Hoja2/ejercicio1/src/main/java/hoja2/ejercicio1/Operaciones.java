/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Operaciones {
    private int[] a = new int[5];
    
    
    public Operaciones(int num1, int num2, int num3, int num4, int num5){
        a[0] = num1;
        a[1] = num2;
        a[2] = num3;
        a[3] = num4;
        a[4] = num5;
        
    }
    
    
    
    public void doble(){
        for(int i = 0; i < a.length; i++){
            a[i] = a[i] * 2;
        }
    }
    
    public void enseñar(){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
       
    
    public int sumaPar(){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                temp += a[i];
            }
        }
        return temp;
        
    }
        
    
}
