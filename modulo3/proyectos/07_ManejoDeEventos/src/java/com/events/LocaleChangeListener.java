package com.events;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class LocaleChangeListener implements ValueChangeListener {
    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {        
        try {
            System.out.println(event.getNewValue().toString());
            event.getNewValue().toString();   
        } catch (AbortProcessingException e) {
            System.out.println(e.getMessage());
        }
    }    
}
