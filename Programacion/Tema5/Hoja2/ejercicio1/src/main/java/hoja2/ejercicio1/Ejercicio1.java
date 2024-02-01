/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Empleado em = new Empleado(1000);
        System.out.println(em.getSueldo());
        Encargado en = new Encargado();
        System.out.println(en.getSueldo());
        
    }
}
