package main.ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Francisco Sitjar
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public String imprimir(){
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
    
    public boolean esMayorEdad(){
        return edad >= 18;
    }
    public static void main(String[] args) {
        Persona per = new Persona(args[0],Integer.parseInt(args[1]));
        
        System.out.println(per.imprimir());
        System.out.println("Es mayor de edad: " + per.esMayorEdad());
    }
    
}
