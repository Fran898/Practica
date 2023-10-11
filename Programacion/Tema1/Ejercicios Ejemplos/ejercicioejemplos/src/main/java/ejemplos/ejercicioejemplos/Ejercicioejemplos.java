/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejemplos.ejercicioejemplos;

/**
 *
 * @author dam1
 */
public class Ejercicioejemplos {

    public static void main(String[] args) {
        
         //Ejercicio 1
        
        int edad = 21;
        
        
        
        System.out.println("Ahora tengo " + edad + " y el año que viene " + ++edad);
        
        //Ejercicio 2
        
        int year = 2023;
        int myear = 2002;
        int age = year - myear;
        System.out.println("Tengo " + age);
        
        
        //Ejercicio 3
        
        short num = 32767;
        
        System.out.println(++num + "\n");
        
        //Ejercicio 4
        
        float nota1 = 9.9f;
        float nota2 = 4.6f;
        
        System.out.println("La nota es: " + ((nota1+nota2)/2));


        //Ejercicio 5
        
        int edad5 = 21;
        boolean adult = (edad5 >= 18);
        
        System.out.println(adult);
        
        //Ejercicio 6
        
        int numero = 2;
        boolean resultado = (numero%2 == 0);
        
        System.out.println("Numero par: " + resultado);
        
        //Ejercicio 7
        
        boolean lluvia = false;
        boolean tarea = true;
        boolean biblio = false;
        
        boolean salir = ((!lluvia && tarea ) || biblio);
        
        System.out.println("Podemos salir: " + salir);
        
        //Ejercicio 8 
        
        final float Precioman = 2.35f;
        final float Preciopera = 1.95f;
        
        int manzanas = 26;
        int peras = 15;
        
        float totalman = (float)manzanas*Precioman;
        float totalperas = (float)peras*Preciopera;
        
        System.out.println("Ha ganado " + (totalman+totalperas) + "€ con " + totalman + "€ en manzanas y " + totalperas + "€ en peras");
        
        //Ejercicio 9
        
        int valor = -4;
        int a  = valor < 0 ? (valor*-1) : valor;
         
        System.out.println(a);
        
    }
}
