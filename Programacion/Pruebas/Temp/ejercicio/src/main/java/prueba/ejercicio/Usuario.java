/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

import java.util.Objects;

/**
 *
 * @author Francisco Sitjar
 */
public class Usuario implements Identificable{
    private String nombre;
    private String apellido;
    
    
    public Usuario(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellido);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }
    
    @Override
    public String imprime(){
        return "Nombre: " + nombre + "\nApellido: " + apellido;
        
    }
}
