package com.ah.operations;
import com.ah.structures.CapturaDivisionCero;
import com.ah.structures.I_Operacion;

/**
 * Clase para los cálculos necesarios
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class CalculoIMC implements I_Operacion {
    // Atributos
    private double peso;
    private double altura;
    private double imc;
    
    // Métodos
    @Override
    public void calcularIMC() throws CapturaDivisionCero {      
        // Validando la exception
        if (this.getAltura() == 0) {
            throw new CapturaDivisionCero("La división no se puede realizar por un valor cero.");
        }
        
        // Realizando el cálculo del IMC
        this.setImc(this.getPeso() / Math.pow(this.getAltura(), 2));
    }
    
    // Getter / Setter
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
