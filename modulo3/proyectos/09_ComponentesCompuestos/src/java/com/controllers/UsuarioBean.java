package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "ub")
@ApplicationScoped
public class UsuarioBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;

    // Métodos
    public String login() {
        return "resultado";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
