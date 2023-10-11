/*
 * Escribir un programa que pida un número al usuario y 
 * muestre su valor absoluto.
 */

package hoja1.ejemplo9;

/**
 *
 * @author cic
 */
public class Ejemplo9 {

    public static void main(String[] args) {
        int numero=66;
        int valor= numero<=0 ? -numero : numero;
        System.out.println("el valor absoluto es "+valor);
    }
}
