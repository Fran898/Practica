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
        
        cuenta.meterDinero(10.4);
        cuenta.mostrarDinero();
        
        cuenta.sacarDinero(50);
        cuenta.mostrarDinero();
        
        cuenta.sacarDinero(20);
        cuenta.mostrarDinero();
        
        
    }
}
