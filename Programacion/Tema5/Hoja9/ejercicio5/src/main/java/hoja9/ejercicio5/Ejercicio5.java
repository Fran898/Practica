/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja9.ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int num = new Random().nextInt(0, 501);
        int contador = 0;
        boolean juego = false;
        System.out.println("Adivine el numero generado: ");
        
        do {
            try {
                int temp = new Scanner(System.in).nextInt();
                if(num != temp){
                    System.out.println("Numero incorrecto, numero de intentos " + contador + ", vuelva a intentarlo" + num);
                    contador++;
                }else{
                    juego = true;
                }
            }catch(InputMismatchException e){
                System.out.println("No se ha introducido un valor adecuado");
                contador++;
            }

        }while(!juego);
        System.out.println("Has adivinado el numero " + num +"!!!");
        System.out.println("Intentos realizados " + contador);
    }
}
