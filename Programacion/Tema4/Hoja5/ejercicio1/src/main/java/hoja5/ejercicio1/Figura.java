/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Figura {
    private char[][] matriz;
    private char letra;
    
    public Figura(char caracter, int n){
        matriz = new char[n][n];
        letra = caracter;
        
    }
    
    public String cuadrado(){
        String cadena = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                cadena += letra + " ";
            }
           cadena += "\n";
        }
        
        return cadena += "\n";
    }
    
    
    public String cuadradoVacio(){
        String cadena = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
               if( i == 0 || i == matriz.length-1){
                   cadena += letra + " ";
               }else if(j == 0 || )
               
                
                
            }
        }
        
    }
    
}
