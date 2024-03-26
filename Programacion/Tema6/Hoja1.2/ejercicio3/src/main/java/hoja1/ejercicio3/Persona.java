/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 *
 * @author Francisco Sitjar
 */
public class Persona implements Comparable<Persona> {

    private String nombre;
    private LocalDate fechaNac;
    private String dni;

    public Persona() {
        boolean valido = false;
        while (!valido) {
            nombre = Teclado.string("Inserta el nombre: ");
            fechaNac = Teclado.fecha("Fecha de nacimiento");
            dni = Teclado.string("Inserta el DNI: ");
            if(!ValidaDatos.validarNombre(nombre)){
                System.out.println("El nombre no es valido");
            }else if(!ValidaDatos.validarFecha(fechaNac)){
                System.out.println("La fecha de nacimiento no es valida");
            }else if(!ValidaDatos.validarDni(dni)){
                System.out.println("El DNI no es valido");
            }else{
                valido = true;
            }
           
        }

    }
    
    public int edad(){        
        return Period.between(fechaNac, LocalDate.now()).getYears();
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + nombre + "\nFecha de nacimiento: " + fechaNac + "\nDNI: " + dni;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public int compareTo(Persona p) {
        return this.getDni().compareTo(p.getDni());
    }
    
    
    
    
    

}
