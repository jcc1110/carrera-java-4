package com.controllers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "sb")
@ApplicationScoped
public class SaludoBean {
    private String nombre;
    private String fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        this.fecha = dtf.format(LocalDate.now());
        return this.fecha;
    }
    
    public String saludar() {
        return "Tu nombre es: " + this.getNombre();
    }
}
