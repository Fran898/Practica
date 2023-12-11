/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja8.ejercicio2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        
        int num = 0;

        while (num >= 0) {
            System.out.println("Introduce total a pagar, -1 para salir:");
            num = teclado.nextInt();
            int numbola = random.nextInt(0, 4);
            String color;
            switch(numbola){
                case 0 -> color = "blanco";
                case 1 -> color = "amarillo";
                case 2 -> color = "azul";
                case 3 -> color = "rojo";
                default -> color = "";
                
            }
            
            
        
        }
    }

}
