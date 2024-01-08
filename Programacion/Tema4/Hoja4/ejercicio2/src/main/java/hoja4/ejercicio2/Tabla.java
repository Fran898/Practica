/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Random;

/**
 *
 * @author Francisco Sitjar
 */
public class Tabla {

    private int array[][];
    
    public Tabla() {
        array = new int[4][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 101);

            }
        }

    }

    public void mostrar() {
        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println(" ");

        }

    }

    public int mayorF(int fila) {
        fila-=1;
        int temp = array[fila][0];
        for(int i = 1; i < array[fila].length; i++){
            if(temp < array[fila][i]){
                temp = array[fila][i];
            }
        }
        return temp;
    }
    
    public int mayorC(int colum) {
        colum-=1;
        int temp = array[0][colum];
        for(int i = 1; i < array.length; i++){
             if(temp < array[i][colum]){
                temp = array[i][colum];
            }
           
        }
        return temp;
    }
    
    public double media(){
        double temp = 0;
        int temp2 = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                temp+= array[i][j];
                temp2++;
            }
            
        }
        
        return temp/temp2;
    }
}
