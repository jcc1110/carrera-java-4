package com.operation;
import java.time.LocalDate;
import com.structures.I_UserAndDate;
import java.time.format.DateTimeFormatter;

public class UserAndDateControl implements I_UserAndDate {
    // Atributos
    private String UserName;
    
    @Override
    public String getMessageForUser() {
        // Variables necesarias
        String message;
        LocalDate currentDate;
        
        // Obteniendo la fecha actual
        currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");  
        
        // Formateando el mensaje
        message = "Hola, " + this.getUserName() + ". ";
        message += "Hoy es: " + formatter.format(currentDate);
        
        // Devolviendo el mensaje formateado
        return message;        
    }

    // Métodos get y set
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
}
