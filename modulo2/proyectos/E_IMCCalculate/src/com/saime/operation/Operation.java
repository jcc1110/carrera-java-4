package com.saime.operation;
import com.saime.exceptions.DivisionZeroException;
import com.saime.structures.IOperation;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Operation implements IOperation {
    // Atributos
    private double peso;
    private double altura;
    private double imc;
    private String mensaje;
    
    @Override
    public void calculate() throws DivisionZeroException {
        // Validar la excepción
        if (this.getAltura() == 0) {
            throw new DivisionZeroException("El valor cero no esta permitido.");
        }
        
        // Realizo el cáculo
        this.setImc(this.getPeso() / (this.getAltura() * this.getAltura()));
    }

    @Override
    public void comparateIMC() {
        // Declaro las variables necesarias
        String estado = "";
        
        // Valido la condición actual del usuario
        if (this.getImc() < 18.5) {
            estado = "Bajo peso";
        } else if (this.getImc() >= 18.5 && this.getImc() <= 24.9) {
            estado = "Peso normal";
        } else if (this.getImc() >= 25.5 && this.getImc() <= 29.9) {
            estado = "Sobrepeso";
        } else if (this.getImc() >= 30.0 && this.getImc() <= 34.5) {
            estado = "Obesidad grado I";
        } else if (this.getImc() >= 35.0 && this.getImc() <= 39.9) {
            estado = "Obesidad grado II";
        } else if (this.getImc() >= 40.0) {
            estado = "Obesidad grado III";
        }
        
        // Establezco el mensaje al usuario
        NumberFormat f = new DecimalFormat("#0.00");
        this.setMensaje("Tu valor IMC es: " + f.format(this.getImc()) + " y tu estado es " + estado);
    }
    
    // Métodos Getter y Setter
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
