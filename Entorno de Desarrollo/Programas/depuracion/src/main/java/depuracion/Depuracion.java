package depuracion;

/**
 *
 * @author cic
 */
public class Depuracion {

    public static void main(String[] args) {
        // Creamos un objeto de la clase Reloj
        Reloj miReloj = new Reloj(23, 59, 59);
        //Mostramos la hora en formato 24H
        System.out.println("La hora que marca miReloj en formato 24H es:");
        System.out.println(miReloj.hora24());
        //Mostramos la hora en formato 12H
        System.out.println("La hora que marca miReloj en formato 12H es:");
        System.out.println(miReloj.hora12());
        //Sumamos un segundo a la hora que marca miReloj
        miReloj.incrementa();
        //Mostramos la hora tras aumentar un segundo la hora
        System.out.println("La hora tras sumar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras sumar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        //Restamos un segundo
        miReloj.decrementa();
        //Mostramos la hora tras restar un segundo la hora
        System.out.println("La hora tras restar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras restar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
         //Cambio los minutos y segundos a 0
        System.out.println("Cambio los minutos y segundos a cero: 23:00:00");
        miReloj.asignarMinuto(0);
        miReloj.asignarSegundo(0);
        //Restamos un segundo
        miReloj.decrementa();
        //Mostramos la hora tras restar un segundo la hora
        System.out.println("La hora tras restar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras restar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        //Sumamos un segundo a la hora que marca miReloj
        miReloj.incrementa();
        //Mostramos la hora tras aumentar un segundo la hora
        System.out.println("La hora tras sumar un segundo en formato 24H es: ");
        System.out.println(miReloj.hora24());
        System.out.println("La hora tras sumar un segundo en formato 12H es: ");
        System.out.println(miReloj.hora12());
        
    }
}
