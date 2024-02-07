/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Alumno extends Persona{
    private int[] notas;
    
    public Alumno(int n){
        super();
        notas = new int[n];
    }
    
    public void agregarNota(){
        for (int i = 0; i < notas.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Inserte la nota nº" + (i+1));
            notas[i] = teclado.nextInt();
        }
    }
    
    
    @Override
    public String mostrar(){
        int temp = 0;
        for (int i = 0; i < notas.length; i++) {
            temp += notas[i];
            
        }
        temp = temp / notas.length;
        
        return "DNI: " + super.getDNI() + "\nDireccion: " + super.getDireccion() + "\nNombre: " + super.getNombre() +  "\nNota media: " + temp;
    }
    
}
