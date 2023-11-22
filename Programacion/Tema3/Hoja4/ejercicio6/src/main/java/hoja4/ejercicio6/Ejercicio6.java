/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja4.ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int jugar = 1;
        if (jugar == 1) {

            for (; jugar == 1;) {
                System.out.println("Inserte la cantidad que desea jugar");
                int dinero = teclado.nextInt();
                int juego = random.nextInt(2 - 1 + 1) + 1;
                if (juego == 1) {
                    dinero += dinero;
                    System.out.println("Ha salido " + juego + ". Enhorabuena, ahora su total es: " + dinero);
                    System.out.println("Si desea seguir jugando pulse 1");
                    jugar = teclado.nextInt();
                } else if (juego == 2) {
                    dinero = 0;
                    System.out.println("Ha salido " + juego + ". Que mala suerte, nos quedamos con todo.\nPulsa 1 para volver a jugar. Sus posibilidades de ganar aumentan un 10%!!!");
                    jugar = teclado.nextInt();
                }

            }
        }

    }
}
