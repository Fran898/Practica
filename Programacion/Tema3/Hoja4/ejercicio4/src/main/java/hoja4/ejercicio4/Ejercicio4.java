/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        //int pass = random.nextInt(1000, 10000);
        int pass = random.nextInt(9999-1000+1)+1000;
        System.out.println("Contraseña: " + pass);
        System.out.println("Inserte la contraseña: ");
        int num = 0;        
        for(int i  = 3;( i >= 0 ) && (pass !=num); i-- ){
            num = teclado.nextInt();
            if(pass != num){
                System.out.println("Lo siento, esa no es la combinación, le quedan " + i + " intentos");
            }
                        
        }               
        
    }
}
