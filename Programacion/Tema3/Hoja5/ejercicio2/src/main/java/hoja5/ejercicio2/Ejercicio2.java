/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el numero de lineas: ");
        int filas = teclado.nextInt();
        for (int i = 1; i <= filas; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print(j + " ");
                }System.out.println();
            } else {
                for (int k = 9; k >= 1; k--) {
                    System.out.print(k + " ");

                }System.out.println();
            }
        }
    }
}
