/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja5.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora, minutos, segundos;
        System.out.println("Introduce la hora:");
        hora = teclado.nextInt();
        System.out.println("Introduce los minutos:");
        minutos = teclado.nextInt();
        System.out.println("Introduce los segundos:");
        segundos = teclado.nextInt();

        for (int i = hora; i <= 23; i++) {
            
            for (int j = minutos; j <= 59; j++) {
               
                for(int k = segundos; k <= 59; k++){
                    System.out.print(i+":"+j+":"+k);
                    System.out.println("");
                }
            }
        }

    }
}
