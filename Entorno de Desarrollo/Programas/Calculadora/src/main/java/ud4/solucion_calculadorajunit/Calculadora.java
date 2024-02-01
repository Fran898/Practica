/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ud4.solucion_calculadorajunit;

/**
 *
 * @author Alvaro
 */
public class Calculadora {

    public static void main(String[] args) {
        Resta R = new Resta();
        System.out.println("Resta: "+ R.getResta(10,3));
        System.out.println("Decrementa: " + R.decrementa(6));
        
        Suma S = new Suma();
        System.out.println("Suma: "+ S.getSuma(10,3));
        System.out.println("Incrementa: " + S.incrementa(6));
    }
}
