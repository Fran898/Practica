/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.prueba;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Prueba {

    public static void main(String[] args) {
        
        int[] a = new int[10];
        int[] b = new int[] {2,5,7,1};
        a = b;

       for(int i = 0; i < b.length; i++){
           System.out.println(a[i]);
       }
       
    }
}
