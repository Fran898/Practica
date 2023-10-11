/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        
        System.out.println("Inserte meridiano, paralelo y distancia de la Tierra: ");
        Satelite satelite = new Satelite(teclado.nextDouble(), teclado.nextDouble(), teclado.nextDouble());
        
        satelite.printPosicion();
        
        System.out.println("Varia la distancia de la Tierra: ");
        satelite.variarAltura(teclado.nextDouble());
        
        System.out.println("Variar el valor meridiano y paralelo: ");
        satelite.variarPosicion(teclado.nextDouble(), teclado.nextDouble());
        
        System.out.println("El Satélite esta en orbita: " + satelite.enOrbita());
        
        satelite.printPosicion();
        
    }
}
