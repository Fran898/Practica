/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Variables
        final float PINF = 15.50f;
        final int PADULTO = 20;
        int numinf;
        int numadultos;
        float totalinf;
        float totaladult;
        float todo;
        float total;
        
        
        
        //Entradas
        System.out.println("Inserte el número de adultos: ");
        numadultos = teclado.nextInt();
        System.out.println("Inserte el número de niños: ");
        numinf = teclado.nextInt();
        
        //Calculos de entrada
        
        totaladult = (float)numadultos*(float)PADULTO;
        totalinf = (float)numinf*PINF;
        todo = totalinf + totaladult;
        //Descuento o no
        total = todo>100 ? (todo+(todo*0.05f)) : todo;
        
        //Salida
        
        System.out.println("El precio total es " + total);
                
        
        
         
        
        
        
    }
}
