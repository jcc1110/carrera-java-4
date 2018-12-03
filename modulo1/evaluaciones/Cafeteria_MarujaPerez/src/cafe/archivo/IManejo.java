/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.archivo;


/**
 *
 * @author maruja
 */
public interface IManejo {
    
    static void crear(String ruta){}
    static void leer (String ruta){}
    static void anexar(String ruta) {}
    static void cargarDatos(String ruta, String sNombreArchivo, int iNroLineas){}
    static void escribir(String ruta, String nombre, String texto) {}
    static void buscarEnArchivo (String sRuta){}
    public static void eliminar(String ruta){}
    
    
}
