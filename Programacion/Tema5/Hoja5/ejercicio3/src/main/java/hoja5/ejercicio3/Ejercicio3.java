/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda a = new Agenda(3);
        Contacto c1 = new Contacto("Manolo", "AAA", 456, "asd", 8, 11, 2000);
        Contacto c2 = new Contacto("Alvaro", "BBB", 456, "asd", 20, 2, 1998);
        Contacto c3 = new Contacto("Eustaquio", "CCC", 456, "asd", 19, 9, 1987);
        a.insertar(c1);
        a.insertar(c2);
        a.insertar(c3);
        
        System.out.println(a.toString());
        
        Arrays.sort(a.contactos);
        
        System.out.println(a.toString());
        
       
        a.eliminar("Alvaro");
        
        System.out.println(a.toString());
    }
}