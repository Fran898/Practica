/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        int segundos;
        int minutos;
        int horas;
        int seg;

        //Entrada  7450 segundos son 2 horas, 4 minutos y 10 segundos.
        System.out.println("Inserte una cantidad de segundos: ");
        segundos = teclado.nextInt();
        horas = segundos / 3600;
        minutos = (segundos / 60) - (horas * 60);
        seg = segundos - ((minutos * 60) + (horas * 3600));

        //Salida       
        System.out.println("En total son: " + horas + "h " + minutos + "m " + seg + "s");
        System.out.println("Equivalen a " + (segundos / 3600) + "h, " + (segundos / 60) + "m o " + (segundos) + "s");

    }
}
