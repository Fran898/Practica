/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        try{
            Exception Error = new Exception("Error");
        }catch(Error e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Ayuda");
        }
        
    }
}
