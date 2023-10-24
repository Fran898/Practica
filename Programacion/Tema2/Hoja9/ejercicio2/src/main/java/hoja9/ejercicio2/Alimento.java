/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Alimento {
    private String nombre;
    private int grasas;
    private int hidratos;
    private boolean origenAnimal;
    
    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal){
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
                
    }
    
    //Metodos get
    public String getNombre(){
        return nombre;
        
    }
    
     public int getGrasas(){
        return grasas;
        
    }
     
      public int getHidratos(){
        return hidratos;
        
    }
      
       public boolean getOrigenAnimal(){
        return origenAnimal;
        
    }
    
    
    
    
    
    
    
    
}
