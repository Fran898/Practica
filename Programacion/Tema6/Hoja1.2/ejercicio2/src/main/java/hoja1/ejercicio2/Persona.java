/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author Francisco Sitjar
 */
public class Persona {
    private String nombre;
    private LocalDate fechaNac;
    private String dni;
    
    
    public Persona(){
        nombre = Teclado.string("Inserta el nombre: ");
        fechaNac = Teclado.fecha("Fecha de nacimiento");
        dni = Teclado.string("Inserta el DNI: ");
        
    }
    
    
    
}
