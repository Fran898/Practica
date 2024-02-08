/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Francisco Sitjar
 */
public class Libro extends Publicacion {
    private int numPaginas;
    
    public Libro(String titulo, String autor, int dia, int mes, int anno, int n){
        super(titulo, autor, dia, mes, anno);
        numPaginas = n;
    }
    
    
    @Override
    public String toString(){
        DateFormat f = new SimpleDateFormat("dd/M/yy");
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFecha: " + f.format(fecha.getTime()) + "\nNumero de paginas: " + numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    
    
}
