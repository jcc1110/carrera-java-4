package com.structures;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.structures.UrlConverter")
public class UrlConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        // Variables
        StringBuilder url = new StringBuilder();
        
        // Verifico la cadena al iniciar
        if (!value.startsWith("http://", 0) || !value.startsWith("https://", 0)) {
            // Añado a la cadena actual
            url.append("https://");
        }
        
        // Añado el valor enviado por el usuario
        url.append(value);
        
        // Verifico la cadena al finalizar
        if (!value.endsWith(".com")) {
            url.append(".com");
        }
        
        // Devuelvo el valor
        return url.toString();
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
}
