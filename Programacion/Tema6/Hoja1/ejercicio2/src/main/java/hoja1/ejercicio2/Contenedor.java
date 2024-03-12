/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.util.Arrays;

/**
 *
 * @author Francisco Sitjar
 */
public class Contenedor<T> implements Pila{

    private T[] objeto;

    public Contenedor(T[] nuevo) {
        objeto = nuevo;

    }

   

    public void insertarAlFinal(T nuevo) {
        if (objeto[objeto.length-1] != null) {
            objeto = Arrays.copyOf(objeto, objeto.length +1);
            objeto[objeto.length-1] = nuevo;

        }else{
            objeto[objeto.length-1] = nuevo;
        }

    }

    @Override
    public T extraerDelPrincipio() {
        T temp = objeto[0];
        
        System.arraycopy(objeto, 1, objeto, 0, (objeto.length-1));
        objeto = Arrays.copyOf(objeto, objeto.length -1);
        return temp;
    }
    
    public void ordenar(){
        Arrays.sort(objeto);
    }
    
    @Override
    public String toString(){
        String temp = "";
        for (T n: objeto) {
            temp += n + " ";
        }
        
        
        return temp;
    }

    @Override
    public void insertarAlPrincipio(T nuevo) {
        if (objeto[0] != null) {
            objeto = Arrays.copyOf(objeto,(objeto.length +1));
            System.arraycopy(objeto, 0, objeto, 1,objeto.length-1);
            objeto[0] = nuevo;

        }else{
            objeto[0] = nuevo;
        }
    }
    

}
