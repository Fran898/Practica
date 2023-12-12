/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio7;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] num = {10, 7, 35, 47, 3, 9, 21, 23, 61, 71};

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[j] > num[i]) {
                    int aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;

                }

            }

        }
        
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

    }
}
