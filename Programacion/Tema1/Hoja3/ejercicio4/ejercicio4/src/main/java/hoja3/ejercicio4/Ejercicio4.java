/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        //Variables
        double a;
        double b;
        double c;
        double x;
        
        //Entra de datos
        System.out.println("Inserte el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Inserte el valor de b: ");
        b = teclado.nextDouble();
        System.out.println("Inserte el valor de c: ");
        c = teclado.nextDouble();
        System.out.println("Inserte el valor de x: ");
        x = teclado.nextDouble();
        
        //Resultado
        System.out.println("La operación queda: y=" + a + x + "^2+" + b + x + "+" + c);
        System.out.println("El resultado es y=" +((a*Math.pow(x,2))+(b*x)+c));
        
        
        
        
    }
}
