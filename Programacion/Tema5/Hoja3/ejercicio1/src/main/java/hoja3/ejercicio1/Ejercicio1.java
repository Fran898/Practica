/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Cono cono = new Cono(6,10);
        Cilindro cil = new Cilindro(7,24);
        
        System.out.println("Cono area: " + cono.area());
        System.out.println("Cono volumen: " + cono.volumen());
        System.out.println("Cilindro area: " + cil.area());
        System.out.println("Cilindro volumen: " + cil.volumen());
        
        
        
        
    }
}
