/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        boolean temp = true;
        int contador = 0;
        do {
            try {
                System.out.println("Inserte un numero entre el 0-100: ");
                int num = new Scanner(System.in).nextInt();
                
                if (num < 0 || num > 100) {
                    contador++;
                    throw new Exception("El numero no cumple los requisitos, llevas " + contador + " intentos" );
                    
                }
                temp = false;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                
            }

        }while(temp);
    }
}
