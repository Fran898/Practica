/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio3;



/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Monedero cuenta = new Monedero(20);
        
        System.out.println("Creo mi monedero con 20 euros");
        cuenta.meterDinero(10.4);
        System.out.println("Le añado 10,4 euros");
        System.out.printf("Tiene %,.2f euros\n",cuenta.getDinero());
        System.out.println("Intento sacar 50 euros");
        cuenta.sacarDinero(50);
        System.out.printf("Tiene %,.2f euros\n",cuenta.getDinero());
        System.out.println("Intento sacar 20 euros");
        cuenta.sacarDinero(20);
        System.out.printf("Tiene %,.2f euros\n",cuenta.getDinero());
        
            
    }
}
