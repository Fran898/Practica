/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Monedero {

    private double dinero;
   

    public Monedero(double dinero) {
        this.dinero = dinero;
    }

    public void meterDinero(double dinero) {
        this.dinero += dinero;
    }
    
    public void sacarDinero(double dinero){
        
        String error = (this.dinero -= dinero) < 0 ? "No hay saldo suficiente" : "Ha sacado " + dinero + " €";
        this.dinero -= dinero;
    }
    
    public void mostrarDinero(){
        System.out.println("Tiene " + dinero + "€");
    }

}
