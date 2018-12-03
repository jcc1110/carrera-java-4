package com.sia_cafeteria.main;

import static com.sia_cafeteria.implement.Archivos.ValidarNumLineas;
import static com.sia_cafeteria.implement.Archivos.Agregar;
import static com.sia_cafeteria.implement.Archivos.Crear;
import static com.sia_cafeteria.implement.Archivos.Escribir;
import static com.sia_cafeteria.implement.Archivos.Leer;
import static com.sia_cafeteria.implement.Archivos.Buscar;
import static com.sia_cafeteria.implement.Archivos.Modificar;
import static com.sia_cafeteria.implement.Archivos.Eliminar;
import static com.sia_cafeteria.implement.Menu.Header;
import static com.sia_cafeteria.implement.Menu.Body;
import static com.sia_cafeteria.implement.Menu.Footer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adolfo Paredes
 */
public class SIA_Cafeteria {
    // RUTA DEL ARCHIVO  
    public static final String RUTA = "bd_siacafeteria.txt";
    public static final String NOMBRE_ARCHIVO="bd_siacafeteria.txt";
    public static final String EMPTY_STRING="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numLine=0;
        String opcion="";
        int _salidaNumLinea=0;
        //INSTANCIA DE LA CLASE Scanner
        Scanner scan = new Scanner(System.in);
        
        // CREAMOS EL ARCHIVO
        Crear(RUTA);
        
        //VALIDAMOS NUMERO DE LINEAS DEL ARCHIVO
        numLine=ValidarNumLineas(NOMBRE_ARCHIVO);        
        //CARGAMOS EL ARCHIVO
        CargarDatos(RUTA,NOMBRE_ARCHIVO, numLine);

        //LEEMOS EL ARCHIVO
        Leer(NOMBRE_ARCHIVO);
        System.out.println("");
        
        do {
        System.out.println("");Header();Body();Footer();                
        //CAPTURO EL DATO INGRESADO POR EL USUARIO
        opcion = scan.next();
        if(opcion.length()>1){
            System.out.println("La opcion para seleccionar debe ser una sola letra");
        }
        if (!opcion.matches("[a-zA-Z]+")){
            System.out.println("El nombre solo debe contener letras");
        }            
        // Validar opcion seleccionada
        switch (opcion) {
            case "A":
                //LISTAR
                Leer(NOMBRE_ARCHIVO);System.out.println("");break;
            case "B":
                //BUSCAR
                _salidaNumLinea=Buscar(NOMBRE_ARCHIVO,EMPTY_STRING);Header();Body();Footer();break;
            case "C":
                //AGREGAR
                Agregar(RUTA);break;
            case "D":
                Modificar(RUTA, NOMBRE_ARCHIVO);break;
            case "E":
                //Eliminar(RUTA, NOMBRE_ARCHIVO);
                Eliminar(RUTA);break;
       }
        } while (!opcion.equals("F"));
        //anexar(ruta, "Anexando información al archivo");
        //System.out.println("");
    }
    
    public static void CargarDatos(String _ruta, String _nombre, int _numLineas){
        //INSTANCIA DE LA CLASE ArrayList
        List<String> arreglo = new ArrayList<>();
        List<String> arreglo2 = new ArrayList<>();
        //AGREGO ELEMENTOS A MI ArrayList
        arreglo.add("Capuchino");
        arreglo.add("Late");
        arreglo.add("Guayoyo");
        arreglo.add("Negro");
        arreglo.add("Tetero");
        arreglo.add("Marron");
        arreglo.add("Guarapo");
        arreglo.add("Clarito");
        arreglo.add("Oscuro");
        arreglo.add("Con Leche");
        
        if (_numLineas<10){
            arreglo2=arreglo.subList(_numLineas,arreglo.size());
            arreglo2.forEach((item) -> {
            Escribir(_ruta, _nombre, item);
            });
        }
    }
}
