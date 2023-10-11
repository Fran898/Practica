/*
 * Un frutero necesita calcular los beneficios anuales que obtiene 
 * de la venta de manzanas y peras. Por este motivo, es necesario diseñar 
 * una aplicación que solicite las ventas (en kilos) de cada semestre para 
 * cada fruta. La aplicación mostrará el importe total sabiendo que el precio 
 * del kilo de manzanas está fijado a 2,35€ y el kilo de peras en 1,95€.
 */

package hoja1.ejemplo8;

/**
 *
 * @author cic
 */
public class Ejemplo8 {

    public static void main(String[] args) { 
        // constantes para el precio de la manzana y pera 
        final float PRECIOMANZANA=2.35f;
        final float PRECIOPERA=1.95f;
        //por cada semestre guardamos los kilos vendidos
        int kilosManzanasS1=143;
        int kilosPerasS1=300;
        int kilosManzanasS2=300;
        int kilosPerasS2=400;
        // realizamos el cálculo del año por semestre
        float totalS1=(kilosManzanasS1*PRECIOMANZANA)+(kilosPerasS1*PRECIOPERA);
        float totalS2=(kilosManzanasS2*PRECIOMANZANA)+(kilosPerasS2*PRECIOPERA);
        // las ventas son
        System.out.println("Beneficio primer semestre "+totalS1);
        System.out.println("Beneficio segundo semestre "+totalS2);
        System.out.println("Total Anual "+(totalS1+totalS2));
    }
}
