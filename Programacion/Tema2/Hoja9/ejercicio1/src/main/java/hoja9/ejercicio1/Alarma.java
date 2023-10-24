/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Alarma {
    private double temperatura;
    private Timbre TIMBRE;
    
    
    public Alarma(double temperatura){
        this.temperatura = temperatura;
        TIMBRE = Timbre.APAGADO;
        
    }
    
    public void comprueba(){
        TIMBRE = temperatura > 35 || temperatura < 10 ? Timbre.ENCENDIDO : Timbre.APAGADO;
    }
    
    
    public void normaliza(){
        temperatura = 25;
        TIMBRE = Timbre.APAGADO;
    }
    
    public Timbre getTimbre(){
        return TIMBRE;
    }
    
}
