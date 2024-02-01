/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estatico.ejercicio2;

/**
 *
 * @author DAM114
 */
public class Bombilla {
    private static Estado general = Estado.OFF;
    private Estado bombilla;
    
    public Bombilla(){
        bombilla = Estado.OFF;
    }
    
    public static void general(){
        if(general == Estado.OFF){
            general = Estado.ON;
            System.out.println("El interruptor general ahora esta en " + general);
        }else{
            general = Estado.OFF;
            System.out.println("El interruptor general ahora esta en " + general);

        }
    }
    
    public void privado(){
        if(bombilla == Estado.OFF){
            bombilla = Estado.ON;
            System.out.println("El interruptor de la bombilla ahora esta en " + bombilla);
        }else{
            bombilla = Estado.OFF;
            System.out.println("El interruptor de la bombilla ahora esta en " + bombilla);
        }
    }
    
    public void estado(){
        if(bombilla == Estado.ON && general == Estado.ON){
            System.out.println("La bombilla esta encendida");
        }else{
            System.out.println("La bombilla esta apagada");
        }
    }
}
