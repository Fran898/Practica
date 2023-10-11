/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio1;


import enumerados.*;
import java.util.Scanner;

/**
 *
 * @author dam1
 */

// La clase es publica,de nombre Ejercicio1; autor: Francisco

public class Ejercicio1 {
    
    // Clase publica, nombre main, indica donde inicia el programa 
    public static void main(String[] args) {
       // Declaracion de las variables
        Scanner teclado = new Scanner(System.in);

        boolean casado = true;
        final int MAXIMO;
        byte diasem = 1;
        short diaanual = 300;
        Sexo sexo = Sexo.M;
        long miliseg = 1298332800000l;
        double totalfactura = 10350.678;
        long poblacion = 6775235741l;
        
                       
        casado = true;
        MAXIMO = 999999;
        diasem = 1;
        diaanual = 300;
        
        miliseg = 1298332800000l;
        totalfactura = 10350.678;   
        poblacion = 6775235741l;

        System.out.println("Hay " + poblacion + " personas");
        
        //println
        
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----- ");
        System.out.println("\tEl valor de la variable casado es " + casado);
        System.out.println("\tEl valor de la variable MAXIMO es " + MAXIMO); 
        System.out.println("\tEl valor de la variable diasem es " + diasem); 
        System.out.println("\tEl valor de la variable diaanual es "+ diaanual); 
        System.out.println("\tEl valor de la variable sexo es "+ sexo); 
        System.out.println("\tEl valor de la variable miliseg es "+ miliseg); 
        System.out.println("\tEl valor de la variable totalfactura es " + totalfactura); 
        System.out.println("\tEl valor de la variable poblacion es "+ poblacion);

            
        //solo print
                
        System.out.print("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----- \n" );
        System.out.print("\tEl valor de la variable casado es " + casado + "\n");
        System.out.print("\tEl valor de la variable MAXIMO es " + MAXIMO + "\n"); 
        System.out.print("\tEl valor de la variable diasem es " + diasem + "\n"); 
        System.out.print("\tEl valor de la variable diaanual es "+ diaanual + "\n"); 
        System.out.print("\tEl valor de la variable sexo es "+ sexo + "\n"); 
        System.out.print("\tEl valor de la variable miliseg es "+ miliseg + "\n"); 
        System.out.print("\tEl valor de la variable totalfactura es " + totalfactura + "\n"); 
        System.out.print("\tEl valor de la variable poblacion es "+ poblacion + "\n");
        
        //printf
        
        System.out.printf("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS ----- \n" );
        System.out.printf("\tEl valor de la variable casado es %s \n", casado);
        System.out.printf("\tEl valor de la variable MAXIMO es %d \n", MAXIMO); 
        System.out.printf("\tEl valor de la variable diasem es %d \n", diasem); 
        System.out.printf("\tEl valor de la variable diaanual es %d \n", diaanual); 
        System.out.printf("\tEl valor de la variable sexo es %s \n", sexo); 
        System.out.printf("\tEl valor de la variable miliseg es %d \n", miliseg); 
        System.out.printf("\tEl valor de la variable totalfactura es %f \n", totalfactura); 
        System.out.printf("\tEl valor de la variable poblacion es %d \n", poblacion);

       //Ejercicio 4
       
        Meses m = Meses.MARZO;
       
        System.out.println(" El mes es: " + m);
        
        //Ejercicio 5
        
        double num1;
        double num2;
       
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print(" Introduzca el segundo numero: ");
        num2 = teclado.nextDouble();
        System.out.println("Sus numeros son: " + num1 + " y " + num2);
        System.out.println("La suma es: " + (num1+num2));
        System.out.println("La resta es: " + (num1-num2));
        System.out.println("La multiplicación es: " + (num1*num2));
        System.out.println("La división es: " + (num1/num2));
        System.out.println("La potencia del primer numero es: " + (Math.pow (num1, 2)));
        System.out.println("La raiz cuadrada del primero es: " + (Math.sqrt(num1)));
        
        
        

    }
}
