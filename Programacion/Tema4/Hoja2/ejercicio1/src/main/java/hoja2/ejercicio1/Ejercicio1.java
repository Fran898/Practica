/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Operaciones op = new Operaciones(14,32,1,5,9);
        
        
        op.enseñar();
        op.doble();
        op.enseñar();
        System.out.println(op.sumaPar());
    }
}
