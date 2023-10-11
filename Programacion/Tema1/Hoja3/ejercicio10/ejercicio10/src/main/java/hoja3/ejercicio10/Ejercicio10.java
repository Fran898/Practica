/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        double metros;
        double cm;
        int total;
        
        //Entradas
        System.out.println("Inserte longitud de lanzamiento (en metros):  ");
        metros = teclado.nextDouble();
        
        cm = metros*100;
        total = (int)cm;
        //Salida
        System.out.printf("El lanzamiento es de: %d cm", total);
        
    }
}
