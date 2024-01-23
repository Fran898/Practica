/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        if (args[0].length() > 0 && args[0].length() < 4) {
            int potencia = args[0].length();
            int num1 = Integer.parseInt(args[0].substring(0, 1));
            int num2 = Integer.parseInt(args[0].substring(1, 2));
            int num3 = Integer.parseInt(args[0].substring(2, 3));
            if (((Math.pow(num1, potencia)) + (Math.pow(num2, potencia)) + (Math.pow(num3, potencia))) == Integer.parseInt(args[0])) {
                System.out.println("Es Armstrong");
            } else {
                System.out.println("No es Armstrong");
            }
        }else{
            System.out.println("No es un numero valido");
        }

    }
}
