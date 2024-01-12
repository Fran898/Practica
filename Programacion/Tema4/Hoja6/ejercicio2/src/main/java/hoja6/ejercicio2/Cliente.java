/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Cliente {

    private int codigo;
    private String nombre;
    private String apellidos;
    private int telefono;
    private double saldo;
    
    public Cliente(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

}
