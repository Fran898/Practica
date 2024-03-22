/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Francisco Sitjar
 */
public class Asociacion {
    private List<Persona> personas = new ArrayList();

    public Asociacion() {

    }

    public void insertar(Persona p) {
        personas.add(p);
        Collections.sort(personas);
    }

    public String buscar(String buscar) {
        String texto = "No se ha encontrado a la persona";
        Persona p = null;
        for (Persona dni : personas) {
            if (dni.getDni().equals(buscar)) {
                p = dni;
                texto = dni.toString();
            }
        }
        float cuota = 0;
        if (p.edad() >= 5 && p.edad() <= 10) {
            cuota = 1;
        } else if (p.edad() >= 11 && p.edad() <= 17) {
            cuota = 2.5f;
        } else if (p.edad() >= 18) {
            cuota = 3.5f;
        }
        return "\n" + texto + "\nCuota a pagar: " + String.format("%,.2f€", cuota);
    }

    public String todo() {
        String texto = "";
        float dinero = 0;
        for (Persona info : personas) {
            texto += info.toString();
            float cuota = 0;
            if (info.edad() >= 5 && info.edad() <= 10) {
                cuota = 1;
            } else if (info.edad() >= 11 && info.edad() <= 17) {
                cuota = 2.5f;
            } else if (info.edad() >= 18) {
                cuota = 3.5f;
            }
            dinero += cuota;
        }

        return texto + "\nTotal recaudad: " + String.format("%,.2f€", dinero);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
    

}
