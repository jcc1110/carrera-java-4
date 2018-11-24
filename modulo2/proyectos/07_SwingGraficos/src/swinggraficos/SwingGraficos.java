package swinggraficos;
import java.awt.Container;
import javax.swing.JFrame;

public class SwingGraficos {
    public static void main(String[] args) {
        // CREANDO LA VENTANA
        JFrame f = new JFrame("Gráficos");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // CONTENEDOR DE LOS COMPONENTES
        Container cp = f.getContentPane();
        
        // AÑADO EL CONTENIDO A LA VENTANA
        cp.add(new Sol());
    }
}
