/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Restaurante {

    private int huevos;
    private double chorizo;

    public Restaurante(int docenas, double chorizo) {
        this.chorizo = chorizo;
        huevos = docenas * 12;

    }

    public void addHuevos(int docenas) {
        huevos = huevos + (docenas*12);
    }

    public void addChorizo(double chorizo) {
        this.chorizo += chorizo;
    }

    public int getNumPlatos(){
       
       return (int)(chorizo/0.2) < (huevos/2) ? (int)(chorizo/0.2) : (huevos/2);

    }

    public void sirvePlato() {
        
        
        huevos -= getNumPlatos() > 0 ?  2 : huevos;
        chorizo -= getNumPlatos() > 0 ?  0.2 : chorizo;
    }

    public int getHuevos() {
        return huevos;

    }

    public double getChorizo() {
        return chorizo;
    }

}
