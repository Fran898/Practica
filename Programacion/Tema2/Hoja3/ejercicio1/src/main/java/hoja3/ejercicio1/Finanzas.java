/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Finanzas {

    private double toeuros;
    private double dinero;
    

    public Finanzas() {
        this.toeuros = 0.95;
        

    }

    public Finanzas(double toeuros) {
        this.toeuros = toeuros;
    }

    public double dolaresToEuros(double dinero) {
        return this.dinero = dinero * toeuros;
        
    }
    
    public double eurosToDolares(double dinero){
        return this.dinero = dinero/toeuros;
        
    }
    
    public double getDinero(){
        return dinero;
      
    }
    

}
