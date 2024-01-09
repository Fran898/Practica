/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

import java.util.Random;

/**
 *
 * @author Francisco Sitjar
 */
public class Sopa {
    private char[][] matriz;
    
    public Sopa(){
        Random random = new Random();
        matriz = new char[10][20];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (char)random.nextInt(65, 91);
            }
        }
    }
    
    public Sopa(int fila, int columnas){
        Random random = new Random();
        matriz = new char[fila][columnas]; 
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (char)random.nextInt(65, 91);
            }
        }
    }
    
    public void mostrar(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    
    
    public void setPalabra(String palabra, int x, int y, int D){
        int temp = 0;
        if(D == 1 && palabra.length() <= matriz[x].length - y){
            for(int i = y; i <= palabra.length(); i++){
                matriz[x][i] = palabra.charAt(temp);
                temp++;
            }
            
        }else if(D == -1 && palabra.length() <= matriz.length - x){
            for(int i = x; i <= palabra.length(); i++){
                matriz[i][y] = palabra.charAt(temp);
                temp++;
            }
        }else{
            System.out.println("No valido");
        }
    }
    
   
    
}
