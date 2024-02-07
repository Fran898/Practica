/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Publicacion[] p;
        
        System.out.println("Inserte cuantas publicaciones desea añadir: ");
        p = new Publicacion[teclado.nextInt()];
        
     
        for (int i = 0; i < p.length; i++) {
            System.out.println("Inserte el titulo: ");
            String titulo = teclado.next();
            System.out.println("Inserte el nombre del autor: ");
            String autor = teclado.next();
            System.out.println("Inserte el dia: ");
            int dia = teclado.nextInt();
            System.out.println("Inserte el mes: ");
            int mes = teclado.nextInt();
            System.out.println("Inserte el año: ");
            int anno = teclado.nextInt();
            System.out.println("Añadiendo una publicacion");
            System.out.println("Es libro(1) o disco(2)");
            int temp = teclado.nextInt();
            if(temp == 1){
                System.out.println("Inserte el numero de paginas: ");
                int num = teclado.nextInt();               
                p[i] = new Libro(titulo, autor, dia, mes, anno, num);
            }else if(temp == 2){
                System.out.println("Inserte los minutos que dura la cancion: ");
                int min = teclado.nextInt();
                p[i] = new Disco(titulo, autor, dia, mes, anno, min);
            }
            
            
        }
        
        
        for (int i = 0; i < p.length; i++) {
            if(p[i] instanceof Publicacion){
                System.out.println(p[i].toString());
            }
        }
     
        
        
    }
}
