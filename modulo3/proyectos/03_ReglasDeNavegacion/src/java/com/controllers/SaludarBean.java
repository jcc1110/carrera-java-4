package com.controllers;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "sb")
@ApplicationScoped
public class SaludarBean {
    // Atributos
    private String nombre;
    
    // Método para obtener el resultado
    public String obtener() {
        String pagina;
        if (this.getNombre().isEmpty()) {
            pagina = "error";
        } else {
            pagina = "page3";
        }        
        return pagina;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
