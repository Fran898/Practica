/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Alumno {

    private String nombre;
    private int[] notas;

    public Alumno(int n) {
        notas = new int[n];
        System.out.println("Inserte el nombre del alumno: ");
        nombre = new Scanner(System.in).nextLine();
        boolean temp = true;
        for (int i = 0; i < notas.length; i++) {
            
            do{
                temp = false;
            
            
                try {
                    System.out.println("Inserte la nota nº" + (i + 1) + " del alumno " + nombre);
                    notas[i] = new Scanner(System.in).nextInt();
                    
                    if (notas[i] < 0 || notas[i] > 10) {
                        throw new Exception("La nota no esta entre 0 y 10");
                    }
                    

                } catch (InputMismatchException e) {
                    System.out.println("Nota no valida");
                    temp = true;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    temp = true;
                }
                
            }while(temp);

        }
    }
    
    public String mostrar(){
        String temp = "";
        for (int i = 0; i < notas.length; i++) {
            temp += " " + notas[i];
        }
        
        return "Nombre: " + nombre + "Notas: " + temp; 
    }
    
    
    

}
