/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Invierno inv = new Invierno(5);
        
        
        System.out.println(inv.mostrar(inv.getTemp()));
        System.out.println(inv.mostrar(inv.fahrenheit()));

        
    }
}
