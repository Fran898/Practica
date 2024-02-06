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
public abstract class Persona {
    private String DNI;
    private String nombre;
    private String direccion;
    
    public Persona(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el DNI: ");
        DNI = teclado.nextLine();
        System.out.println("Inserte el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Inserte la direccion: ");
        direccion = teclado.nextLine();
        
    }
    
    public String mostrar(){
        return "Nombre: " + nombre + "\nDireccion: " + direccion;
    }
    
    

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
    
    
}
