/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maruja
 */
public class Principal extends JFrame {
    // Declarando componentes
        JButton botonAceptar, botonCancelar,botonIdioma;
        private JTextField txttarjeta = new JTextField(16);
        private JTextField txtclave = new JTextField(8);
        private JLabel lbltarjeta = new JLabel("Tarjeta:");
        private JLabel lblclave = new JLabel("Clave:");
        private boolean logear;
      public Principal()  {
        // UTLIZANDO LOS MÉTODOS DE JFrame
        super("Cajero automático");
        super.setSize(610, 170);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
      
      public JPanel login (){
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(2, 2, 0, 5));
        panelDatos.add(lbltarjeta);
        panelDatos.add(txttarjeta);
        panelDatos.add(lblclave);
        panelDatos.add(txtclave);
        
        return panelDatos;

      }
      public JPanel botones (){
        JPanel panelBotones = new JPanel();    


        
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
       
        return panelBotones;
      }
      
      public JPanel opciones(){
          JPanel panelOpciones = new JPanel();
          panelOpciones.setLayout(new FlowLayout(FlowLayout.CENTER));
          return panelOpciones;
      }

    /**
     * @return the txttarjeta
     */
    public JTextField getTxtTarjeta() {
        return txttarjeta;
    }

    /**
     * @param txttarjeta the txttarjeta to set
     */
    public void setTxtTarjeta(JTextField txttarjeta) {
        this.txttarjeta = txttarjeta;
    }

    /**
     * @return the txtclave
     */
    public JTextField getTxtclave() {
        return txtclave;
    }

    /**
     * @param txtclave the txtclave to set
     */
    public void setTxtclave(JTextField txtclave) {
        this.txtclave = txtclave;
    }

    public void setTxtEnable(boolean value) {
        this.txttarjeta.setEnabled(value);
    }
    public void setTxtTarjetaVisible(boolean value) {
        this.txttarjeta.setVisible(value);
    }
    public void setTxtClaveVisible(boolean value) {
        this.txtclave.setVisible(value);
    }  
     public void setLblTarjetaVisible(boolean value) {
        this.lbltarjeta.setVisible(value);
    }
    public void setLblClaveVisible(boolean value) {
        this.lblclave.setVisible(value);
    }
        public boolean getlogear() {
        return logear;
    }
    public void setlogear(boolean LogOn) {
        this.logear = LogOn;
    }
    
     public void CambioIdioma(ResourceBundle rb)  {
      // Establezco los componentes del jFrame para cambiar el texto
        lbltarjeta.setText(rb.getString("Principal.lbltarjeta.text"));
        lblclave.setText(rb.getString("Principal.lblclave.text"));
        
    
}
}

