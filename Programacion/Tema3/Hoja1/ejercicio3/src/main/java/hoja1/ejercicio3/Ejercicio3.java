/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       Llamada llamada = new Llamada();
       
        System.out.println("Debe pagar " + llamada.aPagar(0, 50) + "€");
        
        System.out.println("Debe pagar "+ llamada.aPagar(2, 35) + "€");
    }
}
