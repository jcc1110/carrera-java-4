package com.sia_cajero.beans;

/**
 *
 * @author Adolfo Paredes
 */
public class Movimiento {
    private int id_usuario;
    private char tipo_movimiento;
    private double monto;
    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the tipo_movimiento
     */
    public char getTipo_movimiento() {
        return tipo_movimiento;
    }

    /**
     * @param tipo_movimiento the tipo_movimiento to set
     */
    public void setTipo_movimiento(char tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
