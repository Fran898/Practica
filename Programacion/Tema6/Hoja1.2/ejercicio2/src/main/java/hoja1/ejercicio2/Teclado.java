/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Teclado {
    
    //Hacer loop si se necesita seguir preguntando (como un constructor)
    public static String string(String texto) {
        System.out.println(texto);
        return new Scanner(System.in).nextLine();
    }
    
    public static int entero(String texto) {
        System.out.println(texto);
        int temp = 0;
        try {
            temp = new Scanner(System.in).nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Error: no se ha introducido un entero");
        }
        
        return temp;
    }
    
    public static double doble(String texto) {
        System.out.println(texto);
        double temp = 0;
        try {
            temp = new Scanner(System.in).nextDouble();
        } catch (InputMismatchException a) {
            System.out.println("Error: no se ha introducido un numero");
        }
        return temp;
    }
    
    public static boolean boleano(String cadena) {
        boolean temp = false;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        String x;
        do {
            try {
                System.out.println(cadena + " (Si/No)");
                System.out.println();
                x = teclado.nextLine();
                if (x.equalsIgnoreCase("Si") || x.equalsIgnoreCase("S")) {
                    temp = true;
                    salir = true;
                } else if (x.equalsIgnoreCase("No") || x.equalsIgnoreCase("N")) {
                    temp = false;
                    salir = true;
                } else {
                    throw new Exception();
                }                
            } catch (Exception e) {
                System.out.println("Error: respuesta no valida");
            }
        } while (!salir);
        return temp;
    }
    
    public static LocalDate fecha(String texto) {
        System.out.print(texto);
        int dia = entero("Introduce el dia: ");
        int mes = entero("Introduce el mes: ");
        int anio = entero("Introduce el año: ");
        LocalDate temp = LocalDate.now();
        try {
            temp = LocalDate.of(dia, mes, anio);
        } catch (DateTimeException a) {
            System.out.println("Error: Los datos no son validos para el formato de fecha");
        }
        return temp;
    }
    
    
}
