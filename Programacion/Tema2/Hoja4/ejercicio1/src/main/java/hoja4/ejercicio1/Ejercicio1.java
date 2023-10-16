/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio1;



/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Creacion de objetos
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10f);
    
        c1.setRadio(6.30f);
        
        
        //Salida
        System.out.println("Radio del primer circulo: " + c1.getRadio());
        System.out.println("Radio del segundo circulo: " + c2.getRadio());

        
    }
}
