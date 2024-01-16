/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja7.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Alumno al = new Alumno("Andy");
        System.out.println("Mayor: " + al.mayor());
        System.out.println("Menor: " + al.menor());
        System.out.println("La posicion es: " + al.buscar(10));
        for (int i = 0; i < al.tresMejores().length; i++) {
            System.out.println("Nota Nº " + (i + 1) + " es: " + al.tresMejores()[i]);

        }
        
        al.ponerACero();

        for (int i = 0; i < al.tresMejores().length; i++) {
            System.out.println("Nota Nº " + (i + 1) + " es: " + al.tresMejores()[i]);

        }
    }
}
