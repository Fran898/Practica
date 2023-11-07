/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Calculo {

    
    public Calculo() {

    }

    public void cienyMil() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        double num = teclado.nextDouble();
        if (num > 100 && num < 1000) {
            System.out.println("El numero " + num + " esta entre 100 y 1.000");

        } else {
            System.out.println("El numero " + num + " no esta entre 100 y 1.000");
        }

    }

    public void posOno() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        double num = teclado.nextDouble();

        if (num > 0) {

            System.out.println("El numero " + num + " es positivo");

        } else if (num < 0) {

            System.out.println("El numero " + num + " es negativo");

        } else {

            System.out.println("El numero " + num + " es nulo");
        }
    }

    public void div25() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        double num = teclado.nextDouble();

        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("El numero " + num + " es divisible entre 2 y 5 a la vez");

        }else{
            System.out.println("El numero" + num + " no es divisible entre 2 y 5 a la vez");
        }
    }

    public void frac() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        double num = teclado.nextDouble();

        if (num / (int) num == 1) {

            System.out.println("El numero es entero");

        } else {

            System.out.println("El numero tiene parte fraccionaria");
        }

    }

    public void bisi() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un año entre 1900 y 2100: ");
        double num = teclado.nextDouble();

        if (num < 1900 && num > 2100) {

            System.out.println("No entra dentro de las opciones dadas");

        } else if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {

            System.out.println("El año " + num + " es bisiesto");

        } else {
            System.out.println("El año " + num + " no es bisiesto");
        }
    }

    public void par() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        double num = teclado.nextDouble();

        if (num % 2 == 0) {

            System.out.println("El numero " + num + " es par");

        } else {

            System.out.println("El numero " + num + " es impar");
        }
    }

    public void par2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un numero: ");
        double num = teclado.nextDouble();

        if (num < 1 || num > 10) {

            System.out.println("No entra en las opciones dadas");

        } else if (num % 2 == 0) {

            System.out.println("El numero " + num + " es par");

        } else {

            System.out.println("El numero " + num + " es impar");

        }
    }

    public void maxMin() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte numero 1: ");
        double num1 = teclado.nextDouble();
        System.out.println("Inserte numero 2: ");
        double num2 = teclado.nextDouble();
        System.out.println("Inserte numero 3: ");
        double num3 = teclado.nextDouble();

        System.out.println("El menor numero es " + Math.min(Math.min(num1, num2), num3) + " y el mayor numero es " + Math.max(Math.max(num1, num2), num3));

    }

    public void divisor() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte numero 1 : ");
        double num1 = teclado.nextDouble();
        System.out.println("Inserte numero 2 (divisor): ");
        double num2 = teclado.nextDouble();

        if (num1 % num2 == 0) {

            System.out.println("El numero " + num2 + " es divisor de " + num1);

        } else {

            System.out.println("los numeros no son divisores");
        }

    }

}
