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
    private int descuento;
    
    public EnPromocion(){
        super();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta el % de descuento: ");
        descuento = teclado.nextInt();
        
    }
    
    
    
}
