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
        switch (num){
            case 1, 8, 15, 22, 29:
                dia = "Lunes";
                break;
            case 2, 9, 16, 23, 30:
                dia = "Martes";
        }
        
        
    }
}
