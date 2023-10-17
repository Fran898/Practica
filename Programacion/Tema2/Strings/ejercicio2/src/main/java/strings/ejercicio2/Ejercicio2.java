/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package strings.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       String nombre = "Pepito ";
       String primerApellido = "Perez ";
       String segundoApellido = "Fernandez";
       
        System.out.println(nombre.concat(primerApellido.concat(segundoApellido)) + " tienen : " + nombre.concat(primerApellido.concat(segundoApellido)).length());
        
       
    }
}
