package com.sia_cajero.views;

import static com.sia_cajero.beans.Constants.BOTONA;
import static com.sia_cajero.beans.Constants.BOTONC;
import static com.sia_cajero.beans.Constants.DEPOSITO_ERROR;
import static com.sia_cajero.beans.Constants.DEPOSITO_LETRAS;
import static com.sia_cajero.beans.Constants.DEPOSITO_OK;
import static com.sia_cajero.beans.Constants.DEPOSITO_VACIO;
import static com.sia_cajero.beans.Constants.EMPTY_STRING;
import static com.sia_cajero.beans.Constants.LOGIN_FAILURE;
import static com.sia_cajero.beans.Constants.LOGIN_OK;
import static com.sia_cajero.beans.Constants.MENU1;
import static com.sia_cajero.beans.Constants.MENU2;
import static com.sia_cajero.beans.Constants.MENU3;
import static com.sia_cajero.beans.Constants.MENU4;
import static com.sia_cajero.beans.Constants.RETIRO_ERROR;
import static com.sia_cajero.beans.Constants.RETIRO_LETRAS;
import static com.sia_cajero.beans.Constants.RETIRO_OK;
import static com.sia_cajero.beans.Constants.RETIRO_VACIO;
import com.sia_cajero.beans.Menu;
import com.sia_cajero.beans.MenuBar;
import com.sia_cajero.beans.Usuario;
import com.sia_cajero.controller.DBService;
import com.sia_cajero.controller.FrmPrincipal;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public class SIA_Cajero implements ActionListener{
    static JMenuItem i1,i2,i3,i4;
    private static JButton btnAceptarLogin=new JButton(BOTONA);
    private static JButton btnCancelarLogin=new JButton(BOTONC);
    private static JButton btnAceptarDeposito=new JButton(BOTONA);
    private static JButton btnAceptarRetiro=new JButton(BOTONA);
    static String menuItemSeleccionado=EMPTY_STRING;
    /**
     * @return the btnAceptarLogin
     */
    public static boolean getB1() {return btnAceptarLogin.isVisible();}

    /**
     * @param aB1 the btnAceptarLogin to set
     */
    public static void setB1(boolean value) {btnAceptarLogin.setVisible(value);}

    /**
     * @return the btnCancelarLogin
     */
    public static boolean getB2() {return btnCancelarLogin.isVisible();}

    /**
     * @param aB2 the btnCancelarLogin to set
     */
    public static void setB2(boolean value) {btnCancelarLogin.setVisible(value);}
    
    public static Menu menuItem(String _titulo){
        Menu menu = new Menu(_titulo);
        i1=new JMenuItem(MENU1);i2=new JMenuItem(MENU2);i3=new JMenuItem(MENU3);i4=new JMenuItem(MENU4); 
        menu.add(i1); menu.add(i2); menu.add(i3);menu.add(i4);
        return menu;
    }
            
    public static MenuBar menuBarra(Menu _menu){
        MenuBar mb=new MenuBar();  
        mb.add(_menu);  
        return mb;
    }

    public void actionPerformed(ActionEvent e) {    
        if(e.getSource()==i1)
        if(e.getSource()==i2)
        if(e.getSource()==i3)
        if(e.getSource()==i4)
            System.out.println("");
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variable tipo e instanciado del objeto
        Usuario _usuario= new Usuario();
        FrmPrincipal form = new FrmPrincipal();
        Menu mnu = menuItem("Menu");
        MenuBar mnubar= menuBarra(mnu);
        form.setJMenuBar(mnubar);
        
        // AÑADO MIS COMPONENTES A LA VENTANA
        Container cp = form.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        cp.add(form.panelLogin(),BorderLayout.CENTER);
        cp.add(btnAceptarLogin);cp.add(btnCancelarLogin);
        
        // IMPLEMENTACIÓN DE LA INTEFAZ REQUERIDA
        ActionListener manejoEventoLogin = e -> {
            GridLayout gl = new GridLayout(2,2);
            cp.setLayout(gl);
            if(e.getSource()==i1){
                menuItemSeleccionado=i1.getText();
                cp.removeAll();
                DBService _dbService= new DBService();
                String _saldo=_dbService.obtenerSaldo(_usuario);
                cp.setLayout(new FlowLayout(FlowLayout.LEFT));
                cp.add(form.panelConsultaSaldo(_saldo),BorderLayout.WEST);
            }else if (e.getSource()==i2){
                menuItemSeleccionado=i2.getText();
                cp.removeAll();
                cp.setLayout(new FlowLayout(FlowLayout.CENTER));
                cp.add(form.panelDeposito(),BorderLayout.CENTER);
                cp.add(btnAceptarDeposito);
            }else if (e.getSource()==i3){
                cp.removeAll();
                menuItemSeleccionado=i3.getText();
                cp.setLayout(new FlowLayout(FlowLayout.CENTER));
                cp.add(form.panelRetiro(),BorderLayout.CENTER);
                cp.add(btnAceptarRetiro);
            }else if (e.getSource()==i4){
                cp.removeAll();
                menuItemSeleccionado=i4.getText();
            }
        };
        
        // IMPLEMENTACIÓN DE LA INTEFAZ REQUERIDA
        ActionListener eventoBoton = e -> {
            _usuario.setTarjeta(form.getTxtTarjeta().getText());
            _usuario.setClave(form.getTxtClave().getText());
            if(menuItemSeleccionado.equals(EMPTY_STRING)){
                if(e.getActionCommand().equals(BOTONA)){
                    DBService _dbService= new DBService();
                    boolean result=_dbService.validarUsuario(_usuario);
                    if (result){
                        JOptionPane.showMessageDialog(btnAceptarLogin, LOGIN_OK);
                        form.setLblTarjetaVisible(false);
                        form.setTxtTarjetaVisible(false);
                        form.setLblClaveVisible(false);
                        form.setTxtClaveVisible(false);
                        setB1(false);
                        setB2(false);
                        mnubar.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(btnAceptarLogin, LOGIN_FAILURE);
                    }
                }
            }else if(menuItemSeleccionado.equals(MENU2)){
                if(e.getActionCommand().equals(BOTONA)){
                    if(form.getTxtMontoDeposito().getText().equals(EMPTY_STRING)){
                        JOptionPane.showMessageDialog(btnAceptarDeposito, DEPOSITO_VACIO);
                        return;
                    }
                    if(!form.getTxtMontoDeposito().getText().matches("[0-9]+")){
                        JOptionPane.showMessageDialog(btnAceptarDeposito, DEPOSITO_LETRAS);
                        return;
                    }
                    double monto=Double.valueOf(form.getTxtMontoDeposito().getText());
                    DBService _dbService= new DBService();
                    boolean result=_dbService.validarUsuario(_usuario);
                    _dbService.deposito(_usuario, monto);
                    if (result){
                        JOptionPane.showMessageDialog(null, DEPOSITO_OK);
                        cp.removeAll();
                        form.setTxtMontoDeposito(EMPTY_STRING);
                        mnubar.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(btnAceptarDeposito, DEPOSITO_ERROR);
                    }
                }
            }else if(menuItemSeleccionado.equals(MENU3)){
                if(e.getActionCommand().equals(BOTONA)){
                    if(form.getTxtMontoRetiro().getText().equals(EMPTY_STRING)){
                        JOptionPane.showMessageDialog(btnAceptarRetiro, RETIRO_VACIO);
                        return;
                    }
                    if(!form.getTxtMontoRetiro().getText().matches("[0-9]+")){
                        JOptionPane.showMessageDialog(btnAceptarRetiro, RETIRO_LETRAS);
                        return;
                    }
                    double monto=Double.valueOf(form.getTxtMontoRetiro().getText());
                    DBService _dbService= new DBService();
                    boolean result=_dbService.validarUsuario(_usuario);
                    _dbService.retiro(_usuario, monto);
                    if (result){
                        JOptionPane.showMessageDialog(null, RETIRO_OK);
                        cp.removeAll();
                        form.setTxtMontoDeposito(EMPTY_STRING);
                        mnubar.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(btnAceptarRetiro, RETIRO_ERROR);
                    }
                }
            }
        };
        i1.addActionListener(manejoEventoLogin);
        i2.addActionListener(manejoEventoLogin);
        i3.addActionListener(manejoEventoLogin);
        i4.addActionListener(manejoEventoLogin);
        btnAceptarLogin.addActionListener(eventoBoton);
        btnCancelarLogin.addActionListener(eventoBoton);
        btnAceptarDeposito.addActionListener(eventoBoton);
        btnAceptarRetiro.addActionListener(eventoBoton);
        mnubar.setVisible(false);
    }
}
