/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos.calculafacturaelectricidad;

/**
 *
 * @author DAM114
 */
public class Facturado {

    public double calculaFacturado(double subtotal) {
        double porcentajeDescuento = calcularDescuento(subtotal);
        double descuentoTotal = subtotal * porcentajeDescuento;
        double totalFactura = subtotal - descuentoTotal;
        return totalFactura;

    }

    public static double calcularDescuento(double subtotal) {
        double porcentajeDescuento = 0.0d;
        final double D100 = 0.1;
        final double D200 = 0.2;
        final double D500 = 0.25;
        if (subtotal >= 500) {
            porcentajeDescuento = D500;
        } else if (subtotal >= 200) {
            porcentajeDescuento = D200;
        } else if (subtotal >= 100) {
            porcentajeDescuento = D100;

        }
        return porcentajeDescuento;
    }

}
