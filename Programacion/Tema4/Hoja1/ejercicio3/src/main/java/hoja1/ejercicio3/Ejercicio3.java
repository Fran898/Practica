/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean temp = false;

        System.out.println("Inserte un numero: ");
        int pos = teclado.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (pos == num[i]) {
                System.out.println("Esta en la posicion: " + i);
                temp = true;
            }

        }

        if (!temp) {
            System.out.println("Numero no encontrado");
        }

    }
}
