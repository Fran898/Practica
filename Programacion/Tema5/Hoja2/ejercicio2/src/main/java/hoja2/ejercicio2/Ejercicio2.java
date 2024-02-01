/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Perecedero[] per = new Perecedero[5];
        EnPromocion[] pro = new EnPromocion[5];
        
        for (int i = 0; i < per.length; i++) {
            System.out.println("Informacion  del primer producto");
            per[i] = new Perecedero();
            pro[i] = new EnPromocion();
        }

    }
}
