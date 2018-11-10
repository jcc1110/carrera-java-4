package com.ah.structures;

/**
 * Capturando el error de división por cero
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class CapturaDivisionCero extends Exception {

    /**
     * Constructor del padre
     * @param message Mensaje del error
     */
    public CapturaDivisionCero(String message) {
        super(message);
    }
}
