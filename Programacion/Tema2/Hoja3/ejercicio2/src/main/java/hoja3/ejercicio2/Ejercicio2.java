/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Creacion de objetos
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Inserte numero 1");
        Numero num = new Numero(teclado.nextInt());
        
        System.out.println("Inserte numero 2");
        num.setNum2(teclado.nextInt());
        
        System.out.println("La suma de los numeros es: " + num.Suma());
        System.out.println("La resta de los numeros es: " + num.Resta());
        System.out.println("El doble del numero 1 es: " + num.Doble());
        System.out.println("El triple del numero 1 es: " + num.Triple());
        
    }
}
