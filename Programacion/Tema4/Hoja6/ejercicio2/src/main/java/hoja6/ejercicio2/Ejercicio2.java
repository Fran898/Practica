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
        Banco ban = new Banco(2);;
        
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
                case 1 -> ban.ingresar();
                case 2 -> System.out.println("Mostrar");
                case 3 -> System.out.println(ban.buscar());
                case 4 -> {
                    System.out.println("Inserte el numero del usuario que desea eliminar: ");
                    int temp = teclado.nextInt();
                    ban.eliminar(temp);
                }
                case 5 -> opc = 5;
                default -> System.out.println("Opcion no valida"); 
            }
            
            
        }while(opc != 5);
        
        
        
    }
}
