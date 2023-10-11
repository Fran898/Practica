/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Numero {
    //Declaracion de variables
    private int num;
    private int num2;

    public Numero() { //Constructor por defecto

    }

    public Numero(int num) { //Constructor que cambia el numero 1
        this.num = num;

    }

    public void setNum(int num) { //Metodo para modificar el numero 1
        this.num = num;

    }

    public void setNum2(int num2) { //Metodo para modificar el numero 2
        this.num2 = num2;
    }

    public int getNum() { //Metodo para sacar el numero 1
        return num;
    }

    public int Suma() { //Metodo de suma
        return num + num2;
    }

    public int Resta() { //
        return num - num2;
    }

    public int Doble() {
        return num * 2;
    }

    public int Triple() {
        return num * 3;
    }

}
