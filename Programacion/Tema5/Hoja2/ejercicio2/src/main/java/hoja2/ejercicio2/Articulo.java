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
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta el codigo del producto:");
        codigo = teclado.nextLine();
        System.out.println("Inserta una descripcion:");
        desc = teclado.nextLine();
        System.out.println("Inserta el precio: ");
        precio = teclado.nextDouble();
        
        
        
    }
    
    
    @Override
    public String toString(){
        return "Codigo del producto: " + codigo + "\nDescripcion: " + desc + "\nPrecio: " + String.format("%,.2f", precio);
    }
    
    
    
}
