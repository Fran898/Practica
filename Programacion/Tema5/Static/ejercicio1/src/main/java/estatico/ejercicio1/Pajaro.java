/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estatico.ejercicio1;

/**
 *
 * @author DAM114
 */
public class Pajaro {
    private String color;
        private int edad;
        private static int numPajaros = 0;

        public Pajaro() {

        }

        public Pajaro(String color, int edad) {
            this.color = color;
            this.edad = edad;
            nuevoPajaro();

        }

        private static void nuevoPajaro() {
            numPajaros++;
        }

        public static int muestraPajaro() {
            return numPajaros;
        }
}
