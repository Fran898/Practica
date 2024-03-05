/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja10.ejercicio2;

import hoja10.ejercicio1.Griego;
import hoja10.ejercicio1.Troyano;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Troyano a = new Troyano("adios", 12, 23);
        Griego g = new Griego("hola", 23, 40);
        System.out.println(a.getEdad());
        System.out.println(a.getFuerza());
        System.out.println(a.getNombre());
        System.out.println(a.isHerido());
        System.out.println(a.isMuerto());
        System.out.println(g.getEdad());
        System.out.println(g.getFuerza());
        System.out.println(g.getNombre());
        System.out.println(g.isHerido());
        System.out.println(g.isMuerto());
        Griego[] t = new Griego[3];
        t[0] = g;
        t[1] = new Griego("manolo", 28, 20);
        t[2] = new Griego("alfonso", 24, 24);
        
        
        
        Caballo c = new Caballo(t);
        
        System.out.println(c.mostrar());
        c.ordenar();
        System.out.println(c.mostrar());
        
        System.out.println(c.buscar("ho"));
        
    }
}
