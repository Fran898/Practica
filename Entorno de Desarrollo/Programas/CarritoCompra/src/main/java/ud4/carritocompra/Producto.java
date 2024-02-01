/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4.carritocompra;

/**
 *
 * @author cic
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
   
    public String getNombre() {
        return nombre;
    }
   
    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
}
