/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio1;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        CajaAhorro temp = new CajaAhorro();
        CajaAhorro caja2 = new CajaAhorro(200);

        temp.depositar(50);
        System.out.println("Actualmente tiene: " + temp.obtenerSaldo());
        temp.girar(25);
        System.out.println("Actualmente tiene: " + temp.obtenerSaldo());
        System.out.println("Ha realizado " + temp.obtenerTransicciones() + " transacciones");
        
        System.out.println("Actualmente tiene " + caja2.obtenerSaldo());
        System.out.println("Ha realizado " + caja2.obtenerTransicciones() + " transacciones");

    }
}
