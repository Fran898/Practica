/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ticket {
    private double naranjas;
    
    
    public Ticket(){
        
    }
    
    
    public Ticket(int naranjas){
        this.naranjas = naranjas;
    }
    
    public String imprimir(){
        if (naranjas > 10){
            return "Se ha vendido " + naranjas + "kg de naranjas a 1,2€/kg. Total = " + String.format("%,.2f€",naranjas*1.2);   
                        
        }else{
            return "Se ha vendido " + naranjas + "kg de naranjas a 1,5€/kg. Total = " + String.format("%,.2f€",naranjas*1.5);
            
        }
        
        
    }
    
    
}
