/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja4.ejercicio1;

import java.util.Scanner;
import java.util.Calendar;

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
            if (temp == 1) {
                System.out.println("Inserte el numero de paginas: ");
                int num = teclado.nextInt();
                p[i] = new Libro(titulo, autor, dia, mes, anno, num);
            } else if (temp == 2) {
                System.out.println("Inserte los minutos que dura la cancion: ");
                int min = teclado.nextInt();
                p[i] = new Disco(titulo, autor, dia, mes, anno, min);
            }

        }
        System.out.println("------Todos los libros y discos------");
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Publicacion) {
                if (p[i] instanceof Libro) {
                    System.out.println("----Libro: ");
                    System.out.println(p[i].toString());
                } else {
                    System.out.println("----Disco: ");
                    System.out.println(p[i].toString());
                }

            }

        }

        System.out.println("------Disco mas largo------");
        int temp = 0;
        String texto = "";
        for (int i = 0; i < p.length; i++) {

            if (p[i] instanceof Disco d1) {
                if (temp < d1.getDuracionMinutos()) {
                    temp = d1.getDuracionMinutos();
                    texto = "Titulo: " + d1.getTitulo().substring(0, 3) + "\nAutor: " + d1.getAutor();

                }

            }
        }

        System.out.println(texto);

        System.out.println("--------Libros con mas de 1.000 paginas");
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Libro l1) {
                if(l1.getNumPaginas() >= 1000 && l1.getFecha().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH) && l1.getFecha().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)){
                    System.out.println("Titulo: " + l1.getTitulo() + "\nAutor: " + l1.getAutor());
                    
                }

            }

        }
        
        
        System.out.println("---------Libros editados en los ultimos 2 años");
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Libro l1) {
                if((Calendar.getInstance().get(Calendar.YEAR) - l1.getFecha().get(Calendar.YEAR)) <= 2){
                    System.out.println("Titulo: " + l1.getTitulo() + "\nAutor: " + l1.getAutor());
                    
                }

            }

        }

    }

}
