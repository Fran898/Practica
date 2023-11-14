/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio4;

/**
 *
 * @author Francisco Sitjar
 */
public class FormatoFecha {

    private int dianum, diasemana, mes, anno;

    public FormatoFecha() {

    }

    public FormatoFecha(int dianum, int diasemana, int mes, int anno) {
        this.dianum = dianum;
        this.anno = anno;
        this.diasemana = diasemana;
        this.mes = mes;
    }

    private String obtenerDiaSemana() {
        return switch (diasemana) {
            case 1 ->
                "Lunes";
            case 2 ->
                "Martes";
            case 3 ->
                "Miercoles";
            case 4 ->
                "Jueves";
            case 5 ->
                "Viernes";
            case 6 ->
                "Sabado";
            case 7 ->
                "Domingo";
            default ->
                "nofecha";
        };

    }

    private String obtenerMes() {
        return switch (mes) {
            case 1 ->
                "Enero";
            case 2 ->
                "Febrero";
            case 3 ->
                "Marzo";
            case 4 ->
                "Abril";
            case 5 ->
                "Mayo";
            case 6 ->
                "Junio";
            case 7 ->
                "Julio";
            case 8 ->
                "Agosto";
            case 9 ->
                "Septiembre";
            case 10 ->
                "Octubre";
            case 11 ->
                "Noviembre";
            case 12 ->
                "Diciembre";
            default ->
                "nofecha";
        };
    }
    
    
    private boolean diaValido(){
       return switch(mes){
            case 1, 3, 5, 7, 8, 10, 12 -> (dianum <= 31);            
            case 4, 6, 9, 11 -> (dianum <= 30);
            case 2 -> (dianum <= 28)|| ((dianum <= 29) && (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)));
            default -> false;                            
                                                                
        };
        
    }

    public String salidaFormatoFecha() {
        if (obtenerDiaSemana().equalsIgnoreCase("nofecha") || obtenerMes().equalsIgnoreCase("nofecha") || !diaValido()) {

            return "Fecha no valida";
        } else {
            return obtenerDiaSemana() + ", " + dianum + " de " + obtenerMes() + " de " + anno;

        }
        

    }

}
