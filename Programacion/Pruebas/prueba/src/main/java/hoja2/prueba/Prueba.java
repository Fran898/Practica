/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.prueba;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Prueba {

    public static void main(String[] args) {
        LocalDateTime fechaConHora = LocalDateTime.now();
        String idiomaLocal = System.getProperty("user.language");
        String paisLocal = System.getProperty("user.country");
        System.out.println("Formato actual del sistema (" + idiomaLocal + "-" + paisLocal + "): " + fechaConHora.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale(idiomaLocal, paisLocal))));
     
    }
    
    
   
}
