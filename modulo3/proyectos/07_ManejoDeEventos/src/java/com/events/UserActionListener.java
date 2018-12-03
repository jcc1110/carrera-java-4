package com.events;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class UserActionListener implements ActionListener {
    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        try {
            System.out.println(event.getComponent().getId());   
        } catch (AbortProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}
