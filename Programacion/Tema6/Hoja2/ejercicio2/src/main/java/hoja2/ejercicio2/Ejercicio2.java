/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio2;

import java.time.LocalDateTime;


/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        FichaVehiculo v1 = new FichaVehiculo(LocalDateTime.now(), "Toyota", "AB1");
        FichaVehiculo v2 = new FichaVehiculo(LocalDateTime.now(), "Opel", "AB2");
        FichaVehiculo v3 = new FichaVehiculo(LocalDateTime.now(), "Honda", "AB3");
        Taller t = new Taller();
        
        t.insertarVehiculo(v1);
        t.insertarVehiculo(v2);
        t.insertarVehiculo(v3);
        
        t.repararVehiculo("AB2");
        
        t.darSalidaVehiculo("AB3");
        
        System.out.println(t.mostrarTodo());
    }
    
    
    
}
