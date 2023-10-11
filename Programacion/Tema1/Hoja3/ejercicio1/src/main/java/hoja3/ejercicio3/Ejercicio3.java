/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {
        //Ejercicio 1
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double imp;
        System.out.print("Inserte el precio base: ");
        double precio = teclado.nextDouble();
        System.out.print("Inserte el % de IVA: ");
        double iva = teclado.nextDouble();
        imp = (precio*iva)/100;
        System.out.println("El importe añadido del IVA es " + imp + "€");
        System.out.println("Precio total: " + (precio+imp) + "€");
        
            
    }
}
