package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "persona")
@ApplicationScoped
public class PersonaBean implements Serializable {
    // Variable para identificar vistas
    private static final long serialVersionUID = 1L;
    
    // Atributos
    private String nombre;
    private int edad;
    private double salario;
    private String correo;
    private String web;

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
