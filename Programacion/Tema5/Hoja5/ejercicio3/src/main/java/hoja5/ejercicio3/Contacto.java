/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio3;

import java.time.LocalDate;

/**
 *
 * @author Francisco Sitjar
 */
public class Contacto implements Comparable<Contacto> {

    private String nombre;
    private String apellido;
    private int telefono;
    private String email;
    private LocalDate fechaNac;

    public Contacto(String nom, String ap, int tel, String email, int dia, int mes, int anno) {
        nombre = nom;
        apellido = ap;
        telefono = tel;
        this.email = email;

        fechaNac = LocalDate.of(anno, mes, dia);
        //Cambiar la salida de la fecha

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    @Override
    public int compareTo(Contacto other) {
        int temp = 0;
        if (nombre.compareTo(other.nombre) > 0) {
            temp = 1;
            
        } else if (nombre.compareTo(other.nombre) < 0) {
            temp = -1;
            
        } else {
            temp = 0;
        }

        return temp;
    }

}
    
    
    
    

