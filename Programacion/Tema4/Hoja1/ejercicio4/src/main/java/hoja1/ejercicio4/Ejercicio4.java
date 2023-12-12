/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio4;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] temp = new int[10];

        
        
        for(int i = 0, j = (num.length-1); j > -1; i++, j--){
            temp[i] = num[j];
            System.out.println(temp[i]);
        }

    }
}
