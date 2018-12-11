package com.sia_cajero.service;
import static com.sia_cajero.beans.Log.guardarLog;
import com.sia_cajero.beans.Movimiento;
import com.sia_cajero.beans.Usuario;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public class DBConection {
    Connection con;
    
    public void connectToDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "root");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
        
    public boolean validar(Usuario usuario) throws IOException {
        boolean result = false;
        String sql;
        
        try {
            guardarLog("Validando usuario");
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT * FROM usuario WHERE tarjeta='"+ usuario.getTarjeta() +"' AND clave='"+ usuario.getClave() +"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                result = (rs.getString("tarjeta").equals(usuario.getTarjeta()) && rs.getString("clave").equals(usuario.getClave()));
            }
        } catch (SQLException ex) {
            guardarLog(ex.getMessage());
        }        
        return result;
    }
        public String consultarSaldo(Usuario usuario) throws IOException {
        String result = null;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT saldo FROM usuario WHERE tarjeta='"+ usuario.getTarjeta()+"'";
            System.out.println("Este es el sql de Consulta Saldo: "+sql);
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                result = rs.getString("saldo");
            }
        } catch (SQLException ex) {
            guardarLog(ex.getMessage());
        }        
        return result;
        
    }
    public String consultarIdUsuario(Usuario usuario) throws IOException {
        String result = null;
        String sql;
        
        try {
            this.connectToDB();
            Statement sta = this.con.createStatement();
            sql = "SELECT id FROM usuario WHERE tarjeta='"+ usuario.getTarjeta()+"'";
            ResultSet rs = sta.executeQuery(sql);            
            while(rs.next()) {
                result = rs.getString("id");
            }
        } catch (SQLException ex) {
            guardarLog(ex.getMessage());
        }        
        return result;        
    }
    
    public boolean depositar(Usuario usuario, double montoDeposito) throws IOException {
        boolean result = false;
        String sql="";
        try {
            this.connectToDB();
            int idUsuario=Integer.valueOf(consultarIdUsuario(usuario));
            double saldoEnCuenta=(Double.valueOf(consultarSaldo(usuario)))+montoDeposito;
            sql = "UPDATE usuario SET saldo = "+ saldoEnCuenta+" WHERE id='"+ idUsuario +"' AND tarjeta='"+ usuario.getTarjeta()+"'";
            Statement pstmt = this.con.prepareStatement(sql);
            pstmt.executeUpdate(sql);
            result=true;
            if (result){
                Movimiento _movimiento=new Movimiento();
                _movimiento.setId_usuario(idUsuario);
                _movimiento.setTipo_movimiento('D');
                _movimiento.setMonto(montoDeposito);
                boolean result2=insertarMovimiento(_movimiento);
            }
        } catch (SQLException ex) {
            guardarLog(ex.getMessage());
        }
        return result;        
    }
    
    public boolean retirar(Usuario usuario, double montoRetiro) throws IOException {
        boolean result = false;
        String sql="";
        try {
            this.connectToDB();
            int idUsuario=Integer.valueOf(consultarIdUsuario(usuario));
            double saldoEnCuenta=(Double.valueOf(consultarSaldo(usuario)))-montoRetiro;
            sql = "UPDATE usuario SET saldo = "+ saldoEnCuenta+" WHERE id='"+ idUsuario +"' AND tarjeta='"+ usuario.getTarjeta()+"'";
            Statement pstmt = this.con.prepareStatement(sql);
            pstmt.executeUpdate(sql);
            result=true;
            if (result){
                Movimiento _movimiento=new Movimiento();
                _movimiento.setId_usuario(idUsuario);
                _movimiento.setTipo_movimiento('R');
                _movimiento.setMonto(montoRetiro);
                boolean result2=insertarMovimiento(_movimiento);
            }
        } catch (SQLException ex) {
            guardarLog(ex.getMessage());
        }
        return result;        
    }
        
    public boolean insertarMovimiento(Movimiento movimiento) throws IOException {
        boolean result = false;
        String sql;        
        try {
            this.connectToDB();
            String nl = System.getProperty("line.separator");
            Statement sta = this.con.createStatement();
            sql = "INSERT INTO movimiento(id_usuario, tipo_movimiento, monto) VALUES ("+ movimiento.getId_usuario()+ ",'"+ movimiento.getTipo_movimiento()+ "', " + movimiento.getMonto()+ ")";
            Statement pstmt = this.con.prepareStatement(sql);
            pstmt.execute(sql);
            result=true;
        } catch (SQLException ex) {
            guardarLog(ex.getMessage());
        }
        return result;        
    }
}

