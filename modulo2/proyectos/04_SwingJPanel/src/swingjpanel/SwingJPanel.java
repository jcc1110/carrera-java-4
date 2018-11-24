package swingjpanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingJPanel {
    public static void main(String[] args) {
        // CREO MI VENTANA
        JFrame f = new JFrame("Añadir Usuario");
        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        // PANEL DE FECHA
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        
        // PANEL DE DATOS
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(3, 2, 0, 5));
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Cedula:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha de nacimiento:"));
        panelDatos.add(panelFecha);

        // PANEL DE BOTONES
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));

        // CONTENEDOR
        Container cp = f.getContentPane();
        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(panelBotones, BorderLayout.SOUTH);
    }
}
