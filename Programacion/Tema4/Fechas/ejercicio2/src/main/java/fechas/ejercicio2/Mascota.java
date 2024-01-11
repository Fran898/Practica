/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Francisco Sitjar
 */
public class Mascota {
    private String nombre;
    private LocalDate nac;
    
    public Mascota(String nombre, int ano, int mes, int dia){
        this.nombre = nombre;
        nac = LocalDate.of(ano, mes, dia);
        
    }
    
    public int getEdad(){      
        return LocalDate.now().getYear() - nac.getYear();
        
    }
    
    @Override
    public String toString(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Nombre de la mascota: " + nombre + "\nNacida el: " + nac.format(f) + "\nTiene " + getEdad() + " años";
        
        
    }
    
    
    
    
}
