/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia_cajero.beans;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author nm16925
 */
///Utilitario: clase para guardar en el Log de la app
public class Log {
    public static final String rutaArchivo ="./LogCajero.txt";
    
    public static void guardarLog( String mensaje) throws IOException {       

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {

            fh = new FileHandler(rutaArchivo);
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info(mensaje);

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }
}
