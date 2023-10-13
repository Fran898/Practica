/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Restaurante huevos = new Restaurante(2,5);
        
        System.out.println(huevos.getHuevos());
        huevos.sirvePlato();
        System.out.println(huevos.getHuevos());
        huevos.addHuevos(2);
        huevos.addChorizo(3);
        System.out.println("Puedo hacer " + huevos.getNumPlatos() + " de platos");
        System.out.println("Hay " + huevos.getChorizo() + "kg de chorizo");
        System.out.println("Hay " + huevos.getHuevos() + " huevos");
        
    }
}
