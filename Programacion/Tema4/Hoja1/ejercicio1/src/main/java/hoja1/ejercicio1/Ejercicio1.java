/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] num = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};

        for (int i = 0; i < num.length; i++) {
            num[i]++;
            System.out.print(num[i] + " ");
        }   
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            
            num[i] = (int)Math.floor(Math.random()*101);
            System.out.print(num[i] + " ");
        }

    }
}
