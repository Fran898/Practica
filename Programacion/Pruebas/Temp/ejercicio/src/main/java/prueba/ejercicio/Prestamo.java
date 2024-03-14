/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Francisco Sitjar
 */
public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    
    
    public Prestamo(Libro l, Usuario u,int dia, int mes, int anno){
        libro = l;
        usuario = u;
        fechaPrestamo = LocalDate.of(anno, mes, dia);
        fechaDevolucion = null;
        
        
    }
    
    
    
}
