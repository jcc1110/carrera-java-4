package swingjframe;
import javax.swing.JFrame;

public class MisVentanas extends JFrame {
    // CONSTRUCTOR DE LA CLASE
    public MisVentanas() {
        // UTLIZANDO LOS MÉTODOS DE JFrame
        super("Mi Segunda Ventana");
        super.setSize(400, 400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
