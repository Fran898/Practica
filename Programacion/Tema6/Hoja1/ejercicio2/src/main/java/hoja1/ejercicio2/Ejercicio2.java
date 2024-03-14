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
        Integer[] a = new Integer[0];
        Contenedor<Integer> c = new Contenedor<>(a);
        
        
        System.out.println("Introduce un numero: ");
        Integer n = new Scanner(System.in).nextInt();
        c.insertar(n);
        System.out.println(c.extraer());
        
    }
}
