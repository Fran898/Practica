/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package extra.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Sintonizador radio = new Sintonizador(107);
        Sintonizador radio2 = new Sintonizador(200);
        Sintonizador radio3 = new Sintonizador(radio2);
        
        
        
        radio.up();
        radio.up();
        radio.up();
        radio.up();
        System.out.println(radio.getFrecuencia());
        radio.down();
        radio.down();
        radio.down();
        System.out.println(radio.getFrecuencia());

        System.out.println("radio2 " + radio2.getFrecuencia());
        System.out.println("radio3 " + radio3.getFrecuencia());
        radio3.up();
        radio3.down();
        System.out.println("radio3 " + radio3.getFrecuencia());
        
        
        
    }
}
