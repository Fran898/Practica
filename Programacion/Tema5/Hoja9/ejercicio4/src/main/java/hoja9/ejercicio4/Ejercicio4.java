/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio4;

/**
 *
 * @author Francisco Sotjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       
        
        try{
            throw new MiExcepcion("Error");
        }catch(MiExcepcion e){
            System.out.println(e.toString());
        }
    }
}
