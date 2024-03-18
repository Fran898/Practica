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
public abstract class Libro implements Identificable {
    protected String titulo;
    protected String autor;
    
    
    public Libro(){
        titulo = Teclado.cadena("Inserta el titulo");
        autor = Teclado.cadena("Inserta el autor");
        
    }
    
    
    public Libro(String t, String a){
        titulo = t;
        autor = a;
    }
    
    
    @Override
    public String imprime(){
        return "Titulo: " + titulo + "\nAutor: " + autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.titulo);
        hash = 19 * hash + Objects.hashCode(this.autor);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
    
    
}
