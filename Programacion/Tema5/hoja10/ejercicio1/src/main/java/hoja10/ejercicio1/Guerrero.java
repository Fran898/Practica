/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author DAM114
 */
public abstract class Guerrero {
    private String nombre;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;
    
    public class Guerrero(String n, int edad, int fuerza){
        final nombre = n;
    }
    
    
    
    
    protected static boolean comprobarEdad(int e){
        boolean temp = false;
        if(e <= 15 || e >= 60){
            temp = true;
        }
        return temp;
    }
    
    
    protected static boolean comprobarFuerza(int f){
        boolean temp = false;
        if(f <= 1 || f >= 10){
            temp = true;
            
        }
        return temp;
    }
    
    
    
    
    
    
    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public boolean isHerido() {
        return herido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    
}
