/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import beans.Cliente;
import beans.IServicios;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static utils.Utils.escribirLog;

/**
 * 
 * @author maruja
 */
public class Servicios implements IServicios{
    private String a;
    
public Servicios(String a){
    this.a=a;
}
    @Override
    public boolean Login(Connection conn, Cliente cli) {
        boolean result = false;
        String sql;
        try {
            Statement statement = conn.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ cli.getTarjeta() +"' AND clave='"+ cli.getClave() +"'";
            ResultSet rs = statement.executeQuery(sql);            
            while(rs.next()) {
                result = true;
            }
             if(result){
                 escribirLog("El cliente con la tarjeta " + cli.getTarjeta() + " Se autenticó exitosamente");
             }
             
        } catch (SQLException ex) {
             try {
                 escribirLog(ex.getMessage());
             } catch (IOException ex1) {
                 Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex1);
             }
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
                return result;
         
        
 }

    @Override
    public String Saldo(Connection conn, Cliente cli) {
        String result = null;
        String sql;
        
        try {
            Statement statement = conn.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ cli.getTarjeta()+"'";
            ResultSet rs = statement.executeQuery(sql);            
            while(rs.next()) {
                result = "Petros disponible:  " + rs.getString("saldo");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            escribirLog("Cerrando Base de Datos atm en Consulta de saldo");
        } catch (IOException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
        
    }

    @Override
    public boolean Deposito(Connection conn, Cliente cli, double monto) {
        boolean resultado = false;
        String sql;
        try {
            sql = "UPDATE usuario SET saldo = saldo +"+ monto+" WHERE tarjeta='"+ cli.getTarjeta()+"'";
            Statement statement = conn.prepareStatement(sql);
            statement.executeUpdate(sql);
            resultado = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            escribirLog("Cerrando Base de Datos atm en Depositos");
        } catch (IOException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }

    @Override
    public boolean Retiro(Connection conn, Cliente cli, double monto) {
        boolean result = false;
        String sql;
        
        try {
            Statement sta = conn.createStatement();
            sql = "UPDATE usuario SET saldo = saldo -"+ monto+" WHERE tarjeta='"+ cli.getTarjeta()+"'";
            Statement statement = conn.prepareStatement(sql);
            statement.executeUpdate(sql);
            result=true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            escribirLog("Cerrando Base de Datos atm en Retiros");
        }catch (IOException ex) {
            Logger.getLogger(Servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public String Movimientos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}