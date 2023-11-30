/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio4;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int j = 1;
        for(int i = 1; i <= 100; i++){
            for(; j == i; j += 10){
                System.out.println("Ciclo Nº " +j);
            }
            
            System.out.println(i);
        }
        
    }
}
