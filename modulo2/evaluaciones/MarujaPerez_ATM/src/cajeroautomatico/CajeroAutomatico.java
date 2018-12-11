/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import beans.Cliente;
import conexionbd.ConexionBD;
import formularios.Principal;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import servicios.Servicios;
import static utils.Utils.escribirLog;

/**
 *
 * @author maruja
 */
public class CajeroAutomatico {
            public static boolean datos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // Se inicializa el idioma de la app
        Locale lo = new Locale("en", "US");
        Locale.setDefault(lo);

        escribirLog("Comenzando la app de cajero automático");
        Principal principal = new Principal();
        Servicios serv = new Servicios("");
        JPanel panelBotones = new JPanel();   
        JButton botonIngresar= new JButton("Ingresar");
        JButton botonIdioma= new JButton("Idioma");
        JButton botonSalir= new JButton("Salir");
        panelBotones.add(botonIngresar);
        panelBotones.add(botonIdioma);
        panelBotones.add(botonSalir);
       
        JButton botonSaldo= new JButton("Consultar Saldo");
        JButton botonDeposito= new JButton("Depositos");
        JButton botonRetiro= new JButton("Retiros");
        JButton botonCerrar= new JButton("Salir");

        Container cp = principal.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        cp.add(principal.login(),BorderLayout.PAGE_START);
        cp.add(panelBotones,BorderLayout.CENTER);

        
//Listener de evento del boton de ingresar        
        ActionListener botonIngresarE= e -> {
            String txttarjeta = principal.getTxtTarjeta().getText();
            String txtclave = principal.getTxtclave().getText();
            Connection conexion= null;
            try {
                conexion = ConexionBD.ConexionBD();
            } catch (SQLException ex) {
                try {
                    escribirLog(ex.getMessage());
                } catch (IOException ex1) {
                    Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
           Cliente cli = new Cliente();
           cli.setTarjeta(txttarjeta);
           cli.setClave(txtclave);
           boolean result = false;
           result = serv.Login(conexion, cli);
           if (result){
              JOptionPane.showMessageDialog(botonIngresar, "Bienvenido al cajero autómatico de Petros. Recuerde invertir en la moneda más poderosa del mundo!!!");
              principal.setTxtTarjetaVisible(false);
              principal.setTxtClaveVisible(false);
              principal.setLblTarjetaVisible(false);
              principal.setLblClaveVisible(false);
              botonIngresar.setVisible(false);
              botonIdioma.setVisible(false);
              botonSalir.setVisible(false);
              panelBotones.add(botonSaldo);
              panelBotones.add(botonDeposito);
              panelBotones.add(botonRetiro);
              panelBotones.add(botonCerrar);
              cp.add(panelBotones,BorderLayout.CENTER);
           }else{
              JOptionPane.showMessageDialog(botonIngresar, "Datos Invalidos");
            }
      };
        botonIngresar.addActionListener(botonIngresarE);
        
           //Evento de Consulta de Saldo
         ActionListener consultasaldo = e -> {
            String txttarjeta = principal.getTxtTarjeta().getText();
            String txtclave = principal.getTxtclave().getText();
            Connection conexion= null;
            try {
                conexion = ConexionBD.ConexionBD();
            } catch (SQLException ex) {
                try {
                    escribirLog(ex.getMessage());
                } catch (IOException ex1) {
                    Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
           Cliente cli = new Cliente();
           cli.setTarjeta(txttarjeta);
           cli.setClave(txtclave);
           String result = "";
           result = serv.Saldo(conexion, cli);
                     
           JOptionPane.showMessageDialog(botonSaldo, result);
         };
         
         botonSaldo.addActionListener(consultasaldo);
         
        //Listener de Deposito
         ActionListener depositar = e -> {
            String dialogo;
            double deposito;
            boolean resultado= false;
            
            dialogo = JOptionPane.showInputDialog("Petros a depositar:");
            deposito = Double.parseDouble(dialogo);
            
            String txttarjeta = principal.getTxtTarjeta().getText();
            Connection conexion= null;
            try {
                conexion = ConexionBD.ConexionBD();
            } catch (SQLException ex) {
                try {
                    escribirLog(ex.getMessage());
                } catch (IOException ex1) {
                    Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
           Cliente cli = new Cliente();
           cli.setTarjeta(txttarjeta);

           resultado = serv.Deposito(conexion, cli, deposito);
            if (deposito > 0){
               if(resultado){
                    JOptionPane.showMessageDialog(botonDeposito, "Su deposito ha sido exitoso. El Petro es la mejor manera de Ahorrar");
                }
            }else{
                JOptionPane.showMessageDialog(botonDeposito, "Por favor realice un deposito mayor a cero (0)");            }
        };
         
         botonDeposito.addActionListener(depositar);
         
        //Listener de Retiro 
        ActionListener retiro = e -> {
            String resultSaldo, dialogo;
            double monto;
            boolean resultado= false;
           
            dialogo = JOptionPane.showInputDialog("Ingrese Petros a retirar: ");
            monto = Double.parseDouble(dialogo);
            String txttarjeta = principal.getTxtTarjeta().getText();
            Connection conexion= null;
            try {
                conexion = ConexionBD.ConexionBD();
            } catch (SQLException ex) {
                try {
                    escribirLog(ex.getMessage());
                } catch (IOException ex1) {
                    Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
           Cliente cli = new Cliente();
           cli.setTarjeta(txttarjeta);
           resultSaldo = serv.Saldo(conexion, cli);
           resultado = serv.Retiro(conexion, cli, monto);
            if (monto > 0) {
                if(resultado){
                 JOptionPane.showMessageDialog(botonRetiro, "Retiro de Petros Exitosa");
                }else if (monto > Double.parseDouble(resultSaldo)) {
                 JOptionPane.showMessageDialog(botonRetiro, "Ud. no posee fondos para realizar esta operación");            }
                } else{
                 JOptionPane.showMessageDialog(botonRetiro, "Por favor realice un retiro mayor a cero (0)");    
                  }  
        };
            botonRetiro.addActionListener(retiro);
        
                //Listener de Retiro 
        ActionListener idioma = e -> {
            
            // Cambiando el idioma a español
       Locale loc = new Locale("es","ES");
       Locale.setDefault(loc);
       
       // Obteniendo el archivo para traducir
       ResourceBundle rb = ResourceBundle.getBundle("formularios/Confi", loc);
            try {
                // Llamando al método
            escribirLog("Se realizó el cambio de idioma");
            } catch (IOException ex) {
                Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }
           // Llamando al método para cambiar el idioma
           principal.CambioIdioma(rb);
 
        };
            botonIdioma.addActionListener(idioma);

            
        ///Cierra la app    
        ActionListener cierre = e -> {
             JOptionPane.showMessageDialog(botonCerrar, "Hasta Luego!!!");
             System.exit( 0 ); 
         };
         botonCerrar.addActionListener(cierre);    
        
         ///Cierra la app    
        ActionListener cerrar = e -> {
             JOptionPane.showMessageDialog(botonSalir, "Hasta Luego!!!");
             
             System.exit( 0 ); 
         };
         botonSalir.addActionListener(cierre);     
}
}
