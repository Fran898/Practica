/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Pais {
    private String nombre;
    private Ciudad[] ciudad;
    private int nciud;
        
    
    public Pais(String nombre){
        ciudad = new Ciudad[25];
        nciud = 0;
    }
    
    public void addCiudad(){
        Scanner teclado = new Scanner(System.in);
        if(nciud < ciudad.length){
            System.out.println("Inserte el nombre de la ciudad: ");
            String temp = teclado.nextLine();
            System.out.println("Inserte latitud: ");
            double lat = teclado.nextDouble();
            System.out.println("Inserte longitud");
            double lon = teclado.nextDouble();
            System.out.println("Inserte el numero de habitantes: ");
            int hab = teclado.nextInt();
            ciudad[nciud] = new Ciudad(temp, lat, lon, hab);
            nciud++;
        }else{
            System.out.println("No hay espacio para mas ciudades");
        }
    }
    
    
    public String masHab(){
        /*Arrays.sort(ciudad,Comparator.comparing(Ciudad::getHab));
        return "La ciudad con mas habitantes es: " + (ciudad.length-1);*/
        String temp = ciudad[0].getNombre();
        for(int i = 1; i < ciudad.length; i++){
            if(ciudad[i].getHab() >= ciudad[i-1].getHab()){
                temp = ciudad[i].getNombre();
            }
        }
        return temp;
    }
    
}
