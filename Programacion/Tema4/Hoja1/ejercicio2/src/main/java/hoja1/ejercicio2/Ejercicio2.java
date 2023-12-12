/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] temp = new int[10];
        int total = 0;
        
        for(int i = 0; i < temp.length; i++){
            System.out.println("Inserte una temperatura: " );
            temp[i] = teclado.nextInt();
            total += temp[i];
        }
        System.out.println("La temperatura media de todas las ciudades es: " + total/temp.length + "ºC");
        
    }
}
