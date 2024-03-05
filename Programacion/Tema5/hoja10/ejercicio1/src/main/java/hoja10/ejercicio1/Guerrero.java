/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

import java.util.InputMismatchException;

/**
 *
 * @author DAM114
 */
public abstract class Guerrero implements Comparable<Guerrero> {

    private final String nombre;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;

    public Guerrero(String n, int edad, int fuerza) {
        nombre = n;
        try {
            this.edad = edad;
            this.fuerza = fuerza;
            herido = false;
            muerto = false;
        }catch(InputMismatchException e){
            this.edad = 25;
            this.fuerza = 5;
        }

    }
    
    public Guerrero(){
        this("guerreroX", 15,1);
    }
    
    public Guerrero(Guerrero n, String nombre){
        this.nombre = nombre;
        edad = n.getEdad();
        fuerza = n.getFuerza();
        herido = false;
        muerto = false;
        
    }

    protected static boolean comprobarEdad(int e) {
        boolean temp = false;
        if (e <= 15 || e >= 60) {
            temp = true;
        }
        return temp;
    }

    protected static boolean comprobarFuerza(int f) {
        boolean temp = false;
        if (f <= 1 || f >= 10) {
            temp = true;

        }
        return temp;
    }
    
    public abstract boolean retirarse();
    
    
    @Override
    public int compareTo(Guerrero g){
        int aux;
        if(this.fuerza == g.getFuerza()){
            aux = 0;
        }else if(this.fuerza > g.getFuerza()){
            aux = 1;
        }else{
            aux = -1;
        }
        return aux;
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
