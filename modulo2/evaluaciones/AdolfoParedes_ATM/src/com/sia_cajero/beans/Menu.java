package com.sia_cajero.beans;

import com.sia_cajero.beans.interfaces.IMenu;
import javax.swing.JMenu;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public class Menu extends JMenu implements IMenu{   
    public Menu(String _titulo){
        super(_titulo);
    }
}





