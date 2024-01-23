/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pais pais = new Pais("España");
        
        int opc;
        do {
            System.out.println("Selecciona un opcion: ");
            System.out.println("1- Añadir ciudad");
            System.out.println("2- Ciudad con mas habitantes");
            System.out.println("3- Existe la ciudad o no?");
            System.out.println("4- Media de habitantes en todas las ciudades");
            System.out.println("5- Datos de todas las ciudades");
            System.out.println("6- Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> pais.addCiudad();
                case 2 -> System.out.println(pais.masHab());
                case 3 -> System.out.println("El pais existe: " + pais.existe("palma"));
                case 4 -> System.out.println("La media de los habitantes en todas las ciudades es: " + pais.mediaTotal());
                case 5 -> System.out.println(pais.toString());
                case 6 -> opc = 6;
                default ->
                    System.out.println("Opcion no valida");                
            }
            
        } while (opc != 6);
    }
}
