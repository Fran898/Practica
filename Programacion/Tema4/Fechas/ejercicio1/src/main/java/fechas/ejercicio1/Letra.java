/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    
    
    
    public Letra(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el numero de letra: ");
        numLetra = teclado.nextInt();
        System.out.println("Inserte el nombre del titular: ");
        titular = teclado.nextLine();
        System.out.println("Inserte el importe: ");
        importe = teclado.nextDouble();
        System.out.println("Inserte la fecha con formato dd-mm-yyyy: ");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        fechaVencimiento = LocalDate.parse(teclado.nextLine(),f);
        
        
    }
    
    
    
    
    
}
