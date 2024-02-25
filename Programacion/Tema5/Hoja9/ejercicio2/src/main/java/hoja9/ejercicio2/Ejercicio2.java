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
        try{
            Prueba temp = new Prueba();
            temp = null;
        
        System.out.println(temp.getTemp());
        }catch(NullPointerException e){
            System.out.println("Error");
        }
        
        
    }
}
