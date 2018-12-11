package com.sia_cajero.beans.interfaces;

import com.sia_cajero.beans.Usuario;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public interface IDBService {
    boolean validarUsuario(Usuario usuario);
    String obtenerSaldo(Usuario usuario);
    boolean retiro(Usuario usuario, double monto);
    boolean deposito(Usuario usuario, double monto);
}
