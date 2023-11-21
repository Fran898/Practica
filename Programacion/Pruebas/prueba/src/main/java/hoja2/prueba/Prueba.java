/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.prueba;

/**
 *
 * @author dam1
 */
public class Prueba {

    public static void main(String[] args) {
        final int N = 200;
        final int M = 400;

        int x = (int) Math.floor(Math.random() * N);
// x será un número entre 0 y N-1
        int y = (int) Math.floor(Math.random() * N) + 1;
// x será un número entre 1 y N
        int z = (int) Math.floor(Math.random() * (M - N + 1)) + N;
        
//x será un número entre M y N ambos incluidos y siendo M mayor que N
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
