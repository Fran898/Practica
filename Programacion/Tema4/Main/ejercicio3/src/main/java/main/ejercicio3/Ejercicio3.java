/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio3 {
    private String nombre;
    private int sueldo;
    
    public Ejercicio3(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;       
        
    }
    
     public String imprimir(){
        return "Nombre: " + nombre + "\nSueldo: " + sueldo + "€";
    }
    
     public String debePagar(){
         String temp = "";
         if(sueldo >= 3000){
             temp = "Debe pagar impuestos.";
         }else{
             temp = "No debe pagar impuestos.";
         }
         return temp;
     }
       
        
    public static void main(String[] args) {
        Ejercicio3 a = new Ejercicio3(args[0],Integer.parseInt(args[1]));
        System.out.println(a.imprimir());
        System.out.println("Debe pagar: " + a.debePagar());
    }
    
    
    
    
}


