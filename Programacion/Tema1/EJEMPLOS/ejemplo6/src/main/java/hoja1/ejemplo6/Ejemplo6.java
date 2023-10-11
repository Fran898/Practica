/*
 * Escribir un programa que pida un número al usuario e indique mediante 
 * un literal booleano si el número es par. 
 */

package hoja1.ejemplo6;

/**
 *
 * @author cic
 */
public class Ejemplo6 {

    public static void main(String[] args) {
        int numero=56;
        boolean par=(numero%2==0); 
        System.out.println("Si es true el número es par "+ par);
    }
}
