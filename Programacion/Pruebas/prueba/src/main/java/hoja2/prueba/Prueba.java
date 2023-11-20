/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.prueba;

/**
 *
 * @author dam1
 */
public class Prueba {

    public static void main(String[] args) {
        boolean salir = false;

        int n;
        int i = 0;
        while (salir == false && i <= 5) {
            n = (int) Math.floor(Math.random() * 499 + 1);
            System.out.println(n);
            salir = (n % 7 == 0);
            i++;
        }
    }
}
