/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio2;

/**
 *
 * @author Francisco Sitjar
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Articulo[] a = new Articulo[10];
        int contador = 0;
        
        a[0] = new EnPromocion("001", "No", 89.99, 10);
        a[1] = new EnPromocion("002", "No", 19.99, 10);
        a[2] = new EnPromocion("003", "No", 79.99, 10);
        a[3] = new EnPromocion("004", "No", 39.99, 10);
        a[4] = new EnPromocion("005", "No", 889.99, 10);
        
        a[5] = new Perecedero("006", "No", 29.99, 3,2025);
        a[6] = new Perecedero("007", "No", 25.99, 5, 2024);
        a[7] = new Perecedero("008", "No", 74.99, 11, 2023);
        a[8] = new Perecedero("007", "No", 67.99, 8, 2024);
        a[9] = new Perecedero("0010", "No", 52.99,2,2024);
        
        
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof EnPromocion){
                EnPromocion temp = new EnPromocion();
                a[i] = (EnPromocion) temp;
                System.out.println(temp.toString());
                System.out.println("El precio con descuento es: " + temp.precioDes());
            }
        }
        
    }
}
