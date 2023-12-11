/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja8.ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        double num = 0;
        double total = 0;
        int numbola;
        int des = 0;

        while (num >= 0) {
            System.out.println("Introduce total a pagar, -1 para salir:");
            num = teclado.nextInt();
            numbola = random.nextInt(0, 4);
            String color;
            switch (numbola) {
                case 0 ->
                    color = "blanco";
                case 1 -> {
                    color = "amarillo";
                    des = 5;
                }
                case 2 -> {
                    color = "azul";
                    des = 7;
                }
                case 3 -> {
                    color = "rojo";
                    des = 10;
                }
                default ->
                    color = "";

            }
            if (num >= 0) {
                if (des > 1) {
                    total = ((num * des) / 100);
                }
                System.out.printf("Ha salido la bola %s, %d por ciento de descuento: %,.2f Importe con el descuento: %,.2f \n ", color, des, total, (num - total));

            }

        }
    }

}
