/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        int temp = 0;
        do{
            temp = Teclado.entero("Inserta un numero entero (pon -99 para salir): ");
            if(temp != -99){
                lista.add(temp);
            }
            
        }while(temp != -99);
        
        
    }
}
