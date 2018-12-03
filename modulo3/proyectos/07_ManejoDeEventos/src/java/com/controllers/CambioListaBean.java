package com.controllers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ValueChangeEvent;

@Named(value = "cl")
@ApplicationScoped
public class CambioListaBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String paisSeleccionado = "Venezuela";
    private List<String> paises;
    
    // Métodos
    public CambioListaBean() {
        this.paises = new ArrayList<>();
        this.paises.add("Venezuela");
        this.paises.add("Chile");
        this.paises.add("Argentina");
        this.paises.add("Colombia");
    }
    
    public void cambioDePais(ValueChangeEvent e) {
        this.setPaisSeleccionado(e.getNewValue().toString());
    }
    
    public String getPaisSeleccionado() {
        return paisSeleccionado;
    }

    public void setPaisSeleccionado(String paisSeleccionado) {
        this.paisSeleccionado = paisSeleccionado;
    }

    public List<String> getPaises() {
        return paises;
    }

    public void setPaises(List<String> paises) {
        this.paises = paises;
    }
}
