/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       
        Triangulo triangulo1 = new Triangulo(10,10,10);
        Triangulo triangulo2 = new Triangulo(20,20,10);

        
        System.out.println("El triangulo1 es isosceles: " + triangulo1.esIsosceles());
        System.out.println("El triangulo1 es equilatero: " + triangulo1.esEquilatero());
        System.out.println("Perimetro del triangulo 1: " + triangulo1.perimetro());
        System.out.println("El triangulo1 es isosceles: " + triangulo2.esIsosceles());
        System.out.println("El triangulo1 es equilatero: " + triangulo2.esEquilatero());
        System.out.println("Perimetro del triangulo 2: " + triangulo2.perimetro());
    }
}
