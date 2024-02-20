/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio3;

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
    }

    public void buscar(Contacto c) {
        for (int i = 0; i < contador; i++) {
            if (c.equals(contactos[i])) {
                System.out.println("El contacto se ha encontrado");
            }
        }
    }

    public void eliminar(Contacto c) {
        for (int i = 0; i < contador; i++) {
            if (c.equals(contactos[i])) {
                    for (int j = contador; j > i ; j--) {
                    contactos[i] = contactos[i+1];
                    
                }
            }
        }
    }
    
    @Override
    public String toString(){
        String temp = "";
        for (int i = 0; i < contador; i++) {
            temp = "Nombre: " + contactos[i].getNombre() + "\nApellido: " + contactos[i].getApellido() + "\nTelefono: " + contactos[i].getTelefono() + "\nFecha de Nacimiento: " + contactos[i].getFechaNac() + "\n";
        }
        return temp;
    }
    
    

}
