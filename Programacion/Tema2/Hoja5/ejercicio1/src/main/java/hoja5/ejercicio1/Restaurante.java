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

    public int getNumPlatos() {
        
       int chori = (int)((chorizo * 1000) / 200);
       return chori < (huevos/2) ? chori : (huevos/2);

    }

    public void sirvePlato() {
        huevos -= 2;
        chorizo -= 0.2;
    }

    public int getHuevos() {
        return huevos;

    }

    public double getChorizo() {
        return chorizo;
    }

}
