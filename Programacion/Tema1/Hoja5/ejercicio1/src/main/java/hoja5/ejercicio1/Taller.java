/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Francisco Sitjar
 */
public class Taller {

    //Declaracion de atributos
    private int aceite;//En litros
    private int ruedas;
    private int contadorCambiosTotales;
    private int contadorCambiosParciales;

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

        return (ruedas / 4) < (aceite / 3) ? (ruedas / 4) : (aceite / 3);
    }

    public int getCambioParcial() {

        return (ruedas / 2) < (aceite / 3) ? (ruedas / 2) : (aceite / 3);
    }
    
    public int getNumCambiosTotales() {
        return contadorCambiosTotales;

    }

    public int getNumCambiosParciales() {
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
        contadorCambiosTotales++;

    }

    public void cambioParcial() {

        aceite -= getCambioParcial() > 0 ? 3 : aceite;
        ruedas -= getCambioParcial() > 0 ? 2 : ruedas;
        contadorCambiosParciales++;

    }

    
    @Override
    //String.builder
    public String toString (){
        double total = (((3*4.5) + (50*4))*contadorCambiosTotales) + (((3*5) + (60*2))*contadorCambiosParciales);
        return "TALLER\nEXISTENCIAS:\n \tRuedas: " + ruedas + " unidades.\n\tAceite: " + aceite + " litros.\nINGRESOS: Total: " + total + " €" ;
        
    }
    
    
    
    

}
