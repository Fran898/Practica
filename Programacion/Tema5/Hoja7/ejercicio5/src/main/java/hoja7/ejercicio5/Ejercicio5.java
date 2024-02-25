/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        System.out.println("Inserte un numero: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Inserte el divisor: ");
        int num2 = new Scanner(System.in).nextInt();
        try{
            System.out.println("El resultado de la division es: " + dividir(num1,num2));
        }catch(ArithmeticException e){
            System.out.println("Error, operacion no valida");
        }catch (InputMismatchException e) {
            System.out.println("El dato introducido es incorrecto");
        }
        
       
        
    }
    
    
     public static int dividir(int num1, int num2) throws ArithmeticException{
            return num1/num2;
            
        }
}
