/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Libro libro = new Libro("9788499640884", "Ejercicio 2", "Francisco");
        
        
        System.out.println("El IBSN es: " + libro.getIsbn());
        System.out.println("El titulo y autor del libro es: " + libro.mostrar());
        System.out.println("El libro es Español o no: " + libro.esEspanol());
    }
}
