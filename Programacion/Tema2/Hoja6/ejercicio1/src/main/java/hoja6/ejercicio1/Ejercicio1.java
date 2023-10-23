/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja6.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Taller taller1 = new Taller(5,20);
        Taller taller2 = new Taller(taller1);
        
        System.out.println("Litros de aceite " + taller1.getAceite());
        taller1.addAceite(2);
        System.out.println("Litros de aceite " + taller1.getAceite());
        System.out.println("Ruedas " + taller1.getRuedas()); 
        taller1.addRuedas(8);
        System.out.println("Ruedas " + taller1.getRuedas());
        System.out.println("Cambios completos " + taller1.getCambioCompletos());
        System.out.println("Cambios parciales " + taller1.getCambioParcial());
        taller1.cambioCompleto();
        System.out.println("Litros de aceite " + taller1.getAceite());
        System.out.println("Ruedas  " + taller1.getRuedas());
        taller1.cambioParcial();
        System.out.println("Litros de aceite " + taller1.getAceite());
        System.out.println("Ruedas  " + taller1.getRuedas());
        System.out.println(taller1.toString());
        
        System.out.println("Litros de aceite " + taller1.getAceite());
        taller1.addAceite(2);
        System.out.println("Litros de aceite " + taller1.getAceite());
        System.out.println("Ruedas  " + taller1.getRuedas()); 
        taller1.addRuedas(8);
        System.out.println("Ruedas " + taller1.getRuedas());
        System.out.println("Cambios completos " + taller1.getCambioCompletos());
        System.out.println("Cambios parciales " + taller1.getCambioParcial());
        taller1.cambioCompleto();
        System.out.println("Litros de aceite " + taller1.getAceite());
        System.out.println("Ruedas  " + taller1.getRuedas());
        taller1.cambioParcial();
        System.out.println("Litros de aceite " + taller1.getAceite());
        System.out.println("Ruedas  " + taller1.getRuedas());
        System.out.println(taller1.toString());
        
        //Taller2
        System.out.println("Litros de aceite " + taller2.getAceite());
        System.out.println("Ruedas  " + taller2.getRuedas());
        
        
        
    }   
        
}
