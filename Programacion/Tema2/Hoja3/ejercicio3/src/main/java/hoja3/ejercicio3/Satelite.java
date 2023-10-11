/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

/**
 *
 * @author Francisco Sitjar
 */
public class Satelite {
    //Declaracion de variables

    private double meridiano;
    private double paralelo;
    private double distancia;

    public Satelite() { 

    }

    public Satelite(double meridiano, double paralelo, double distancia) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia = distancia;
    }

    public void printPosicion() {
        System.out.println("La posicion actual es: meridiano = " + meridiano + " paralelo = " + paralelo + " distancia de la Tierra =  " + distancia);
    }

    public void variarAltura(double altura) {
        distancia = distancia + altura;

    }
    
    public void variarPosicion(double meridiano, double paralelo){
       this.meridiano = meridiano;
       this.paralelo = paralelo;
              
    }
    
    public boolean enOrbita(){
        return distancia - 16000 <= 0;
        
    }
    

}
