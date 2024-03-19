/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
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

    public static int entero(String mensaje) {
        System.out.println(mensaje);
        int temp = 0;
        try {
            temp = new Scanner(System.in).nextInt();

        } catch (InputMismatchException e) {
            System.out.println("No es un numero entero");
        }
        return temp;

    }

    //Metodo estatico de validacion para fechas, (String mensaje, LocalDate fecha), introducir fecha de devolucion es valida
    public static LocalDate validarFecha(String mensaje, LocalDate fecha) {
        boolean valido = false;
        LocalDate temp = LocalDate.now();
        do {
            System.out.println(mensaje);
            int dia = entero("Inserte el dia");
            int mes = entero("Inserte el mes");
            int anno = entero("Inserte el año");
            
           
            try {
                temp = LocalDate.of(anno, mes, dia);
                if (fecha.isAfter(temp)) {
                    DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' ");
                    String texto = "La fecha debe ser posterior a " + temp.format(f);
                    throw new MiExcepcion(texto);
                }
                valido = true;
                

            } catch (DateTimeException e) {
                System.out.println("Los datos introducidos no son correctos"+e.toString());

            }catch (MiExcepcion e){
                System.out.println(e.getMessage());
            }
            
        }while(!valido);
        
        return temp;
        
        
    }

}
