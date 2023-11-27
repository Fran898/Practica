/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio5;

import java.util.Random;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10-1+1)+1;
        int max = num, min = num;
        for(int i = 1; i <= 10; i++){
            num = random.nextInt(10-1+1)+1;
          
           if(max < num){
               max = num;
           }else if(min > num){
               min = num;
           }
            System.out.println("Numero " + i + " es: " + num);
        }
        System.out.println("El valor más alto es: " + max + " y el valor mas bajo es: " + min);
        
        
    }
}   
