/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Persona {
    private String nombre;
    private int telefono;
    
    
    public Persona(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
