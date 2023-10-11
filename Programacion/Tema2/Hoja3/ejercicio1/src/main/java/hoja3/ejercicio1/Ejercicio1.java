/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        //Creacion de objetos
        Scanner teclado = new Scanner(System.in);
        Finanzas finanzas = new Finanzas();
        Finanzas finanza2 = new Finanzas(1.10);
    
        double dolares;
        
        
        //Dolares a euros
        System.out.println("Inserte la cantidad de dolares que tenga: ");
        dolares = teclado.nextDouble();
        finanzas.dolaresToEuros(dolares);
        
        System.out.printf("Equivalen a %.2f € \n", finanzas.getDinero() );
        
        //Euros a dolares
        System.out.println("Inserte la cantidad de euros que tenga: ");
        
        finanzas.eurosToDolares(teclado.nextDouble());
        
        System.out.printf("Equivalen a %.2f € \n", finanzas.getDinero() );
         
        //Dolares a euros 2
        System.out.println("Inserte la cantidad de dolares que tenga: ");
        finanza2.dolaresToEuros(teclado.nextDouble());
        
        System.out.printf("Equivalen a %.2f € \n", finanza2.getDinero() );
         
        
         
    }
}