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
public class Empleado {
    protected String nombre;
    protected String departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;
    
    public Empleado(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre: ");
        nombre = teclado.next();
        System.out.println("Inserte el departamento: ");
        departamento = teclado.next();
        do{
            System.out.println("Inserte la edad: ");
        edad = teclado.nextInt();
        }while(edad <= 18 || edad >= 65);
        System.out.println("Esta casado? (true or false): ");
        casado = teclado.nextBoolean();
        System.out.println("Salario: ");
        salario = teclado.nextDouble();
        
    }
    
    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario){
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        
    }
    
    
    public String clasificacion(){
            String temp = "";
            if(edad > 35){
                temp = "Senior";
            }else if(edad <= 21){
                temp = "Principiante";
            }else{
                temp = "Intermediario";
            }
            
            return temp;
            
    }
    
    public String datosEmpleado(){
        
        return "Nombre: " + nombre + "\nDepartamento: " + departamento + "\nEdad: " + edad + " (" + clasificacion() + ")" + "\nCasado: " +
                casado + "\nSalario: " + salario;
        
    }
    
    public void aumento(double n){
        salario += ((n/salario)*100);
        
    }
    
    
    
}
