package com.controllers;
import com.database.DataAccessUser;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Named(value = "lb")
@ApplicationScoped
public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;

    public String login() {
        String resultado;
        DataAccessUser dau = new DataAccessUser();
        
        if (dau.userValidate(this.getUsername(), this.getPassword())) {
            resultado = "dashboard";
            HttpSession currentSession = this.getCurrentSession();
            currentSession.setAttribute("usuario", this.getUsername());
        } else {
            resultado = "error";
            FacesMessage fm = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, 
                    "Usuario o clave incorrectos", 
                    "ERROR");
            FacesContext.getCurrentInstance().addMessage(null, fm);
        }
        
        return resultado;
    }
    
    public String logout() {
        HttpSession currentSession = this.getCurrentSession();
        currentSession.removeAttribute("usuario");
        currentSession.invalidate();        
        return "login";
    }
    
    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getSession(false);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
