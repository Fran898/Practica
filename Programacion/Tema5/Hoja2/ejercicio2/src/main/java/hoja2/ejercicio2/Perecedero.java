/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Perecedero extends Articulo{
    protected LocalDate caducidad;
    
    
    public Perecedero(){
        super();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta el mes y año de caducidad");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        caducidad = LocalDate.parse("01-"+teclado.nextLine(),f);
        System.out.println(caducidad.format(f));
        
    }
    
}
