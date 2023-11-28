/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operaciones op;
        boolean start = true;
         int opcion = 0, num;
             System.out.println("Inserta un numero: ");
            num = teclado.nextInt(); 
            op = new Operaciones (num);
        while (start){      
            System.out.println("Selecciona una de las opcion: ");
            System.out.println("1.- Contar cuantas cifras tiene");
            System.out.println("2.- Sus 10 primeros múltiples");
            System.out.println("3.- Saber si es perfecto");
            System.out.println("4.- Salir");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1 -> System.out.println("El numero tiene "  + op.metodo1() + " cifras");
                case 2 -> op.metodo2();
                case 3 -> op.metodo3();
                case 4 -> start = false;
                default -> System.out.println("No es una opcion valida, vuelva a intentar");
            }
        }
        
        
    }
}
