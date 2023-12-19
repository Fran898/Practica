/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio4;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        
        System.out.println("La nota mas alta es: " + alumno.mayor());
        System.out.println("La nota mas baja es: " + alumno.menor());
        System.out.println(alumno.mostrar());
        
    }
}
