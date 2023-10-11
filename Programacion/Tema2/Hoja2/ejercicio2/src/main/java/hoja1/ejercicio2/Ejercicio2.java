/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Crear objetos
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);

        //Entradas 
        System.out.println("Inserte radio: ");
        Circulo c3 = new Circulo(teclado.nextDouble());
        c1.setRadio(5);

        //Salidas
        System.out.println("El valor del radio de c1 es: " + c1.getRadio());
        System.out.println("El valor del radio de c3 es: " + c3.getRadio());
        System.out.println("El valor del area de c2 es: " + c2.area());
        System.out.printf("El valor del area de c3 es: %.2f  y la longitud: %.2f", c3.area(),c3.longitud());

    }
}
