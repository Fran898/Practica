/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio2;

import hoja10.ejercicio1.Griego;
import hoja10.ejercicio1.Guerrero;
import java.util.Arrays;

/**
 *
 * @author Francisco Sitjar
 */
public class Caballo implements PuedeMontarse{

    private final int capacidad;
    private int ocupacion;
    private Guerrero[] ocupantes;

    public Caballo(Guerrero[] g) {
        boolean comprueba = true;
        for (int i = 0; i < g.length && comprueba==true; i++) {
            if (!(g[i] instanceof Griego)) {
               comprueba = false;
            }
        }
        if (comprueba == false) {
            this.capacidad = 100;
            this.ocupantes = new Guerrero[100];
            this.ocupacion = 0;
        } else {
            this.capacidad = g.length;
            this.ocupantes = new Guerrero[g.length];
            for (int i = 0; i < g.length; i++) {
                this.ocupantes[i] = g[i];
                ocupacion++;
            }
        }
    }
    
    
    public Caballo(Guerrero g, int c){
         boolean comprueba = true;
        if (!(g instanceof Griego)) {
            comprueba = false;
        }
        if (comprueba == false) {
            System.out.println("No se ha podido añadir el guerrero");
            this.capacidad = 100;
            this.ocupantes = new Guerrero[100];
            this.ocupacion = 0;
        } else {
            this.capacidad = c;
            this.ocupantes = new Guerrero[c];
            this.ocupantes[0] = g;
            System.out.println("Guerrero añadido con exito");
            ocupacion++;
        }
         
    }
    
    
    public void ordenar(){
        /*
        Guerrero temp;
        for (int i = 0; i < ocupantes.length-1; i++) {
            if(ocupantes[i+1].getFuerza() > ocupantes[i].getFuerza()){
                temp = ocupantes[i];
                ocupantes[i] = ocupantes[i+1];
                ocupantes[i+1] = temp;
                
            }
            
            
        }*/
        Arrays.sort(ocupantes, 0, ocupacion);
        
        
        
    }
    public String mostrar(){
        String temp = "";
        for (int i = 0; i < ocupacion; i++) {
            temp += ocupantes[i].getNombre() + " " + ocupantes[i].getEdad() + " \n";
        }
        return temp;
    }
    
    
    public int buscar(String n){
        ordenar();
        int temp = -1;
        for (int i = 0; i < ocupacion; i++) {
            if(ocupantes[i].getNombre().equals(n)){
                temp = i;
            }
        }
        return temp;
    }
    
    
    @Override
    public int montar(Guerrero g){
        int temp = -1;
        if(ocupacion < ocupantes.length){
            
        }
        
        
        
        return temp;
    }
    
    @Override
    public void desmonta(){
        ocupacion = 0;
    }
    
    

}


