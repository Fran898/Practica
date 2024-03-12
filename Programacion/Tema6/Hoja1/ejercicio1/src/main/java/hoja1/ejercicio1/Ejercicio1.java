/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Integer[] a = new Integer[0];
        
        Contenedor<Integer> c = new Contenedor(a);
        
        System.out.println(c.toString());
                
        c.insertarAlPrincipio(2);
        c.insertarAlPrincipio(5); 
        c.insertarAlFinal(1);
        System.out.println(c.toString());
        c.ordenar();
        System.out.println(c.toString());
        c.extraerDelPrincipio();
        System.out.println(c.toString());

        
    }
}
