/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio2;

import java.util.Collections;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Asociacion a = new Asociacion();
        int temp = Integer.parseInt(args[0]);
        for (int i = 0; i < temp; i++) {
            Persona p = new Persona();
            a.insertar(p);
        }
        
        System.out.println(a.buscar(Teclado.string("Inserta un DNI: ")));
        System.out.println(a.todo());
        
        Collections.sort(a.getPersonas(), (o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
        
        System.out.println(a.todo());
    }
}
