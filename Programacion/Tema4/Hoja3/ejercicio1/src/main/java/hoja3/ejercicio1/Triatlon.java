/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Triatlon {

    private String nombre;
    private int dorsal;
    private int[] puntos;

    public Triatlon(String nombre, int dorsal, int pruebas) {
        Scanner teclado;
        this.nombre = nombre;
        this.dorsal = dorsal;
        puntos = new int[pruebas];
        for (int i = 0; i < puntos.length; i++) {
            teclado = new Scanner(System.in);
            System.out.println("Inserte los puntos de en la prueba " + (i+1));
            puntos[i] = teclado.nextInt();
        }

    }

    public Triatlon() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre del atleta: ");
        nombre = teclado.next();
        System.out.println("Inserte el numero del atleta: ");
        dorsal = teclado.nextInt();
        System.out.println("Numero de pruebas realizadas: ");
        int pruebas = teclado.nextInt();
        puntos = new int[pruebas];
        for (int i = 0; i < puntos.length; i++) {
            teclado = new Scanner(System.in);
            System.out.println("Inserte los puntos de en la prueba " + (i+1));
            puntos[i] = teclado.nextInt();
        }

    }
    
    
    
    public int pMedia(){
        int temp = 0;
         for (int i = 0; i < puntos.length; i++) {
            temp += puntos[i];
        }
         return temp;
    }
    
    
    public boolean esSeleccionado(){
        boolean temp = false;
         for (int i = 0; i < puntos.length; i++) {
            if(puntos[i] >= 10){
                temp = true;
           }
        }
         return temp;
    }
    
    
    
    public String mostrar(){
        String cadena = "";
         for (int i = 0; i < puntos.length; i++) {
            cadena += puntos[i] + " ";
        }
        
         
         
         return "Nombre: " + nombre + " Dorsal: " + dorsal + " Puntos: " + cadena + " Media: " + pMedia(); 
    }

}
