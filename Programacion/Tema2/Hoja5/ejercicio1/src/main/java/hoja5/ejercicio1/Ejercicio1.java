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
        Restaurante rest = new Restaurante(4,5);
        
    
        rest.sirvePlato();
       
        rest.addHuevos(2);
        rest.addChorizo(3);
        System.out.println("Puedo hacer " + rest.getNumPlatos() + " platos");
        System.out.printf("Hay %,.2fkg de chorizo\n",rest.getChorizo());
        System.out.println("Hay " + rest.getHuevos() + " huevos");
        
    }
}
