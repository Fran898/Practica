/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Operaciones {

    private int num;

    public Operaciones() {

    }

    public Operaciones(int num) {
        this.num = num;

    }

    public int metodo1() {

        return (int) Math.log10(num) + 1;

    }

    public void metodo2() {
        for (int i = 1; i < 11; i++) {
            System.out.println("\t" + num + " x " + i + " = " + num * i);
        }

    }

    public void metodo3() {
        int total = 0;
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                total += i;

            }

        }
        boolean perf = total == num;
        System.out.println(num + " es un numero perfecto: " + perf);
    }
}
