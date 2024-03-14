/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

/**
 *
 * @author DAM114
 */
public class LibroElectronico extends Libro implements Identificable{
    private float tamano;
    
    
    
    public LibroElectronico(){
        super();
        tamano = Teclado.numero("Inserte el tamaño en MB");
    }
    
    
    public LibroElectronico(String a, String t, float tamano){
        super(a,t);
        this.tamano = tamano;
        
        
    }
    
    @Override
    public String imprime(){
        return super.imprime() + "\nTamaño: " + String.format("%,.2f",tamano);
        
    }
    
    
}
