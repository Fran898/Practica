/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package prueba.ejercicio;

/**
 *
 * @author DAM114
 */
public class MiExcepcion extends Exception {

    /**
     * Creates a new instance of <code>MiExcepcion</code> without detail
     * message.
     */
    public MiExcepcion() {
    }

    /**
     * Constructs an instance of <code>MiExcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MiExcepcion(String msg) {
        super(msg);
    }
}
