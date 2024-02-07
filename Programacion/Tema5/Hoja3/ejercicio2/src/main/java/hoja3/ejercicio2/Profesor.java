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
public class Profesor extends Persona {
    private String[] asignaturas; 
    
    public Profesor(int n){
        super();
        asignaturas = new String[n];
        
    }
    
    public void agregarAsignatura(){
        for (int i = 0; i < asignaturas.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Inserte la asignatura nº" + (i+1));
            asignaturas[i] = teclado.nextLine();
        }
    }
    
    
    @Override
      public String mostrar(){
          String temp = "";
          for (int i = 0; i < asignaturas.length; i++) {
            temp += asignaturas[i].toUpperCase() + " ";
        }
        return "DNI: " + super.getNombre() + "\nNombre: " + super.getNombre() + "\nLas asignaturas de da son: " + temp;
    }
    
}
