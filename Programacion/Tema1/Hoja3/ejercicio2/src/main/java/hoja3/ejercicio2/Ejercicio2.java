/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int total;
        System.out.print("Inserte un número entero: ");
        num = teclado.nextInt();
        total = 7-(num%7);
        
        System.out.println("Para que " + num + " sea multiple de 7 hay que sumar " + total);
                
        
        
    }
}
