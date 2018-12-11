/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import java.sql.Connection;
import java.util.ResourceBundle;

/**
 *
 * @author maruja
 */
//Interface de los metodos a implemtar
public interface IServicios {
    boolean Login (Connection conn, Cliente cli);
    String  Saldo (Connection conn, Cliente cli);
    boolean Deposito (Connection conn, Cliente cli, double monto);
    boolean Retiro (Connection conn, Cliente cli, double monto);
    String Movimientos ();

    
    
}
