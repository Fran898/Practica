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
    private static int nciud;
        
    
    public Pais(String nombre){
        ciudad = new Ciudad[25];
        nciud = 0;
        this.nombre = nombre;
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
    
    
    public Ciudad masHab(){
        /*Arrays.sort(ciudad,Comparator.comparing(Ciudad::getHab));
        return "La ciudad con mas habitantes es: " + ciudad[(ciudad.length-1)].getNombre();*/
        Ciudad temp = ciudad[0];
        for(int i = 1; i < nciud; i++){
            if(ciudad[i].getHab() > temp.getHab()){
                temp = ciudad[i];
            }
        }
        return temp;
    }
    
    public boolean existe(String n){
        boolean temp = false;
        for (int i = 0; i < nciud && !temp; i++) {
            if(n.equalsIgnoreCase(ciudad[i].getNombre())){
                temp = true;
            }
        }
        return temp;
    }
    
    public int mediaTotal(){
        int suma = 0;
        for (int i = 0; i < nciud; i++) {
            suma += ciudad[i].getHab();
        }
        return suma/nciud;
    }
    
    @Override
    public String toString(){
        String texto = "";
        for(int i = 0; i < nciud; i++){
            texto += ciudad[i].toString() + "\nLongitud: " + ciudad[i].getLon() +
            "\nLatitud: " + ciudad[i].getLat() + "\n-----------------------------------------\n";
        }
        return texto;
    }
    
}
