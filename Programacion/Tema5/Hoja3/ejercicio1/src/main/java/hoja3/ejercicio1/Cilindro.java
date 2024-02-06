/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author DAM114
 */
public class Cilindro extends Figura {
    
    public Cilindro(double radio, double altura){
        super(radio, altura);
    }
    
    @Override
    public double area(){
        return (2*Math.PI*radio*altura);
    }
    
    @Override
    public double volumen(){
        return (Math.PI*(Math.pow(radio, 2)*altura));
    }
    
}
