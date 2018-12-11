/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia_cajero.controller;

import com.sia_cajero.beans.Menu;
import com.sia_cajero.beans.MenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Adolfo Paredes: Carrera Java 8 Programmer
 */
public class MnuPrincipal extends Menu{
JMenuItem i1;
JMenuItem i2;
JMenuItem i3;
JMenuItem i4;
    public MnuPrincipal(String _titulo) {
        super(_titulo);
    }
    
    public Menu menuItem(String _titulo){
          Menu menu = new Menu(_titulo);
          i1=new JMenuItem("Login");  
          i2=new JMenuItem("Consulta de Saldo");
          i3=new JMenuItem("Deposito");
          i4=new JMenuItem("Retiro"); 
          menu.add(i1); menu.add(i2); menu.add(i3);menu.add(i4);
        return menu;
    }
    
    public MenuBar menuBarra(Menu _menu){
    MenuBar mb=new MenuBar();  
    mb.add(_menu);  
    return mb;
    }
}
