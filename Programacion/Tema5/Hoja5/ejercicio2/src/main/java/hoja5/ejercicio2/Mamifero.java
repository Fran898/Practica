/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Mamifero {
    protected String raza;
    protected int npatas;
    protected String alimento;
    
    
    public Mamifero(String raza, int n, String alimento){
        this.raza = raza; 
        npatas = n;
        this.alimento = alimento;
    }
    
    @Override
    public String toString(){
        return "mamífero { raza = " + raza + " de npatas = " + npatas + " y alimento = " + alimento + "}";
    }
    
}
