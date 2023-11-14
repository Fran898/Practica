/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Inserte un numero intero: ");
        int num = teclado.nextInt();
        
        System.out.println("Que quieres hacer con el numero?");
        System.out.println("Opcion 1: calcular el cuadrado");
        System.out.println("Opcion 2: calcular el doble");
        System.out.println("Opcion 3: calcular la raiz cuadrada");
        int opcion = teclado.nextInt();
        
        switch(opcion){
            case 1 -> System.out.println(num +  " al cuadrado es: " + Math.pow(num, 2));
            case 2 -> System.out.println("El doble de " + num + " es: " + (num*2));
            case 3 -> System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
            default -> System.out.println("No es una opcion valida");         
                        
        }
        
        
        
    }
}
