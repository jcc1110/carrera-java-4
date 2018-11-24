package com.saime.views;
import com.saime.exceptions.DivisionZeroException;
import com.saime.operation.Operation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EntryPoint {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame window = new JFrame("Cálculo de IMC");
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        // Componentes necesarios
        JLabel lbPeso = new JLabel("Peso:");
        JTextField txtPeso = new JTextField(6);
        JLabel lbAltura = new JLabel("Altura:");
        JTextField txtAltura = new JTextField(6);
        JButton btnCalcular = new JButton("Calcular");
        
        // Manejador del evento clic
        ActionListener al = e -> {
            Operation op = new Operation();
            String message;
            
            // Obtenemos los valores de los componentes
            op.setPeso(Double.parseDouble(txtPeso.getText()));
            op.setAltura(Double.parseDouble(txtAltura.getText()));
            
            try {
                // Cálculo de IMC
                op.calculate();
                
                // Establezco el mensaje al usuario
                op.comparateIMC();
                
                // Busco el mensaje
                message = op.getMensaje();
            } catch (DivisionZeroException ex) {
                message = ex.getMessage();
            } catch (Exception ex) {
                message = ex.getMessage();
            }
            
            // Muestro el mensaje
            JOptionPane.showMessageDialog(btnCalcular, message);
        };
        btnCalcular.addActionListener(al);
        
        // Contenedor de la vista
        Container con = window.getContentPane();
        GridLayout gl = new GridLayout(3, 2);
        con.setLayout(gl);
        
        // Añadiendo los componentes a la vista
        con.add(lbPeso);
        con.add(txtPeso);
        con.add(lbAltura);
        con.add(txtAltura);
        con.add(btnCalcular);
    }
}
