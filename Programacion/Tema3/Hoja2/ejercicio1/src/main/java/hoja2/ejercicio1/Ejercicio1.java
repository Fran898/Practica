/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dia;
        System.out.println("Inserte un numero del dia de la semana: ");
        int num = teclado.nextInt();
        switch (num){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default: 
                dia = "Numero no valido";         
                        
        }
        System.out.println("Hoy es " + dia);
    }
}
