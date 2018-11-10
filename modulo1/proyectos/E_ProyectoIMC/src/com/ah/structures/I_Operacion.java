package com.ah.structures;

/**
 * Interfaz para mis métodos de cálculo IMC
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public interface I_Operacion {
    
    /**
     * Calcular IMC
     * @throws CapturaDivisionCero
     */
    public abstract void calcularIMC() throws CapturaDivisionCero;
}
