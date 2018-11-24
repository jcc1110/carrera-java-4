package swingjframe;
import javax.swing.JFrame;

public class SwingJFrame {
    public static void main(String[] args) {
        // CREANDO MI PRIMERA VENTANA
        JFrame f = new JFrame("Mi Primera Ventana");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // CREANDO MI SEGUNDA VENTANA
        MisVentanas mv = new MisVentanas();
    }
}
