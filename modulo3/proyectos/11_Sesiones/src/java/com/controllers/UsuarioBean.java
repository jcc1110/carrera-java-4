package com.controllers;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "ub")
@ApplicationScoped
public class UsuarioBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String clave;

    // Métodos
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    // Iniciar sesión
    public String login() {
        String resultado;
        
        if ("anthony".equals(this.getUsuario().toLowerCase()) && 
                "123456".equals(this.getClave().toLowerCase())) {
            resultado = "exito";
            
            // Obtener la sesión actual
            HttpSession session = this.getCurrentSession();
            
            // Creando atributos para mi sesión
            session.setAttribute("usuario", this.getUsuario());
            session.setAttribute("rol", "Administrador");
        } else {
            resultado = "error";
            FacesMessage fm = new FacesMessage(
                FacesMessage.SEVERITY_ERROR, "Usuario o clave incorrectos", "ERROR");
            FacesContext.getCurrentInstance().addMessage(null, fm);            
        }  
        
        return resultado;
    }
    
    // Cerrar sesión
    public String logout() {
        // Obtener la sesión actual
        HttpSession session = this.getCurrentSession();
        
        // Remuevo los atributos establecidos
        session.removeAttribute("usuario");
        session.removeAttribute("rol");
        
        // Invalido la sesión
        session.invalidate();
        
        return "login";
    }
    
    // Obtener la sesión actual
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
}
