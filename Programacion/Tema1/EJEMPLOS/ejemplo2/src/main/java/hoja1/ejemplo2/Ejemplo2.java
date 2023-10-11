/*
 * Escribir una aplicación que pide el año actual y el de nacimiento del usuario. Debe calcular su edad, 
 * suponiendo que en el año en curso el usuario ya ha cumplido años.
 */

package hoja1.ejemplo2;

/**
 *
 * @author cic
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        short anoActual=2022;
        short anoNacimiento=1966;
        int resultado=anoActual-anoNacimiento;
        System.out.println("La edad es "+ resultado);
    }
}
