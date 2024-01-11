/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Banco {
    private Cliente[] usuarios;
    private int contador;
    
    public Banco(int n){
        contador = 0;
        usuarios = new Cliente[n];
        
    }
    
    public void ingresar(){
        Scanner teclado = new Scanner(System.in);
        usuarios[contador] = new Cliente();
        usuarios[contador].setCodigo(contador+1);
        System.out.println("Bienvenido usuario Nº" + (contador+1));
        System.out.println("Inserte su nombre: ");
        usuarios[contador].setNombre(teclado.nextLine());
        System.out.println("Inserte sus apellidos: ");
        usuarios[contador].setApellidos(teclado.nextLine());
        System.out.println("Inserte su numero de telefono: ");
        usuarios[contador].setTelefono(teclado.nextInt());
        System.out.println("Inserte su saldo inicial: ");
        usuarios[contador].setSaldo(teclado.nextDouble());
        contador++;
        
    }
    
    public String buscar(int n){
        String temp = "No existe ese usuario";
        for(int i = 0; i < usuarios.length; i++){
            if(n == i){
                temp = "Codigo de usuario Nº" + usuarios[i].getCodigo() + "\nNombre y apellidos: " + 
                        usuarios[i].getNombre().concat(" ").concat(usuarios[i].getApellidos()) 
                        + "\nTelefono: " + usuarios[i].getTelefono() + "\n Saldo: " + String.format("%,.2", usuarios[i].getSaldo());
            }
        }
        return temp;
    }
    
}
