/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author Francisco Sitjar
 */
public class Taller {
    
    LinkedList<FichaVehiculo> enEspera = new LinkedList<FichaVehiculo>();
    LinkedList<FichaVehiculo> reparados = new LinkedList<FichaVehiculo>();
    LinkedList<FichaVehiculo> finalizados = new LinkedList<FichaVehiculo>();
    
    public Taller() {
        
    }
    
    public void insertarVehiculo(FichaVehiculo temp) {
        FichaVehiculo v = temp;
        v.setFechaEntrada(LocalDateTime.now());
        enEspera.add(v);
        
    }
    
    public void repararVehiculo(String m) {
        for (FichaVehiculo temp : enEspera) {
            if (temp.getMatricula().equals(m)) {
                temp.setFechaReparacion(LocalDateTime.now());
                reparados.add(temp);
                enEspera.remove(temp);
                
            }
        }
        
    }
    
    public void darSalidaVehiculo(String m) {
        FichaVehiculo v = null;
        
        for (FichaVehiculo temp : reparados) {
            if (temp.getMatricula().equals(m)) {
                v = temp;
                reparados.remove(temp);
                
            }
        }
        for (FichaVehiculo temp : enEspera) {
            if (temp.getMatricula().equals(m)) {
                v = temp;
                enEspera.remove(temp);
            }
        }
        v.setFechaSalida(LocalDateTime.now());
        finalizados.add(v);
        reparados.remove(v);
        
    }
    
    public String mostrarTodo() {
        String text = "{Vehiculos en espera ";
        for (FichaVehiculo temp : enEspera) {
            text += temp.toString();
        }
        text += "}\n{Vehiculos reparados ";
        for (FichaVehiculo temp : reparados) {
            text += temp.toString();
        }
        text += "}\n{Vehiculos finalizados ";
        for (FichaVehiculo temp : finalizados) {
            text += temp.toString();
        }
        
        return text + "}";
    }
    
}
