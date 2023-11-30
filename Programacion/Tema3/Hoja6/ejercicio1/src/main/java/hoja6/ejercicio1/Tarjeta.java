/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.Random;

/**
 *
 * @author Francisco Sitjar
 */
public class Tarjeta {

    Random random;
    private String titular;
    private int numcuenta;
    private int pin;
    private estadoTarjeta estado;
    private double dinero;

    public Tarjeta() {
        
    }

    public Tarjeta(String titular, int numcuenta, int dinero) {
        random = new Random();
        this.titular = titular;
        this.numcuenta = numcuenta;
        this.dinero = dinero;
        pin = random.nextInt(0, 10000);
        estado = estado.BLOQUEADA;
        
    }

    public void desbloquea(int pin) {
        if (this.pin == pin) {
            estado = estado.HABILIDATA;
            System.out.println("Tarjeta desbloqueada");
        } else {
            System.out.println("Pin incorrecto");
        }
    }

    public void pagar(int importe, int pin, String descripcion, boolean propina) {
        if (estado.equals(estado.HABILIDATA)) {
            if (this.pin == pin) {
                if (dinero > importe) {
                    if (propina) {
                        importe += (importe * 0.05);
                        dinero -= importe;
                        System.out.println("Se ha realizado la operacion correctamente");

                    } else {
                        dinero -= importe;
                        System.out.println("Se ha realizado la operacion correctamente");

                    }

                } else {
                    System.out.println("No hay saldo suficiente");
                }

            } else {
                System.out.println("El PIN es incorrecto");
            }

        } else {
            System.out.println("Tarjeta bloqueada");
        }
        
     

    }
    
    private String imprimirTicket(){
        
        
        return "Titular: " + titular + "\nNumero de cuenta: " + numcuenta;
    }
    

    public Random getRandom() {
        return random;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public int getPin() {
        return pin;
    }

    public estadoTarjeta getEstado() {
        return estado;
    }

    public double getDinero() {
        return dinero;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setEstado(estadoTarjeta estado) {
        this.estado = estado;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

}
