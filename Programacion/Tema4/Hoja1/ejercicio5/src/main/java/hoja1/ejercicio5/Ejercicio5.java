/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio5;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] temp = new int[10];

        for (int i = 0, j = (num.length - 1); j > -1; i++, j--) {
            temp[i] = num[j];
            System.out.print(num[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < num.length; i++){
            num[i] = temp[i];
            System.out.print(num[i] + " ");
        }
    }
}
