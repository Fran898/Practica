/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Alumno extends Persona{
    private int[] notas;
    
    public Alumno(int n){
        super();
        notas = new int[n];
    }
    
    public void agregarNota(){
        
    }
    @Override
    public String mostrar(){
        
        return "DNI: " + super.getDNI() + "\nNombre: " + super.getNombre() + "\nDireccion: " + super.getDireccion() ;
    }
    
}
