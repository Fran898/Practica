/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja7.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        try {
            System.out.println("Inserte un numero: ");
            int  num1 = new Scanner(System.in).nextInt();
            System.out.println("Inserte por que numero lo divide: ");
            int num2 = new Scanner(System.in).nextInt();
            
            System.out.println("El resultado es " + (num1/num2));

        } catch (InputMismatchException e) {
            System.out.println("El numero insertado es incorrecto");
            
        } catch (ArithmeticException e) {
            System.out.println("La operacion no es valida");

        }

    }
}
