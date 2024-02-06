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
public class EnPromocion extends Articulo {
    private double descuento;
    
    public EnPromocion(){
        
    }
    public EnPromocion(String codigo, String desc, double precio, double descuento){
        super(codigo, desc, precio);
        this.descuento = descuento;
        
    }
    
    public double precioDes(){
        return (precio/descuento)*100;
        
    }
    
}
