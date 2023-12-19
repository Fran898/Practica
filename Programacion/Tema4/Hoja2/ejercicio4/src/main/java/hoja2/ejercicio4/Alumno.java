/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Francisco Sitjar
 */
public class Alumno {

    private Scanner teclado;
    private String nombreAlumno;
    private int[] notas;

    public Alumno(String nombre) {
        teclado = new Scanner(System.in);
        notas = new int[5];
        nombreAlumno = nombre;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Inserte la nota: ");
            notas[i] = teclado.nextInt();
        }
    }

    public int menor() {
        int temp = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < temp) {
                temp = notas[i];
            }
        }
        return temp;

    }

    public int mayor() {
        int temp = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > temp) {
                temp = notas[i];
            }
        }
        return temp;

    }

    public String mostrar() {
        int temp = 0;
        for (int i = 0; i < notas.length; i++) {
            temp += notas[i];
        }
        return "La nota media del alumno " + nombreAlumno.toUpperCase() + " es: " + temp/notas.length;

    }

}
