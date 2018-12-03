package com.structures;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.structures.UrlValidator")
public class UrlValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, 
            Object value) throws ValidatorException {       
        try {
            // Variables necesarias
            String urlValue = value.toString();
            
            // Valido que la cadena tenga http:// al inicio
            if (!urlValue.startsWith("http://", 0)) {              
                // Muestro un mensaje de error personalizado
                FacesMessage msg = new FacesMessage("El formato de la URL es inválido");
                msg.setSeverity(FacesMessage.SEVERITY_ERROR);
                
                // Genero una Exception
                throw new ValidatorException(msg);
            }            
        } catch (ValidatorException e) {            
            // Muestro un mensaje de error personalizado
            FacesMessage msg = new FacesMessage(e.getMessage());
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            // Genero una Exception
            throw new ValidatorException(msg);
        }
    }
}
