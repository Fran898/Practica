/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio6;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] num = {10, 7, 35, 47, 3, 9, 21, 23, 61, 71};
        int temp = num[0];
        for(int i = 0; i < num.length; i++){
            if (temp < num[i]){
                temp = num[i];
            }
        }
        System.out.println("El numero más grande es: " + temp);

        

    }
}
