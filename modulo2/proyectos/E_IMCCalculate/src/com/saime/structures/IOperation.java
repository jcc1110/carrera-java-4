package com.saime.structures;
import com.saime.exceptions.DivisionZeroException;

public interface IOperation {
    // Calcular el IMC
    void calculate() throws DivisionZeroException;
    
    // Compara el resultado de IMC y da el estado
    void comparateIMC();
}
