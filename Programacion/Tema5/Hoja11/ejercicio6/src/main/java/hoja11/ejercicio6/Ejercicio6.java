/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja11.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte un texto: ");
        String temp = teclado.nextLine();
        caracterEn(temp, 7);
        
    }

    public static void caracterEn(String texto, int n) {
        try {
            if (n <= texto.length() - 1) {
                System.out.println(texto.charAt(n));
            } else {
                throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
}
