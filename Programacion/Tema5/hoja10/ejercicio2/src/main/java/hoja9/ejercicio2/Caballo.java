/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja9.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Caballo{

    private final int capacidad;
    private int ocupacion;
    private Guerrero[] ocupantes;

    public Caballo(Guerrero[] n) {
        int temp = 0;
        for (int i = 0; i < n.length && n[i] instanceof Griego; i++) {
            temp++;
        }

        if (temp == n.length) {
            capacidad = temp;
            for (int i = 0; i < n.length; i++) {
                ocupantes = n;
                ocupacion++;

            }
        } else {
            capacidad = 100;

        }

    }

    public Caballo(Guerrero n, int m) {
        capacidad = m;
        if (n instanceof Griego) {
            ocupantes[0] = n;
            ocupacion++;
        }
    }
    
    
    public void ordenar(){
        Guerrero temp = ocupantes[0];
        for (int i = 1; i < (ocupacion/2); i++) {
            if(ocupantes[i+1].getFuerza() > ocupantes[i].getFuerza()){
                temp = ocupantes[i];
                ocupantes[i] = ocupantes[i+1];
                ocupantes[i+1] = temp;
            }
        }
    }

}
