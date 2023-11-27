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
        Scanner teclado = new Scanner(System.in);
        int total = 0, i = 0;
       
        System.out.println("Inserte cuanto quiere donar: ");
        
        for(; total < 600; i++){
            int dinero = teclado.nextInt();
            total += dinero;
            System.out.println("Dinero total reunido: " + total + "€");
            
        }
        
        
        System.out.println("Se han necesitado " + i + " para los " + total + "€");
        
        
        
        
    }
}
