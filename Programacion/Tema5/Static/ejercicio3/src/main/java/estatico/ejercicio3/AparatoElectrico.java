/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estatico.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class AparatoElectrico {
    private static double consumoTotal = 0;
    private double potencia;
    private boolean estado;
    
    
    public AparatoElectrico(double potencia){
        estado = false;
        this.potencia = potencia;
    }
    
    
    public void enciende(){
        estado = true;
        consumoTotal += potencia;
        System.out.println("Dispositivo ON");
    }
    
    public void apagar(){
        estado = false;
        consumoTotal -= potencia;
        System.out.println("Dispositivo OFF");
    }
    
    
    
    
    
    public static double consumo(){
        return consumoTotal;
    }
    
    
    
}
