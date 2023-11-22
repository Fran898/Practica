/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Operaciones {

    private int num;

    public Operaciones() {

    }

    public Operaciones(int num) {
        this.num = num;

    }

    public int metodo1() {
        String temp = Integer.toString(num);

        return temp.length();

    }

    public void metodo2() {
        for (int i = 1; i != 11; i++) {
            System.out.println("\t" + num + " x " + i + " = " + num * i);
        }

    }
    
    public void metodo3(){
        System.out.println("Todos los numeros son perfectos :D");
    }
}
