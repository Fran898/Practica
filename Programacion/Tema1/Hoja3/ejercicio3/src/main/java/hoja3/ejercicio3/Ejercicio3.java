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

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        //Variables
        int num;
        int total;
        int m;
        
        //Entradas
        System.out.print("Inserte un número entero: ");
        num = teclado.nextInt();
        System.out.print("Inserte el número por el que tiene que ser multiplo: ");
        m = teclado.nextInt();
        
        //Operación
        total = m-(num%m);
        
        
        //Salida
        System.out.println("Para que " + num + " sea multiple de 7 hay que sumar " + total);
                
        
    }
}
