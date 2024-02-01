/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estatico.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);
        
        System.out.println("Consumo total: " + AparatoElectrico.consumo() + "w");
        bombilla.enciende();
        plancha.enciende();
        System.out.println("Consumo total: " + AparatoElectrico.consumo() + "w");
        bombilla.apagar();
        System.out.println("Consumo total: " + AparatoElectrico.consumo() + "w");
        
    }
}
