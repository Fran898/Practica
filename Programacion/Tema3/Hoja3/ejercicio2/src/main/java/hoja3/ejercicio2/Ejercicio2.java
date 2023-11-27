/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

import java.util.Scanner;


/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
      
      while(!salir){
          System.out.println("1.-!DESPEGUE¡");
          System.out.println("2.-Contador de numeros");
          System.out.println("3.-Factorial");
          System.out.println("4.-Escribe hasta tener un punto");
          System.out.println("5.-Calcular media");
          System.out.println("6.- Salir");
          System.out.println("Seleccione una opcion: ");
          int num = teclado.nextInt();
          switch(num){
              case 1 -> Calculo.metodo1();
              case 2 -> Calculo.metodo2();
              case 3 -> Calculo.metodo3();
              case 4 -> System.out.println("Hemos tecleado " + Calculo.metodo4() + " caracteres");
              case 5 -> System.out.println("La media es: " + Calculo.metodo5());
              case 6 -> salir = true;
              default -> System.out.println("No es una opcion valida");

          }
      }
      
    }
}
