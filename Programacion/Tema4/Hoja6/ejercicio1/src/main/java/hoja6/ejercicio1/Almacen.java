/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Almacen {
    private Articulo producto[];
    
    public Almacen(int n){
        producto = new Articulo[n];
                
    }
    
    
    public void llenar(){
        for (int i = 0; i < producto.length; i++) {
            producto[i] = new Articulo();
            
        }
    } 
    
    public void pedidos(){
        for (int i = 0; i < producto.length; i++) {
            if(producto[i].getExistencias() < 10){
                System.out.println("Codigo del producto: " + producto[i].getCodigo() + "\nDescripcion: " + producto[i].getDesc() + "\nExsistencias: " + producto[i].getExistencias());
            }
            
        }
        
    }
}
