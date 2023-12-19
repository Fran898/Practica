/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Invierno {

    private Scanner teclado;
    private double[] temp;

    public Invierno(int n) {
        teclado = new Scanner(System.in);
        temp = new double[n];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Inserte una temperatura");
            temp[i] = teclado.nextDouble();
        }
    }

    public double tempMedia() {
        double media = 0;
        for (int i = 0; i < temp.length; i++) {
            media += temp[i];
            
        }
        return media/temp.length;

    }
    
    
    public double[] fahrenheit(){
        double[] fahr = new double[temp.length];
        for(int i = 0; i < fahr.length; i++){
            fahr[i] = temp[i]*1.8+32;
        }
        
        return fahr;
        
    }
    
    public String mostrar(double[] temp){
        String cadena = "[ ";
        for(int i = 0; i < temp.length; i++){
            cadena += temp[i] + " ";
        }
        
        cadena += " ]";
        return cadena;
    }

    public double[] getTemp() {
        return temp;
    }

}
