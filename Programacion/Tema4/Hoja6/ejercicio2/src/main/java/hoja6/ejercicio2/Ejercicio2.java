/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 * 
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco van = new Banco(2);
        van.ingresar();
        
        int opc;
        do{
            System.out.println("Selecciona un opcion: ");
            System.out.println("1- Ingresar un cliente");
            System.out.println("2- Mostrar los usuarios del banco");
            System.out.println("3- Buscar un cliente");
            System.out.println("4- Eliminar un cliente");
            System.out.println("5- Salir");
            opc = teclado.nextInt();
            switch(opc){
                case 1 -> ;
                case 2 -> ;
                case 3 -> ;
                case 4 -> ;
                case 5 -> opc = 5;
                default -> System.out.println("Opcion no valida"); 
            }
            
            
        }while(opc != 5);
        
        menu    
        
    }
}
