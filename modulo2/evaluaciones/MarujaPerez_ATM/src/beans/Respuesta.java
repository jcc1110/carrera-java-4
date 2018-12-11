/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author nm16925
 */
public class Respuesta {
    private boolean datos;

    public Respuesta(boolean x){
        this.datos=x;
    }
    /**
     * @return the datos
     */
    public boolean isDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(boolean datos) {
        this.datos = datos;
    }
    
}
