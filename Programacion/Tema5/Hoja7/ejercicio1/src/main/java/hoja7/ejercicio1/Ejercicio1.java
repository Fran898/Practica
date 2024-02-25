/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        boolean temp = true;
        do{
            try{
                System.out.println("Inserte un numero entero: ");
                int entero = new Scanner(System.in).nextInt();
                System.out.println("Inserte un numero con decimales: ");
                double dec = new Scanner(System.in).nextDouble();
                temp = false;
                
            }catch (InputMismatchException e){
                System.out.println("El numero es incorrecto");
            }
            
            
        }while(temp);
        
        
        
        
    }
}
