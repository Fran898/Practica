/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Teclado {

    public static String cadena(String mensaje) {
        System.out.println(mensaje);
        String temp = "";
        try {
            temp = new Scanner(System.in).nextLine();
            if (temp.length() == 0) {
                System.out.println("No hay valor");
                throw new MiExcepcion("Error");
            }
            
            
        } catch (MiExcepcion e) {
            System.out.println("Error");

        } catch (Exception e) {
            System.out.println("Error desconocido");
        }
        return temp;
    }

    public static float numero(String mensaje) {
        System.out.println(mensaje);
        float temp = 0;
        try {
            temp = new Scanner(System.in).nextFloat();

        } catch (InputMismatchException e) {
            System.out.println("No es un numero");
        }
        return temp;

    }
    
    

}
