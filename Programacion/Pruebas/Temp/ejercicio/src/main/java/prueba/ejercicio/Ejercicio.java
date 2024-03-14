/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package prueba.ejercicio;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio {

    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Fran", "Sitjar");
        Usuario usu2 = new Usuario("Fran", "Sitjar");

        if (usu1.equals(usu2)) {
            System.out.println("Son iguales");
            
        } else {
            System.out.println("No son iguales");
            
        }
        
        LibroElectronico l1 = new LibroElectronico("Adios", "Bonifacio", 2.4f);
        LibroElectronico l2 = new LibroElectronico();
        

    }
}
