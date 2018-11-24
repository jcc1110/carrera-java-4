package swingeventos;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingEventos {
    public static void main(String[] args) {
        // CONSTRUYENDO LA VENTANA
        JFrame f = new JFrame("Manejo de Eventos");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // CONTENEDOR DE COMPONENTES
        Container cp = f.getContentPane();
        
        // LAYOUT A UTILIZAR
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // COMPONENTES DE LA VENTANA
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // IMPLEMENTACIÓN TRADICIONAL 1
        //boton.addActionListener(new ManejoEvento(texto));
        
        // IMPLEMENTACIÓN TRADICIONAL 2
        /*boton.addActionListener(new ManejoEvento() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje;
                String valor = texto.getText();
                mensaje = (!valor.isEmpty()) ? "Hola, " + valor : "¡Hola mundo!";  
                JOptionPane.showMessageDialog(boton, mensaje);
            }
        });*/
        
        // IMPLEMENTACIÓN DE LA INTEFAZ REQUERIDA
        ActionListener manejoEvento = e -> {
            String mensaje;
            String valor = texto.getText();
            mensaje = (!valor.isEmpty()) ? "Hola, " + valor : "¡Hola mundo!";  
            JOptionPane.showMessageDialog(boton, mensaje);
        };
        boton.addActionListener(manejoEvento);
        
        // AÑADO MIS COMPONENTES A LA VENTANA
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
