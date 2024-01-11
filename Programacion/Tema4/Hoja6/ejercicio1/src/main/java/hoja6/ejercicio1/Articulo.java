/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Articulo {
    private String codigo;
    private String desc;
    private int existencias;
    
    public Articulo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el codigo del articulo: ");
        codigo = teclado.next();
        System.out.println("Inserte descripcion del producto:");
        desc = teclado.next();
        System.out.println("Inserte el numero de existencias: ");
        existencias = teclado.nextInt();
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public int getExistencias() {
        return existencias;
    }
    
    
    
}
