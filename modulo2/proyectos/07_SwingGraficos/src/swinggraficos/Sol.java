package swinggraficos;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Sol extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        // ESTABLECIENDO EL COLOR
        g.setColor(Color.ORANGE);
        
        // RELLENANDO EL OVALO
        g.fillOval(100, 100, 200, 200);
        
        // CREANDO LAS LINEAS
        for (double i=0; i<(2 * Math.PI); i+=0.1) {
            int xEnd = (int)(200 + 150 * Math.cos(i));
            int yEnd = (int)(200 + 150 * Math.sin(i));
            g.drawLine(200, 200, xEnd, yEnd);
        }
        
        // ESTABLECIENDO EL COLOR
        g.setColor(Color.BLACK);
        
        // CREANDO UN ARCO
        g.drawArc(150, 150, 100, 100, 230, 80);
        
        // CREANDO UN OVALO
        g.fillOval(150, 150, 20, 20);
        
        // RELLENANDO EL OVALO
        g.fillOval(230, 150, 20, 20);
    }
}
