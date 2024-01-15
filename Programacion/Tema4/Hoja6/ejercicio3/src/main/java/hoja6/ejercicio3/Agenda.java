/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Agenda {
    private static int contador;
    private Persona[] persona;
    
    public Agenda(int n){
        contador = 0;
        persona = new Persona[n];
        
    }
    
    public void insertar(){
        Scanner teclado = new Scanner(System.in);
        if(contador <= persona.length-1){
            System.out.println("Inserte el nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Inserte el telefono: ");
            int numero = teclado.nextInt();
            persona[contador] = new Persona(nombre, numero);
            contador++;
        }else{
            System.out.println("No hay mas espacio en la agenda");
        }
        
    }
    
    
    public String mostrar(){
        String temp = "";
        for(int i = 0; i < persona.length; i++){
            temp += "Nombre: " + persona[i].getNombre() + "\nTelefono: " + persona[i].getTelefono() + "\n";
        }
                
        return temp;
    }
    
    
    public String buscar(String nombre){
        String temp = "La persona no existe";
        for (int i = 0; i < persona.length; i++) {
            if(nombre.equals(persona[i].getNombre().toLowerCase())){
                temp = "Nombre: " + persona[i].getNombre() + "\nTelefono: " + persona[i].getTelefono() + "\n";
            }
            
        }
        return temp;
        
    }
    
    public void modificar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre de la persona: ");
        String nombre = teclado.nextLine();
        for (int i = 0; i < persona.length; i++) {
            if(nombre.equals(persona[i].getNombre().toLowerCase())){
                System.out.println("Numero de telefono actual: " + persona[i].getTelefono());
                System.out.println("Inserte el nuevo numero de telefono: ");
                int num = teclado.nextInt();
                persona[i].setTelefono(num);
                System.out.println("El nuevo telefono es: " + persona[i].getTelefono());
            }
            
        }   
    }

    public int getContador() {
        return contador;
    }
    
    
    
    
}
