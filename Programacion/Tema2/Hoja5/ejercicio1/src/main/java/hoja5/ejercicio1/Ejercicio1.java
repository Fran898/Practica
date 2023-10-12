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

        
    }
}
