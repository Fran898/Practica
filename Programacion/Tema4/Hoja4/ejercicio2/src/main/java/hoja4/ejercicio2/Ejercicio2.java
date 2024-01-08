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
        Tabla tabla = new Tabla();
        
        tabla.mostrar();
        System.out.println("Numero mas grande en la fila: " + tabla.mayorF(2));
        System.out.println("Numero mas grande en la columna: " + tabla.mayorC(5));
        System.out.printf("Media: %,.2f",tabla.media());
        
    }
}
