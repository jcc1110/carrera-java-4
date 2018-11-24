package swingeventos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ManejoEvento implements ActionListener {
    private JTextField textoInterno;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String mensaje;
        String valor = this.textoInterno.getText();
        mensaje = (!valor.isEmpty()) ? "Hola, " + valor : "¡Hola mundo!";  
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public ManejoEvento(JTextField texto) {
        this.textoInterno = texto;
    }
}
