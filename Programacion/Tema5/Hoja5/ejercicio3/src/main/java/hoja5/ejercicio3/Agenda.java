/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio3;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Francisco Sitjar
 */
public class Agenda {

    protected int contador;
    protected Contacto[] contactos;

    public Agenda(int n) {
        contactos = new Contacto[n];
        contador = 0;
    }

    public void insertar(Contacto c) {
        if (contador < contactos.length) {
            contactos[contador] = c;
        } else {
            System.out.println("La agenda esta completa");
        }
        contador++;
    }

    public void buscar(Contacto c) {
        for (int i = 0; i < contador; i++) {
            if (c.equals(contactos[i])) {
                System.out.println("El contacto se ha encontrado");
            }
        }
    }

    public void eliminar(String n) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(n)) {
                    for (int j = i+1; j < contador ; j++) {
                    contactos[j-1] = contactos[j];
                    
                }
                    System.out.println("Contacto eliminado");
            }
        }
    }
    
    @Override
    public String toString(){
        String temp = "";
         DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (int i = 0; i < contador; i++) {
            temp += "Nombre: " + contactos[i].getNombre() + "\nApellido: " + contactos[i].getApellido() +
                    "\nTelefono: " + contactos[i].getTelefono() + "\nFecha de Nacimiento: " + contactos[i].getFechaNac().format(f) + "\n---------------\n";
        }
        return temp;
    }
    
    

}
