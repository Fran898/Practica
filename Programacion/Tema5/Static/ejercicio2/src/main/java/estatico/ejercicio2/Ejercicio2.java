/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estatico.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        Bombilla.general();
        b2.estado();    
        b2.privado();
        b2.estado();
        b1.estado();
    }
    
    
}
