/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Ciudad {
    private String nombre;
    private double lat;
    private double lon;
    private int hab;
    
    public Ciudad(String nombre, double latitud, double longitud, int hab){
        this.nombre = nombre;
        lat = latitud;
        lon = longitud;
        this.hab = hab;
    }
    
    
    @Override
    public String toString(){
        return "Ciudad: " + nombre + "\nHabitantes: " + hab;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getHab() {
        return hab;
    }
    
}
