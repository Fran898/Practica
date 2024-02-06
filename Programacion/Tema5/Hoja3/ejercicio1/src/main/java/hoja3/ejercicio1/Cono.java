/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Cono extends Figura{
    
    public Cono(double radio, double altura){
        super(radio, altura);
        
    }
    
    @Override
    public double area(){
        return (Math.sqrt(Math.pow(radio, 2) + (Math.pow(altura, 2)))) + (Math.PI*(Math.pow(radio, 2)));
    }
    
    @Override
    public double volumen(){
        return ((Math.PI*altura*(Math.pow(radio, 2)))/3);
    }
}
