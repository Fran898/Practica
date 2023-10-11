/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
    
    //Variables
    
    int milim;
    int centim;
    int metros;
    
    //Entrada
    
    System.out.println("Inserte los milímetros: ");
    milim = teclado.nextInt();
    System.out.println("Inserte los centímetros: ");
    centim = teclado.nextInt();
    System.out.println("Inserte los metros: ");
    metros = teclado.nextInt();
    
    //Salida
    
   System.out.println("Los centímtros totales son: " + (centim + (milim/10) + (metros*100)));
    
    //System.out.println("Los centímtros totales son: " + (centim + milim + (metros*100)));

    
    
    
    }
}
