/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Coche {

    //Declaracion de variables
    private String matricula;
    private float velocidad;

    public Coche(String matricula, float velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public Coche(String matricula) {
        this.matricula = matricula;

    }
    
    public void acelerar(float velocidad){
        this.velocidad += velocidad > 120 ? 120 : velocidad;
    }
    
    public void frenar(float velocidad){
        this.velocidad-=velocidad;
        this.velocidad = this.velocidad > 120 ? 120 : velocidad;
        this.velocidad = this.velocidad < 0 ? 0 : velocidad;
    }
    
   
    public void getMatricula(){
        System.out.println("Las letras de la matricula son: " + matricula.substring(4, 7));
    }
    
    public void getInfo(){
        System.out.println("La matricula del coche es " + matricula + " y la velocidad: " + velocidad);
    }
    

}
