/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *
 * @author dam1
 */
public class CajaAhorro {

    private int saldo;
    private int transacciones;

    //Constructor sin parametros
    public CajaAhorro() {
        this.transacciones = 0;
        this.saldo = 0;
    }

    //Constructor con parametro int para sueldo
    public CajaAhorro(int inicial) {
        this.saldo = inicial;
        this.transacciones = 1;
    }

    //Metodo para depositar dinero
    public void depositar(int cantidad) {
        this.saldo += cantidad;
        transacciones++;
    }
    
    //Metodo para quitar dinero
    public void girar(int cantidad) {
        this.saldo -= cantidad;
        transacciones++;
    }

    //Metodo para sacar el saldo actual
    public int obtenerSaldo() {
        return saldo;
    }

    //Metodo para sacar numero de transacciones realizadas
    public int obtenerTransicciones() {
        return transacciones;
    }

}
