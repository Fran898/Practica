/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja7.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        boolean temp = true;
        do {
            try {
                System.out.println("Inserte un numero entre el 0-100: ");
                int num = new Scanner(System.in).nextInt();

                if (num < 0 || num > 100) {
                    throw new Exception("El numero no cumple los requisitos");

                }
                temp = false;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                
            }

        }while(temp);
    }
    
    
    
}
