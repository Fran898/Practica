/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte dia del mes: ");
        int num = teclado.nextInt();
        String dia;
        if (num < 32) {
            dia = switch (num) {
                case 1, 8, 15, 22, 29 -> "Lunes";
                case 2, 9, 16, 23, 30 -> "Martes";
                case 3, 10, 17, 24, 31 -> "Miercoles";
                case 4, 11, 18, 25 -> "Jueves";
                case 5, 12, 19, 26 -> "Viernes";
                case 6, 13, 20, 27 -> "Sabado";
                case 7, 14, 21, 28 -> "Domingo";
                default -> "";
            };
            
            System.out.println("Hoy es " + dia);
        }else{
            System.out.println("No es un dia valido del mes");
        }

    }
}
