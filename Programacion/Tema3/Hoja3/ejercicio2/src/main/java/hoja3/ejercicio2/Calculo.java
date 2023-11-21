/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Calculo {

    private static Scanner teclado;

    public Calculo() {

    }

    public static void metodo1() {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("¡DESPEGUE!");

    }

    public static void metodo2() {
        teclado = new Scanner(System.in);
        int i = 0, num, pos = 0, neg = 0, nul = 0;
        while (i <= 10) {
            System.out.println("Inserte un numero");
            num = teclado.nextInt();
            if (num == 0) {
                nul++;
            } else if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
            i++;
        }
        System.out.println("Hay " + pos + " positivos " + neg + " negativos " + nul + " nulos");
    }

    public static void metodo3() {
        teclado = new Scanner(System.in);
        System.out.println("Inserte un numero: ");
        int num = teclado.nextInt();
        int factorial = num;

        do {
            factorial = (factorial * (num - 1));
            num--;

        } while (num != 1);

        System.out.println(factorial);
    }

    public static int metodo4() {
        teclado = new Scanner(System.in);
        String texto = "";
        System.out.println("Inserte una serie de caracteres: ");

        while (!texto.contains(".")) {
            texto = teclado.nextLine();
        }

        return texto.length();

    }

    public static int metodo5() {
        teclado = new Scanner(System.in);
        int num, media = 0, i = 0;

        do {
            System.out.println("Inserte la nota: ");
            num = teclado.nextInt();
            if (num < 0) {
                media = media;
            } else {
                media = (media + num);
                i++;
            }
        } while (num >= 0);

        return media / i;

    }

}
