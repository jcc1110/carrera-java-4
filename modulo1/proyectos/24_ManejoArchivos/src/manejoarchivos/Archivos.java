package manejoarchivos;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase para manejo de archivos
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class Archivos {
    // CREAR UN ARCHIVO
    public static void crear(String ruta) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            
            // UTILIZO LAS CLASES PrintWriter Y FileWriter
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            
            // CIERRO LA CONEXIÓN
            salida.close();
            
            // IMPRIMO UN MENSAJE
            System.out.println("El archivo se ha creado correctamente.");
        } catch (IOException ex) {
            // CAPTURANDO LA EXCEPCIÓN
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // ESCRIBIR DENTRO DE UN ARCHIVO
    public static void escribir(String ruta, String texto) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            
            // UTILIZO LAS CLASES PrintWriter y FileWriter
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            
            // ESCRIBO POR PRIMERA VEZ EN EL ARCHIVO
            salida.println(texto);
            salida.println("Fin de escritura");
            
            // CIERRO LA CONEXIÓN
            salida.close();
            
            // IMPRIMO UN MENSAJE
            System.out.println("Se ha escrito correctamente al archivo.");
        } catch (IOException ex) {
            // CAPTURANDO LA EXCEPCIÓN
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // LEER LA INFORMACIÓN DE UN ARCHIVO
    public static void leer(String ruta) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            
            // UTILIZO LAS CLASES BufferedRead y FileReader
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            
            // LEO LA INFORMACIÓN DEL ARCHIVO
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            
            // CIERRO LA CONEXIÓN
            entrada.close();
            
            // IMPRIMO UN MENSAJE
            System.out.println("Se ha leido el archivo correctamente.");
        } catch (IOException ex) {
            // CAPTURANDO LA EXCEPCIÓN
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // AGREGAR INFORMACIÓN AL ARCHIVO
    public static void anexar(String ruta, String texto) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            
            // UTILIZO LAS CLASES PrintWriter y FileWriter
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            
            // AÑADO LA INFORMACIÓN NECESARIA
            salida.println(texto);
            salida.println("Fin de anexar");
            
            // CIERRO LA CONEXIÓN
            salida.close();
            
            // IMPRIMO UN MENSAJE
            System.out.println("Se ha anexado información correctamente");
        } catch (IOException ex) {
            // CAPTURANDO LA EXCEPCIÓN
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
