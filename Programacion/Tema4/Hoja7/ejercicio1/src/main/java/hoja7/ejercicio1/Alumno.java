/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Alumno {
    private String nombre;
    private int[] nota;
    
    
    public Alumno(String nombre){
        Scanner teclado = new Scanner(System.in);
        this.nombre = nombre;
        nota = new int[5];
        for (int i = 0; i < nota.length; i++) {
            System.out.println("Inserte la nota de alumno Nº" + (i+1) + ":");
            nota[i] = teclado.nextInt();
        }
        
        
    }
    
     public int mayor(){
            Arrays.sort(nota);
            return nota[nota.length-1];
        }
     
     public int menor(){
         Arrays.sort(nota);
         return nota[0];
     }
     
     public void ponerACero(){
         Arrays.fill(nota, 0);
         
     }
     
     public int buscar(int n){
        Arrays.sort(nota);
        return Arrays.binarySearch(nota, n);
         
     }
    
     public int[] tresMejores(){
         Arrays.sort(nota);
         int temp[] = Arrays.copyOfRange(nota, (nota.length-3), (nota.length));
         
         return temp;
     }
}
