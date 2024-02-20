/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    
    public Programador(){
        super();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte las lineas por hora: ");
        lineasDeCodigoPorHora = teclado.nextInt();
        System.out.println("Inserte el lenguaje dominante: ");
        lenguajeDominante = teclado.next();
        
    }
    
    public Programador(String nombre, String departamento, int edad, boolean casado, double salario, int n, String len){
        super(nombre, departamento, edad, casado, salario);
        lineasDeCodigoPorHora= n;
        lenguajeDominante = len;
    }
    
    
}
