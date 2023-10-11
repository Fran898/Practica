/*
 * Diseña un algoritmo que nos indique si podemos salir a la calle. 
 * Existen aspectos que influirán en esta decisión: 
 * si está lloviendo y si hemos terminado nuestras tareas. 
 * Solo podremos salir a la calle si no está lloviendo y 
 * hemos finalizado nuestras tareas. Existe una opción en la que, 
 * indistintamente de lo anterior, podremos salir a la calle: 
 * el hecho de que tengamos que ir a la biblioteca. 
 * Solicitar al usuario mediante booleano si llueve, 
 * si ha finalizado las tareas y si necesita ir a la biblioteca. 
 * El algoritmo debe mostrar mediante booleano si es posible que se le otorgue 
 * el permiso de salir a la calle.
 */

package hoja1.ejemplo7;

/**
 *
 * @author cic
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        boolean siLLueve=true;
        boolean finalizaTareas=false;
        boolean irBiblioteca=true;
        
        boolean salir= (!siLLueve && finalizaTareas)||irBiblioteca;
        System.out.println("Si es true puede salir "+ salir);
    }
}
