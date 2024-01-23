/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Multiplicar {

    private int[][] matriz;

    public Multiplicar() {
        matriz = new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = i;
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[0][j] = j;
            }
        }
    }

    public void multiplica() {
        int temp = 1;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                matriz[i][j] = i * j;

            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public void valoresAspa() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j || i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
    
    public int[] tablaMultiplicar(int n){
        int[] temp = new int[9];
        if(n <= matriz.length-1){
            for (int i = 1; i < matriz.length; i++) {
           if(n == matriz[0][i]){
               for (int j = 1; j < matriz[0].length; j++) {
                   temp[i] = matriz[i][j]; 
               }
           }
        }
        }else{
            System.out.println("Numero no valido");
        }
        
        return temp;
    }
}
