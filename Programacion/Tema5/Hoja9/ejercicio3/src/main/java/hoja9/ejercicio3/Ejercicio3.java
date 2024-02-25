/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja9.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        try{
           int[] temp = new int[3]; 
           temp[6] = 4;
           
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
