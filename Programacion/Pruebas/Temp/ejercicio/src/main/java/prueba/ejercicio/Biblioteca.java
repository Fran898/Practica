/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.ejercicio;

import java.time.LocalDate;

/**
 *
 * @author Francisco Sitjar
 */
public class Biblioteca {

    private Libro[] libros;
    private Usuario[] usuarios;
    private Prestamo[] prestamos;
    private int contadorLibros;
    private String nombre;

    public Biblioteca(String n, int num) {
        nombre = n;
        libros = new Libro[num];
        usuarios = new Usuario[num];
        prestamos = new Prestamo[num];

    }

    public boolean agregarLibro(Libro l) {
        boolean temp = false;
        if (contadorLibros < libros.length) {
            libros[contadorLibros] = l;
            contadorLibros++;
            temp = true;
        }
        return temp;

    }

    public void agregarUsuario(Usuario u) {
        boolean temp = false;
        for (int i = 0; i < usuarios.length && !temp; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = u;
                temp = true;
            }
        }
        if (temp) {
            System.out.println("Se ha agregado el usuario");
        } else {
            System.out.println("No se ha agregado el usuario");
        }

    }

    public void agregarPrestamo(Prestamo p) {
        boolean temp = false;
        for (int i = 0; i < prestamos.length && !temp; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = p;
                temp = true;
            }
        }
        if (temp) {
            System.out.println("Se ha agregado el prestamo");
        } else {
            System.out.println("No se ha agregado el prestamo");
        }

    }

    public boolean buscarUsuario(Usuario u) {
        boolean temp = false;
        for (int i = 0; i < usuarios.length && !temp; i++) {
            if (usuarios[i].equals(u)) {
                temp = true;
            }
        }
        return temp;
    }

    public boolean buscarLibro(Libro l) {
        boolean temp = false;
        for (int i = 0; i < libros.length && !temp; i++) {
            if (libros[i].equals(l)) {
                temp = true;
            }
        }
        return temp;
    }

    public void prestarLibro(Libro l, Usuario u) {
        boolean encontrado = false;
        boolean prestado = false;
        if (this.buscarLibro(l)) {
            if (this.buscarUsuario(u)) {
                for (int i = 0; i < prestamos.length; i++) {

                    if (prestamos[i] != null && prestamos[i].getLibro().equals(l) && prestamos[i].getFechaDevolucion() == null) {
                        prestado = true;

                    } else if (prestamos[i].getLibro().equals(l)) {
                        encontrado = true;
                    }
                }
                if (encontrado || !prestado) {
                    Prestamo pres = new Prestamo(l, u, LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
                    this.agregarPrestamo(pres);
                    System.out.println("Se ha prestado el libro");

                } else if (prestado) {
                    System.out.println("El libro esta prestado");
                }

            } else {
                System.out.println("El usuario no es socio de la biblioteca");
            }
        } else {
            System.out.println("El libro no esta en la biblioteca");
        }

    }

}
