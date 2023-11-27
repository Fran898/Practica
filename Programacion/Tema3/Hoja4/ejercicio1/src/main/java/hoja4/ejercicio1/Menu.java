/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Menu {

    private static Scanner teclado;

    public Menu() {

    }

    public static void metodo1() {
        teclado = new Scanner(System.in);
        System.out.println("Inserta un numero: ");
        int num = teclado.nextInt();
        for (int i = num; i > 0; i--) {
            if (num % i == 0) {
                System.out.println(i);
            }

        }

    }

    public static void metodo2() {
        teclado = new Scanner(System.in);
        int total = 0, temp;
        System.out.println("Inserte el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Inserte el segundo numero: ");
        int num2 = teclado.nextInt();
        temp = num1;
        num1 = Math.min(num1, num2);
        num2 = Math.max(temp, num2);
        
        for (; num1 != num2; num1++){

            if (num1 % 2 != 0) {
                System.out.println(num1);
                total += num1;
            }

        }
        System.out.println("La suma total de los numeros es: " + total);
    }

    public static void metodo3() {
        teclado = new Scanner(System.in);
        System.out.println("Inserte un numero entero: ");
        int num = teclado.nextInt();
        if (num < 0) {
            System.out.println("Debe ser positovo");
            num = teclado.nextInt();
        }

        for (int i = 1; i != 11; i++) {
            System.out.println("\t" + num + " x " + i + " = " + num * i);
        }

    }

    public static void metodo4() {
        teclado = new Scanner(System.in);
        System.out.println("Inserte el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Inserte el segundo numero: ");
        int num2 = teclado.nextInt();
        int i = 0;
        for (int resto = num1; resto >= 0; resto -=num2 ) {
            
            i++;
            
        }
        System.out.println(num1);
    }

}
