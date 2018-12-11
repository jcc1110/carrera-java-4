package com.sia_cajero.controller;
import static com.sia_cajero.beans.Constants.LBLCLAVE;
import static com.sia_cajero.beans.Constants.LBLSALDO;
import static com.sia_cajero.beans.Constants.LBLTARJETA;
import com.sia_cajero.beans.Formulario;
import com.sia_cajero.beans.MenuBar;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public class FrmPrincipal extends Formulario {
    private JButton aceptar=new JButton();
    private JButton cancelar=new JButton();
    JLabel lblTarjeta= new JLabel(LBLTARJETA);
    private JTextField txtTarjeta = new JTextField(16);
    JLabel lblClave= new JLabel(LBLCLAVE);
    private JTextField txtClave= new JTextField(5);
    private JTextField txtMontoDeposito= new JTextField(15);
    private JTextField txtMontoRetiro= new JTextField(15);
    private boolean txtTarjetaVisible;
    private boolean txtClaveVisible;
    private boolean lblTarjetaVisible;
    private boolean lblClaveVisible;
    MenuBar mnubar;
    boolean mnubarVisible;
    JLabel lblSaldo= new JLabel(LBLSALDO);
    private JLabel txtSaldo= new JLabel();
    private boolean lblSaldoVisible;
    private boolean txtSaldoVisible;
    MnuPrincipal _mnuprincipal= new MnuPrincipal("Cajero Automatico");
    /**
     * @return the txtMontoRetiro
     */
    public JTextField getTxtMontoRetiro() {
        return txtMontoRetiro;
    }

    /**
     * @param txtMontoRetiro the txtMontoRetiro to set
     */
    public void setTxtMontoRetiro(String value) {
        this.txtMontoRetiro.setText(value);
    }

    /**
     * @return the txtMontoDeposito
     */
    public JTextField getTxtMontoDeposito() {
        return txtMontoDeposito;
    }
    
    /**
     * @param txtMontoDeposito the txtMontoDeposito to set
     */
    public void setTxtMontoDeposito(String value) {
        this.txtMontoDeposito.setText(value);
    }

    /**
     * @return the txtSaldo
     */
    public JLabel getTxtSaldo() {
        return txtSaldo;
    }

    /**
     * @param txtSaldo the txtSaldo to set
     */
    public void setTxtSaldo(String txtSaldo) {
        this.txtSaldo.setText(txtSaldo);
    }

    /**
     * @return the lblSaldoVisible
     */
    public boolean isLblSaldoVisible() {
        return lblSaldoVisible;
    }

    /**
     * @param lblSaldoVisible the lblSaldoVisible to set
     */
    public void setLblSaldoVisible(boolean value) {
        this.lblSaldo.setVisible(value);
    }

    /**
     * @return the txtSaldoVisible
     */
    public boolean isTxtSaldoVisible() {
        return txtSaldoVisible;
    }

    /**
     * @param txtSaldoVisible the txtSaldoVisible to set
     */
    public void setTxtSaldoVisible(boolean value) {
        this.getTxtSaldo().setVisible(value);
    }

    /**
     * @return the tablaSaldo
     */
    /**
     * @return the txtTarjetaVisible
     */
    public boolean isTxtTarjetaVisible() {
        return txtTarjetaVisible;
    }

    /**
     * @param txtTarjetaVisible the txtTarjetaVisible to set
     */
    public void setTxtTarjetaVisible(boolean value) {
        this.txtTarjeta.setVisible(value);
    }

    /**
     * @return the txtClaveVisible
     */
    public boolean isTxtClaveVisible() {
        return txtClaveVisible;
    }

    /**
     * @param txtClaveVisible the txtClaveVisible to set
     */
    public void setTxtClaveVisible(boolean value) {
        this.txtClave.setVisible(value);
    }

    /**
     * @return the lblTarjetaVisible
     */
    public boolean isLblTarjetaVisible() {
        return lblTarjetaVisible;
    }

    /**
     * @param lblTarjetaVisible the lblTarjeta to set
     */
    public void setLblTarjetaVisible(boolean value) {
        this.lblTarjeta.setVisible(value);
    }

    /**
     * @return the lblClaveVisible
     */
    public boolean isLblClaveVisible() {
        return lblClaveVisible;
    }

    /**
     * @param lblClaveVisible the lblClaveVisible to set
     */
    public void setLblClaveVisible(boolean value) {
        this.lblClave.setVisible(value);
    }   

    // LAYOUT A UTILIZAR
    /**
     * @return the cancelar
     */
    public JButton getCancelar() {
        return cancelar;
    }
    /**
     * @param cancelar the cancelar to set
     */
    public void setCancelar(JButton cancelar) {
        this.cancelar = cancelar;
    }
    
    /**
     * @return the aceptar
     */
    public JButton getAceptar() {
        return aceptar;
    }

    /**
     * @param aceptar the aceptar to set
     */
    public void setAceptar(JButton aceptar) {
        this.aceptar = aceptar;
    }
    
        /**
     * @return the texto
     */
    public JTextField getTxtTarjeta() {
        return txtTarjeta;
    }

    /**
     * @param texto the texto to set
     */
    public void setTxtTarjeta(JTextField texto) {
        this.txtTarjeta = texto;
    }

    /**
     * @return the txtClave
     */
    public JTextField getTxtClave() {
        return txtClave;
    }

    /**
     * @param txtClave the txtClave to set
     */
    public void setTxtClave(JTextField txtClave) {
        this.txtClave = txtClave;
    }

    // CONSTRUCTOR DE LA CLASE
    public FrmPrincipal() {
        // UTLIZANDO LOS MÉTODOS DE JFrame
        super("Menu Principal");
        super.setSize(600, 300);
        super.setLayout(null);
    }
    
    //Funcion para generar el panel de datos de Login
    public JPanel panelLogin(){
        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelLogin.add(lblTarjeta);
        panelLogin.add(txtTarjeta);
        panelLogin.add(lblClave);
        panelLogin.add(txtClave);
        return panelLogin;
    }
    
    //Funcion para generar el panel de datos de consulta de saldo
    public JPanel panelConsultaSaldo(String saldo){
        JPanel panelConsultaSaldo = new JPanel();
        panelConsultaSaldo.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelConsultaSaldo.add(lblSaldo);
        setTxtSaldo(saldo);
        panelConsultaSaldo.add(getTxtSaldo());
        return panelConsultaSaldo;
    }
    
    //Funcion para generar el panel de datos de deposito
    public JPanel panelDeposito(){
        JPanel panelDeposito = new JPanel();
        panelDeposito.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelDeposito.add(new JLabel("Ingrese el monto a depositar: "));
        panelDeposito.add(txtMontoDeposito);
        return panelDeposito;
    }
    
    //Funcion para generar el panel de datos de retiro
    public JPanel panelRetiro(){
        JPanel panelRetiro = new JPanel();
        panelRetiro.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelRetiro.add(new JLabel("Ingrese el monto a retirar: "));
        panelRetiro.add(txtMontoRetiro);
        return panelRetiro;
    }
}