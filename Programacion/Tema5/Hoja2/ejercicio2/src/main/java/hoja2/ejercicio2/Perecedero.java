/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author Francisco Sitjar
 */
public class Perecedero extends Articulo{
    protected LocalDate caducidad;
    
    
    public Perecedero(){
        
    }
    public Perecedero(String codigo, String desc, double precio, int mes, int anno){
        super(codigo, desc, precio);
        caducidad = LocalDate.of(anno, mes, 01);
       
        
    }
    
}
