/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Libro {
    //Declaracion de atributos
    private String isbn;
    private String titulo;
    private String autor;
    
    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Set
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public void setTitulo(String titulo){
        
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    //Get
    public String getIsbn(){
        return isbn;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    
    public boolean esEspanol(){
        return isbn.substring(3, 5).equals("84") ; 
    }
    
    
    public String mostrar(){
        return titulo.toUpperCase().concat(" ").concat(autor.substring(0,1).concat(autor.substring(1).toLowerCase()));
        
    }
    
}
