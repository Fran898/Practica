/*
 * Crear una aplicación que calcule la media aritmética de dos notas enteras. 
 * Hay que tener en cuenta que la media puede contener decimales.
 */

package hoja1.ejemplo4;

/**
 *
 * @author cic
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        int nota1= 8;
        int nota2=3;
        float resultado=(nota1+nota2)/2; 
        //lo convierte a decimal pero trunca
        System.out.println("la nota media es :"+resultado);
        System.out.println("la nota media es:"+ ((nota1+nota2)/2));
       //lo devuelve truncado pero como si fuera un entero
        float nota3=8;
        int   nota4=3;
        float resultado1=(nota3+nota4)/2;
        System.out.println("la nota media es :"+resultado1);
        System.out.println("la nota media es:"+ ((nota3+nota4)/2));
        //para mantener los decimales y que no realice un truncado 
        
        //la forma mas correcta es realizando el casting al tipo de dato de destino
        resultado=(float)(nota1+nota2)/2;
        System.out.println("la nota media es :"+resultado);
    }
}
