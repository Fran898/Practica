/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char calcetin = 0;
        int blanco = 0;
        int negro = 0;

        while (calcetin != '.') {
            System.out.println("Introduce el color del calcetin, . para salir");
            calcetin = teclado.next().charAt(0);

            switch (calcetin) {
                case 'w', 'W' -> blanco++;
                case 'b', 'B' -> negro++;
                default -> System.out.println("No es un color valido para Dr Black&White");
            }

        }

        if (blanco % 2 == 0 && negro % 2 == 0) {
            System.out.println("EMPAREJADOS");
        } else if (blanco % 2 == 1 && negro % 2 == 1) {
            System.out.println("PAREJA MIXTA");
        } else if (blanco % 2 == 0 && negro % 2 == 1) {
            System.out.println("NEGRO SOLITARIO");
        } else {
            System.out.println("BLANCO SOLITARIO");
        }

    }
}
