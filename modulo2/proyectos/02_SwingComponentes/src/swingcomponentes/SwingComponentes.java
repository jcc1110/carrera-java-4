package swingcomponentes;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingComponentes {
    public static void main(String[] args) {
        // CREANDO MI PRIMERA VENTANA
        JFrame f = new JFrame("Componentes de una Ventana");
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // CREANDO LA INSTANCIA DE Container
        Container cp = f.getContentPane();
        
        // Estableciendo el diseño
        cp.setLayout(new FlowLayout());
        
        // CREANDO LOS COMPONENTES
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // AÑADIENDO LOS COMPONENTES A LA INTERFAZ
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
