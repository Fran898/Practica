/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author Francisco Sitjar
 */
public class ValidaDatos {

    public static boolean validarNombre(String n) {
        return n.matches("[a-zA-Z0-9]{3,}");
    }

    public static boolean validarFecha(LocalDate fecha) {
        return fecha.isBefore(LocalDate.now());
    }

    public static boolean validarDni(String dni) {
        boolean valido = false;
        int numDni = 0;
        if (dni.matches("[0-9]{8}[A-Z]")) {
            numDni = Integer.parseInt(dni.substring(0, 8));
            int resto = numDni % 23;
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            if (letras[resto] == dni.charAt(8)) {
                valido = true;
            }
        }

        return valido;
    }

}
