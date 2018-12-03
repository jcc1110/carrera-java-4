package com.controllers;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

@Named(value = "sb")
@ApplicationScoped
public class SaludoBean {
    private String name;
    private int year;
    
    public SaludoBean() {
        this.setName("Anthony Hurtado");
        this.setYear(1991);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
