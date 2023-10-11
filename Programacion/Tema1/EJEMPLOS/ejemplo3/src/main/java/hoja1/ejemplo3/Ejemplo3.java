/*
 * El tipo short permite almacenar valores comprendidos entre -32768 y 32767. 
 * Escribir un programa que compruebe el rango de valores de un tipo se comporta 
 * de forma cíclica, es decir, el valor siguiente al máximo es el valor mínimo.
 */

package hoja1.ejemplo3;

/**
 *
 * @author cic
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        short numero = 32767;
	System.out.println("Defino una variable llamada numero de tipo short, con el valor máximo del rango");
	System.out.println("numero "+numero);
	numero++;
	System.out.println("Incremento numero en uno, y según el comportamiento cíclico, pasa a tener el valor mínimo representable del tipo short");
	System.out.println("numero "+numero);
    }
}
