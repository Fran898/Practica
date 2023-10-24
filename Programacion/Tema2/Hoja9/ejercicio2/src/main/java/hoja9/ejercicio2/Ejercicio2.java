/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alimento comida = new Alimento("Fran",10,8,false);
        
        
        System.out.println("Es dietetico: " + comida.esDietetico());
        System.out.printf("Calorias: %.0f\n",comida.calorias(6));
        System.out.println(comida.todo());
        
    }
}
