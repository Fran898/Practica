/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.prueba;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAsteriscosLado;
        System.out.print("Introduce el número de astericos por lado: ");
        numAsteriscosLado = entrada.nextInt();
//Dibujamos la parte de arriba del cuadrado
        for (int cont = 0; numAsteriscosLado > cont; cont++) {
            System.out.print("*");
        }
        System.out.println("");
//Usamos un bucle anidado para dibujar los asteriscos del medio
//Calcula las filas intermedias poniendo un * al inicio y final de llas.
        for (int cont = 1; (numAsteriscosLado - 2) >= cont; cont++) {
            System.out.print("*");
//Este bucle dibuja los espacio entre el primer y ultimo asterisco
//de cada una de las filas.
            for (int i = 0; (numAsteriscosLado - 2) > i; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
//Dibujamos la parte de abajo del cuadrado
        for (int cont = 0; numAsteriscosLado > cont; cont++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
