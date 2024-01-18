/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.operaciones;

/**
 *
 * @author Francisco Sitjar
 */
public class Operaciones {
    private static int num1;
    private static int num2;
    
    public Operaciones(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public static  int suma(){
        return num1 + num2;
    }
    
    public static  int resta(){
        int temp;
        if(num1 > num2){
            temp = num1 - num2;
        }else{
            temp = num2 - num1;
        }
        return temp;
    }
    
    public static  int multiplicacion(){
     return num1 * num2;   
    }
    
    public static  int division(){
        int temp;
         if(num1 > num2){
            temp = num1/num2;
        }else{
            temp = num2/num1;
        }
         return temp;
    }
    

    public static void main(String[] args) {
        Operaciones op = new Operaciones(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("Suma: " + Operaciones.suma());
        System.out.println("Resta: " + Operaciones.resta());
        System.out.println("Multiplicacion: " + Operaciones.multiplicacion());
        System.out.println("Division: " + Operaciones.division());
        
    }
}
