/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Taller {

    //Declaracion de atributos
    private int aceite;//En litros
    private int ruedas;
    private static int contadorCambiosTotales;
    private static int contadorCambiosParciales;

    public Taller(int aceite, int ruedas) {
        this.aceite = aceite*5;
        this.ruedas = ruedas;

    }
    
    public Taller(Taller n){
        this.aceite = n.aceite;
        this.ruedas = n.ruedas;
        
    }

    public void addAceite(int addAceite) {
        aceite += (addAceite*5);
    }

    public void addRuedas(int addRuedas) {
        ruedas += addRuedas;
    }

    public int getCambioCompletos() {

        return (ruedas/4) < (aceite/3) ? (ruedas/4) : (aceite/3);
    }

    public int getCambioParcial() {

        return (ruedas/2) < (aceite/3) ? (ruedas/2) : (aceite/3);
    }
    
    public static int getNumCambiosTotales() {
        return contadorCambiosTotales;

    }

    public static int getNumCambiosParciales() {
        return contadorCambiosParciales;
        
    }
    
    public int getRuedas(){
        return ruedas;
    }
    
    public int getAceite(){
        return aceite;
    }

    public void cambioCompleto() {

        aceite -= getCambioCompletos() > 0 ? 3 : aceite;
        ruedas -= getCambioCompletos() > 0 ? 4 : ruedas;
        contadorCambiosTotales = getCambioCompletos() > 0 ? ++contadorCambiosTotales : contadorCambiosTotales;

    }

    public void cambioParcial() {

        aceite -= getCambioParcial() > 0 ? 3 : aceite;
        ruedas -= getCambioParcial() > 0 ? 2 : ruedas;
        contadorCambiosParciales = getCambioParcial() > 0 ? ++contadorCambiosParciales : contadorCambiosParciales;

    }

    
    @Override
    //String.builder
    public String toString (){
        double total = (213.5*contadorCambiosTotales) + (135*contadorCambiosParciales);
        String texto = "TALLER\nEXISTENCIAS:\n \tRuedas: " + ruedas + " unidades.\n\tAceite: " + aceite + " litros.\nINGRESOS: Total: " + String.format("%,.2f", total) + " €";
        return texto;
        
    }
    
    
    
    

}