package com.sia_cajero.beans;

import com.sia_cajero.beans.interfaces.IFormulario;
import javax.swing.JFrame;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public abstract class Formulario extends JFrame implements IFormulario {
    Formulario(){}
    
    public Formulario(String _titulo){
        super(_titulo);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
