package com.sia_cajero.controller;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */

import com.sia_cajero.beans.Usuario;
import com.sia_cajero.beans.interfaces.IDBService;
import com.sia_cajero.service.DBConection;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBService implements IDBService {
    
    @Override
    public boolean validarUsuario(Usuario usuario) {
        DBConection bd = new DBConection();
        try {        
            return bd.validar(usuario);
        } catch (IOException ex) {
            Logger.getLogger(DBService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public String obtenerSaldo(Usuario usuario) {
        DBConection bd = new DBConection();
        try {
            return bd.consultarSaldo(usuario);
        } catch (IOException ex) {
            Logger.getLogger(DBService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean retiro(Usuario usuario, double monto) {
        DBConection bd = new DBConection();
        try {
            return bd.retirar(usuario, monto);
        } catch (IOException ex) {
            Logger.getLogger(DBService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean deposito(Usuario usuario, double monto) {
        DBConection bd = new DBConection();
        try {
            return bd.depositar(usuario, monto);
        } catch (IOException ex) {
            Logger.getLogger(DBService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}