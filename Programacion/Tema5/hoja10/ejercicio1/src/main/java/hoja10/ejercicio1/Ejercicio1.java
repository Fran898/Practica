/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja10.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Troyano a = new Troyano("adios", 12, 23);
        
        System.out.println(a.getEdad());
        System.out.println(a.getFuerza());
        System.out.println(a.getNombre());
        System.out.println(a.isHerido());
        System.out.println(a.isMuerto());
        
        
        
    }
}
