/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Francisco Sitjar
 */
public class Prestamo implements Identificable{
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
    
    
    @Override
    public String imprime(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' ");
        return "Libro: " + libro + "\nUsuario: " + usuario + "\nFecha del prestamos: " + fechaPrestamo.format(f) + "\nFecha de devolucion " + fechaDevolucion.format(f);
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
}
