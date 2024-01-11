/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Veterinario {
    private int contador;
    private Mascota[] mascotas;
    
    public Veterinario(){
        contador = 0;
        mascotas = new Mascota[3];
        
    }
    
    public void anadir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre de la mascota: ");
        String nombre = teclado.next();
        System.out.println("Año de nacimiento: ");
        int ano = teclado.nextInt();
        System.out.println("Inserte el mes de nacimiento: ");
        int mes = teclado.nextInt();
        System.out.println("Inserte el dia de nacimiento: ");
        int dia = teclado.nextInt();
        mascotas[contador] = new Mascota(nombre, ano, mes, dia);
        contador++;
        
    }
    
    public void mostrar(){
        for(int i = 0; i < contador; i++){
            System.out.println("----Mascota Nº " + (i+1) + "----    ");
            System.out.println(mascotas[i].toString());
        }
        
    }
    
    
    public void mostrarMayor(){
        for(int i = 0; i < contador; i++){
            if(mascotas[i].getEdad() > 5){
                System.out.println("--------------------");
                System.out.println(mascotas[i].toString());;
            }
        }
    }
    
}
