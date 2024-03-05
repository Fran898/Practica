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
        int i = 0;
        if (g[i] instanceof Griego) {
            ocupantes = new Guerrero[g.length];
            for (; i < g.length; i++) {
                ocupantes[i] = g[i];
                

            }
            ocupacion = i;
            capacidad = i;
        }else{
            capacidad = 100;
        }
    }
    
    
    public Caballo(Guerrero g, int c){
         capacidad = c;
         ocupantes = new Guerrero[c];
         if(g instanceof Griego){
             ocupantes[0] = g;
             ocupacion = 1;
         }else{
             ocupacion = 0;
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
        Arrays.sort(ocupantes);
        
        
        
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


