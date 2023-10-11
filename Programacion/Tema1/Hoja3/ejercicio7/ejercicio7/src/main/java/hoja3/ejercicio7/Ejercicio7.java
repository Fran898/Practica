/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        final int phorm = 6;
        final int para = 8;
        final int pcochi = 14;
        int horm;
        int ara;
        int cochi;
        
        
        //Entrada
        
        System.out.println("Inserte el número de hormigas: ");
        horm = teclado.nextInt();
        System.out.println("Inserte el número de arañas: ");
        ara = teclado.nextInt();
        System.out.println("Inserte el número de cochinillas");
        cochi = teclado.nextInt();
        
        //Salida
        System.out.println("Las patas totales son: " + ((horm*phorm) + (ara*para) + (cochi*pcochi)));
        
    }
}
