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
            FormatoFecha fecha1 = new FormatoFecha(29,2,2,2024);            
            FormatoFecha fecha2 = new FormatoFecha(14,10,11,2023);
            
            System.out.println(fecha1.salidaFormatoFecha());
            System.out.println(fecha2.salidaFormatoFecha());
    }
}
