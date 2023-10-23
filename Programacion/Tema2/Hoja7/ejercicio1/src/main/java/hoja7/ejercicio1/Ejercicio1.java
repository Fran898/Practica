/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja7.ejercicio1;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(20,10);
        
        rectangulo1.setLargo(30);
        rectangulo1.setAncho(16);
        
        System.out.println("Ancho de rectangulo 1: " + rectangulo1.getLargo());
        System.out.println("Largo de rectangulo 1: " + rectangulo1.getAncho());
        System.out.println("Ancho de rectangulo 2: " + rectangulo2.getLargo());
        System.out.println("Largo de rectangulo 2: " + rectangulo2.getAncho());
        System.out.println("Area del rectangulo 1: " + rectangulo1.area());
        System.out.println("Diagonal del rectangulo 2: " + rectangulo2.diagonal());
        
    }
}
