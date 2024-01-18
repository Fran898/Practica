/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja8.ejercicio1;


import java.util.Scanner;
/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Array ar = new Array();
        Array br = new Array();
        br.introducir();
        int opc;
        do {
            System.out.println("Selecciona un opcion: ");
            System.out.println("1- Mostrar");
            System.out.println("2- Introducir");
            System.out.println("3- Media");
            System.out.println("4- Modificar");
            System.out.println("5- Rotar a la izquierda");
            System.out.println("6- Rotar a la derecha");
            System.out.println("7- Comprar");
            System.out.println("8- Sumar pares");
            System.out.println("9- Multiplos de un numero");
            System.out.println("10- Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> ar.mostrar();
                case 2 -> ar.introducir();
                case 3 -> System.out.println("La media es: " + ar.media());
                case 4 -> {
                    System.out.println("Inserte un numero: ");
                    int num = teclado.nextInt();
                    System.out.println("Inserte la posicion: ");
                    int pos = teclado.nextInt();
                    ar.modificar(num, pos);
                }
                case 5 -> ar.rotarIzquierda();
                case 6 -> ar.rotarDerecha();
                case 7 -> ar.comparar(br);
                case 8 -> ar.sumaPar();
                case 9 -> {
                    System.out.println("Inserte un numero: ");
                    int temp = teclado.nextInt();
                    ar.multiplos(temp);
                }
                case 10 -> opc = 10;
                default ->
                    System.out.println("Opcion no valida");                
            }
            
        } while (opc != 10);

       
    }
    
}
