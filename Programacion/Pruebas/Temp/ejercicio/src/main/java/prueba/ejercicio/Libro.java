/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

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
    
    
}
