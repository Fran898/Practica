/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Multiplicar m = new Multiplicar();
        m.mostrar();
        m.multiplica();
        System.out.println("-------------------");
        m.mostrar();
        System.out.println("-------------------");
        m.valoresAspa();
        System.out.println("Inserte un numero del 1-9: ");
        int temp = teclado.nextInt();
        m.tablaMultiplicar(temp);
    }
}
