/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja8.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Alumno[] al = new Alumno[4];
        
        al[0] = new Alumno(2);
        al[1] = new Alumno(1);
        al[2] = new Alumno(1);
        al[3] = new Alumno(1);
        
        try{
            System.out.println("A que alumno desea acceder? ");
            int temp = new Scanner(System.in).nextInt();
            System.out.println(al[temp].mostrar());
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No hay tantos alumnos");
        }
        
    }
}
