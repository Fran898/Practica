/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Rectangulo {

    //Declaración de atributos
    private int largo;
    private int ancho;

    public Rectangulo() {

    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
    public int getLargo(){
        return largo;
    }
    
    public int getAncho(){
        return ancho;
    }

    
    public int area(){
        return largo * ancho;
    }
    
    public double diagonal(){
        return (Math.sqrt(Math.pow(largo, 2) + (Math.pow(ancho,2))));
    }
    
}
