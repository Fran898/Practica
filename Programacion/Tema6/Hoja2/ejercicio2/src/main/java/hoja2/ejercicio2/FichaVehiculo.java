/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDateTime;

/**
 *
 * @author Francisco Sitjar
 */
public class FichaVehiculo {
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaReparacion;
    private LocalDateTime fechaSalida;
    private String modelo;
    private String matricula;
    
    public FichaVehiculo(LocalDateTime fe,  String mo, String ma){
        fechaEntrada = fe;
        modelo = mo;
        matricula = ma;
        
        
    }
    
    @Override
    public String toString(){
        return "\nModelo: " + modelo  + "\nMatricula: " + matricula + "\nFecha de entrada: " + fechaEntrada+ "\nFecha de reparacion: " + fechaReparacion + "\nFecha de salida: " + fechaSalida;
    }
    

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDateTime fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
