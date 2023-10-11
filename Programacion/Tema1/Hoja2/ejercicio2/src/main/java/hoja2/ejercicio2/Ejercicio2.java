/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio2;

import java.io.PrintStream;
import static java.lang.Math.PI;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        
          
          //Ejercicio 1
          System.out.println("X será: 120, Y será: 19");
        
        
          //Ejercicio 2 
          boolean w, x=true, y=true,z=false;
          w=x && y || x && z || y && z;
          System.out.println("El resultado es:" + w);
        
        
          //Ejercicio 3 
        
          double precio;
          System.out.print("Inserte precio de vivienda: ");
        
         // precio = teclado.nextDouble();
         // int pesetas = (int)(precio*166.386);
        //  System.out.println("El precio es: " + precio);
        //  System.out.printf("En pesetas es: %d \n", pesetas );
        
          //Ejercicio 4 
        
          //float altura;
          //float base;
        
          System.out.print("Inserte la altura: ");
          //altura = teclado.nextFloat();
          System.out.print("Inserte la base: ");
         // base = teclado.nextFloat();
         // System.out.println("El area es: " + ((altura*base)/2));
        
          //Ejercicio 5
                 
                  
         // String texto =JOptionPane.showInputDialog("Inserte el precio: ");
        //  double precio5 = Double.parseDouble(texto);
       //   double iva = (((precio5*21)/100) + precio5);
       //   double descuento = ((iva - (iva*10)/100));
          
       //   System.out.println("El precio sin IVA es: " + precio5);
       //   System.out.printf("El precio con el porcentaje del 21 de IVA es: %.2f \n" ,iva);
     //     System.out.printf("El precio después de aplica un porcentaje de 10 de descuento es: %.2f \n ", descuento );
          
          // Ejercicio 6 
          
      //    System.out.print("Inserte  radio del cilindro: ");
      //    double radio = teclado.nextDouble();
      //    System.out.print("Inserte altura del cilindro: ");
       //   double altura2 = teclado.nextDouble();
          
          
         // System.out.println("Su área lateral es igual a: " + Math.PI*2*radio*altura2);
        //  System.out.println("Su volumen es igual a:" + Math.PI*Math.pow(radio,2)*altura2);
          
        //Ejercicio 7 
          
        int a = 23;
        int b = 56;
        System.out.println("La vairable a vale: " + a);
        System.out.println("La variable b vale:" + b);
        
         int temp = a;
         a = b;      
         b = temp;
         System.out.println("La vairable a ahora vale: " + a);
        System.out.println("La variable b ahora vale:" + b);
        
        //Ejercicio 8 
        
         System.out.print("Inserte  radio del circulo: ");
         double radio2 = teclado.nextDouble();
         System.out.println("La longitud es:  " + Math.PI*2*radio2 );
         System.out.println("Su área es: " + Math.PI*Math.pow(radio2,2));
        System.out.println("" + Math.sqrt(a));
        
          
          
          
          
          
        
       
        
        
        
        
        
    }
}
