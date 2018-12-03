package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ActionEvent;

@Named(value = "ab")
@ApplicationScoped
public class AccionBotonBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String nombre;
    
    // Métodos
    public void updateNombreBinding(ActionEvent e) {
        this.setNombre("Anthony Hurtado");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
