/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Seleccionamos la temperatura
        System.out.println("Seleccione la temperatura del lugar: ");
        double temp = teclado.nextDouble();
        
        //Creacion de alarma
        Alarma alarma = new Alarma(temp);
        
        alarma.comprueba();
        
        System.out.println("El timbre esta " + alarma.getTimbre());
        
        if(alarma.getTimbre().equals(Timbre.ENCENDIDO)){
            alarma.normaliza();
            System.out.println("Se ha normalizado la temperatura");
        }
        
        
        
        System.out.println("El timbre esta " + alarma.getTimbre());
         
        
        
        
        
    }
}
