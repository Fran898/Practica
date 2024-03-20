/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        
        lista = leeValores(lista);
        
        double temp = (calcularSuma(lista)/lista.size());
        System.out.println(temp);
        
        System.out.println(mostrarResultado(lista, calcularSuma(lista), temp));
    }
    
    
    
    
    public static List leeValores(List lista){
        int temp = 0;
        do{
            temp = Teclado.entero("Inserta un numero entero (pon -99 para salir): ");
            if(temp != -99){
                lista.add(temp);
            }
            
        }while(temp != -99);
        
        return lista;
    }
    
    public static int calcularSuma(List lista){
        int temp = 0;
        Iterator <Integer> it = lista.iterator();
        while(it.hasNext()){
            temp += it.next();
        }
       
        return temp;
        
    }
    
    public static String mostrarResultado(List lista, int suma, double media){
        /*List<Integer> temp = new ArrayList(lista);
        temp.removeIf(e -> e < media);*/
        String texto = "";
        String temp = "";
        for (Object t : lista) {
            texto += t + " ";
        }
       for (Object t : lista) {
            if((Integer)t < media){
                temp += t + " ";
            }
        }
        
        
        return "Los valores de la lista son: " + texto + "\nSuma: " + suma + "\nMedia: " + media + "\nNumeros superiores a la media: " + temp;
    }
    
}
