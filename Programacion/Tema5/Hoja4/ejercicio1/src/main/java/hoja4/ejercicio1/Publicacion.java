/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Francisco Sitjar
 */
public abstract class Publicacion {
    protected String titulo;
    protected String autor;
    protected Calendar fecha;
    
    public Publicacion(String titulo, String autor, int dia, int mes, int anno){
        this.titulo = titulo;
        this.autor = autor;
        fecha = Calendar.getInstance();
        fecha.set(anno, mes, dia);
        
        
    }
    
    @Override
    public abstract String toString();
    
    
}
