/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Monedero cuenta = new Monedero(20);
        
        cuenta.meterDinero(10.4);
        cuenta.mostrarDinero();
        
        cuenta.sacarDinero(50);
        cuenta.mostrarDinero();
        
        cuenta.sacarDinero(20);
        cuenta.mostrarDinero();
        
        
    }
}
