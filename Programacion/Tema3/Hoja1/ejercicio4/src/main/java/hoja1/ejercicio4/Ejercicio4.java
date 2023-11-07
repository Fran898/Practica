/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio4;

/**
 *
 * @author dam1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Billete billete1 = new Billete(900,8);
        Billete billete2= new Billete(700,5);
        
        
        System.out.println("Ha de pagar " + billete1.importa() + "€");
        System.out.println("Ha de pagar " + billete2.importa() + "€");

    }
}
