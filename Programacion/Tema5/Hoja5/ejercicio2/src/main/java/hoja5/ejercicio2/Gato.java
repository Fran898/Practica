/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Gato extends Mamifero implements Domestico, Felino {

    private String nombre;

    public Gato(String nom, String raza, int n, String alimento) {

        super(raza, n, alimento);
        nombre = nom;
        
    }
    
    @Override
    public String arañar(){
        return "araña";
    } 
    
    @Override
    public String obedecer(){
        return "obedece";
    }
    
    @Override
    public String toString(){
        return "gato { nombre = " + nombre + " } " + super.toString();
        
    }
}
