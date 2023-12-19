/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = {{101, 102, 103, 104, 105}, {201, 202, 203, 204, 205}, {301, 302, 303, 304, 305}, {401, 402, 403, 404, 405}, {501, 502, 503, 504, 505}};
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1.- Elegir fila");
            System.out.println("2.- Elegir columna");
            System.out.println("3.- Diagonal");
            System.out.println("4.- Diagonal inversa");
            System.out.println("5.- Diagonal hacia arriba");
            System.out.println("6.- Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1 ->{
                    System.out.println("Inserte el numero de fila: ");
                    int num = (teclado.nextInt()-1);
                    if(num <= matriz.length){
                        for(int numero:matriz[num]){
                            System.out.println(numero + " ");
                        }
                    }
                    
                    
                }
                
                case 2 ->{
                    System.out.println("Inserte el numero de columna: ");
                    int num = (teclado.nextInt()-1);
                    
                }
                    
                    
                    
                }
                
                case 3 -> {
                    
                }
                
                case 4 -> {
                    
                }
                
                case 5 -> {
                    
                }
                
                case 6 -> salir = true;
                
                default -> System.out.println("Opcion no valida");
            }
            
            
            
        }
    }
}
