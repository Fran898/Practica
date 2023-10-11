/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Circulo { //Clase circulo

    private double radio; //Variable nterna de la clase circulo

    public Circulo() { //Constructor por defecto sin argumentos

    }

    public Circulo(double radio) { //Constructor para definir radio
        this.radio = radio;
    }

    public double getRadio() { //Metodo para obtener el radio
        return radio;
    }

    public void setRadio(double radio) { //Metodo para cambiar el valor de radio
        this.radio = radio;

    }

    public double area() { //Metodo para calcular el area
        return Math.PI * Math.pow(radio, 2);
    }

    public double longitud() { //Metodo para calcular la longitud
        return 2 * Math.PI * radio;
    }

}
