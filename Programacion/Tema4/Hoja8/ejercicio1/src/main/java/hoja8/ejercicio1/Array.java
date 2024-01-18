/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Array {

    private int[] vector;

    public Array() {
        vector = new int[10];
    }

    public void mostrar() {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public void introducir() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Inserte el numero nº" + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }

    }

    public int media() {
        int temp = 0;
        for (int i = 0; i < vector.length; i++) {
            temp += vector[i];
        }

        return temp / vector.length;
    }

    public void modificar(int num, int pos) {
        vector[(pos - 1)] = num;
    }

    public void rotarIzquierda() {
        int temp = vector[0];
        for (int i = 1; i < vector.length; i++) {
            vector[i - 1] = vector[i];

        }
        vector[vector.length - 1] = temp;
    }

    public void rotarDerecha() {
        int temp = vector[vector.length - 1];
        for (int i = vector.length - 1; i >= 1; i--) {
            vector[i] = vector[i - 1];

        }
        vector[0] = temp;
    }

    public void comparar(Array a) {
        for (int i = 0; i < vector.length; i++) {
            if (a.vector[i] == vector[i]) {
                System.out.print(vector[i] + " ");
            }
        }
        System.out.println("");

    }

    public void sumaPar() {
        int temp = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                temp += vector[i];
            }
        }

        System.out.println("La suma de los pares es: " + temp);
    }

    public void multiplos(int num) {
        int temp = 1;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = num * temp;
            temp++;
        }
    }

}
