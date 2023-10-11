/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Variable
        double a;
        double b;
        boolean igual;
       
        
        
        //Entrada
        System.out.println("Inserte el número a: ");
        a = teclado.nextDouble();
        System.out.println("Inserte el número b; ");
        b = teclado.nextDouble();
       
        igual = a==b;
        
        System.out.println("Los números son iguales o no?: " + igual);
        
        
        
        
    }
}
