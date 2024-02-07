/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alumno al = new Alumno(2);
        al.agregarNota();
        System.out.println(al.mostrar());
        Profesor p = new Profesor(2);
        p.agregarAsignatura();
        System.out.println(p.mostrar());
        
    }
}
