/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el numero de filas para la piramide: ");
        int filas = teclado.nextInt();

        for (int count = 1; count <= filas; count++) {
            
            //Espacios
            for (int i = 1; i <= filas-count; i++) {
                System.out.print(" ");
            }
            //*
            for (int j = 1; j <= (count * 2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
