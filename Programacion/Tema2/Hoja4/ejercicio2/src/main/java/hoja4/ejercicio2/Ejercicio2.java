/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Coche coche1 = new Coche("1234RET", 20);
        Coche coche2 = new Coche("4567KKK");
        coche1.getInfo();
        coche2.getInfo();
        coche2.frenar(10);
        coche2.getInfo();
        coche1.acelerar(80);
        coche1.getInfo();
        coche1.getMatricula();
    }
}
