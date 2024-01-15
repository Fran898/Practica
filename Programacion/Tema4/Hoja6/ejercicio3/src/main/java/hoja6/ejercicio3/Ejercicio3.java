/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda ag = new Agenda(2);
        
        
        int opc;
        do {
            System.out.println("Selecciona un opcion: ");
            System.out.println("1- Nuevo contacto");
            System.out.println("2- Mostrar agenda");
            System.out.println("3- Buscar contacto");
            System.out.println("4- Ver el numero de contactos en la agenda");
            System.out.println("5- Modificar telefono de contacto");
            System.out.println("6- Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> ag.insertar();
                case 2 -> System.out.println(ag.mostrar());
                case 3 -> System.out.println(ag.buscar());
                case 4 -> System.out.println("Hay " + ag.getContador() + " personas en la agenda");
                case 5 -> ag.modificar();
                case 6 -> opc = 6;
                default ->
                    System.out.println("Opcion no valida");                
            }
            
        } while (opc != 6);
    }
}
