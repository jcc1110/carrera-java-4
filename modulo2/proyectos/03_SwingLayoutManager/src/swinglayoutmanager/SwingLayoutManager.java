package swinglayoutmanager;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingLayoutManager {
    public static void main(String[] args) {
        // REALIZANDO LA INSTANCIA DE MI VENTANA
        JFrame f = new JFrame("Layout Manager");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // CONTENEDOR DE LOS COMPONENTES
        Container cp = f.getContentPane();
        
        // ESTILOS DE Layout Manager
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
        GridLayout gl = new GridLayout(0, 3, 10, 10);
        BorderLayout bl = new BorderLayout();
        
        // LAYOUT A UTILIZAR
        cp.setLayout(fl);
        
        // COMPONENTES PARA LA NUEVA VENTANA
        JLabel etiqueta1 = new JLabel("Nombre:");
        JLabel etiqueta2 = new JLabel("---");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // AÑADO MIS COMPONENTES A LA VENTANA
        cp.add(etiqueta1, BorderLayout.NORTH);
        cp.add(texto, BorderLayout.SOUTH);
        cp.add(boton, BorderLayout.WEST);
        cp.add(etiqueta2, BorderLayout.EAST);
    }
}
