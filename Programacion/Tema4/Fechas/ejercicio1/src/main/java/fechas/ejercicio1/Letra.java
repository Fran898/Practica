/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DAM114
 */
public class Letra {

    private int numLetra;
    private String titular;
    private double importe;
    private LocalDate fechaVencimiento;

    public Letra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el numero de letra: ");
        numLetra = teclado.nextInt();
        System.out.println("Inserte el nombre del titular: ");
        titular = teclado.next();
        System.out.println("Inserte el importe: ");
        importe = teclado.nextDouble();
        System.out.println("Inserte la fecha con formato dd-mm-yyyy: ");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaVencimiento = LocalDate.parse(teclado.next(), f);

    }

    public boolean vencida() {
        return fechaVencimiento.compareTo(LocalDate.now()) < 0;

    }

    public void demoran(int n) {
        fechaVencimiento = fechaVencimiento.plusDays(n);

    }

    public long diasFaltan() {
        return Duration.between(LocalDate.now().atStartOfDay(), fechaVencimiento.atStartOfDay()).toDays();
        
    }
    
    public void mostrar(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero de letra: " + numLetra);
        System.out.println("Importe: " + importe);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Fecha de vencimiento: " + fechaVencimiento.format(f));
        
    }
    
    public String devuelveMes(){
        
        return fechaVencimiento.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()); 
    }

    public String getTitular() {
        return titular;
    }
    

}
