/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package entornos.calculafacturaelectricidad;

import java.util.Scanner;

/**
 *
 * @author DAM114
 */
public class CalculaFacturaElectricidad {

    public static void main(String args[]) {
        long potencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la potencia consumida");
        potencia = teclado.nextLong();
        double coste = 0;
        double tramo = 1.2;
        if (potencia < 100) {
            coste = potencia * tramo;
        } else if (potencia < 300) {
            coste = 100 * tramo + (potencia - 100) * 2;
        } else if (potencia > 300) {
            coste = 100 * tramo + 200 * 2 + (potencia - 300) * 3;
        }
        System.out.println("Debes pagar: " + coste);
    }

    public double calcularArea(double radio) {
        //return 3.1416 * Math.pow(radio, 2);
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

   
    
    
    
}
