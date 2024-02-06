/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Articulo {
    protected String codigo;
    protected String desc;
    protected double precio;
    
    public Articulo(){
        
    }
    public Articulo(String codigo, String desc, double precio){
        this.codigo = codigo;
        this.desc = desc;
        this.precio = precio;
        
        
        
    }
    
    
    @Override
    public String toString(){
        return "Codigo del producto: " + codigo + "\nDescripcion: " + desc + "\nPrecio: " + String.format("%,.2f", precio);
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    
    
}
