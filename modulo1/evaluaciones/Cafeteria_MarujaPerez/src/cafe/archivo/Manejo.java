/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.archivo;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clase para el manejo de archivos
 * @author Maruja
 * @version 1.0.0
 */
public class Manejo implements IManejo{
    // CREAR UN ARCHIVO
    public static void crear(String ruta) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            if(!archivo.exists()){
            // UTILIZO LAS CLASES PrintWriter Y FileWriter
            PrintWriter pw = new PrintWriter(new FileWriter(archivo));            
            // CIERRO LA CONEXIÓN
            pw.close();
          }   
        } catch (IOException ex) {
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
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            // LEO LA INFORMACIÓN DEL ARCHIVO
            String lectura;
            lectura = br.readLine();
            System.out.println("**********************");
            System.out.println("Listado de café : ");
            System.out.println("**********************");
            while (lectura != null) {
                System.out.println(lectura);
                lectura = br.readLine();
            }
            System.out.println("**********************");
            System.out.println("**********************");
            System.out.println("");
            System.out.println("");
            // CIERRO LA CONEXIÓN
            br.close();
            
            // IMPRIMO UN MENSAJE
            //System.out.println("Listado de café exitoso.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // AGREGAR INFORMACIÓN AL ARCHIVO
    public static void anexar(String ruta) {
        Scanner sc = new Scanner(System.in);

        //Introducimos el texto a buscar
        System.out.print("Agregue el tipo de café: ");
        String texto = sc.nextLine();

        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            // UTILIZO LAS CLASES PrintWriter y FileWriter
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            System.out.println("");
            // AÑADO LA INFORMACIÓN NECESARIA
            pw.println(texto);
            // CIERRO LA CONEXIÓN
            pw.close();
            // IMPRIMO UN MENSAJE
            System.out.println("Se ha agregado el café " + texto + " correctamente");
            System.out.println("");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
        public static void cargarDatos(String ruta, String sNombreArchivo, int iNroLineas){
         //INSTANCIA DE LA CLASE ArrayList
        List<String> arreglo1 = new ArrayList<>();
        @SuppressWarnings("UnusedAssignment")
        List<String> arreglo2 = new ArrayList<>();
        
        
        //AGREGO ELEMENTOS A MI ArrayList
        arreglo1.add("Negrito");
        arreglo1.add("Marrón");
        arreglo1.add("Guayoyo");
        arreglo1.add("Latte");
        arreglo1.add("Carajillo");
        arreglo1.add("Corto");
        arreglo1.add("Tetero");
        arreglo1.add("Con Leche");
        arreglo1.add("Tinto");
        arreglo1.add("Descafeinado");
        
        if (iNroLineas< 10){
            arreglo2=arreglo1.subList(iNroLineas, arreglo1.size());
            arreglo2.forEach((tipo) -> {
            escribir(ruta,sNombreArchivo, tipo);
        });
        }
        

}

    public static void escribir(String ruta, String nombre, String texto) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            if (archivo.exists()){
            File archiv = new File(nombre);
            FileWriter archivoCreado = new FileWriter(archiv,true);
            // UTILIZO LAS CLASES BufferedWriter
            BufferedWriter bw = new BufferedWriter(archivoCreado);
            // ESCRIBO POR PRIMERA VEZ EN EL ARCHIVO
            bw.write(texto);
            bw.write("\r\n");
            bw.close();
            }else{
                System.out.println("La BD de la cafeteria no esta disponible");
            }
            // IMPRIMO UN MENSAJE
            System.out.println("Se ha escrito correctamente al archivo.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static int  validarCargaArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
      int iNumeroLineas = 0;
    try{   
        FileReader fileReader = new FileReader(nombreArchivo);       
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String sCadena;
 
        while ((sCadena = bufferedReader.readLine())!=null) {
            iNumeroLineas++;
        }
    } catch (FileNotFoundException fnfe){
            //fnfe.printStackTrace();
            System.out.println("Error: Archivo " + nombreArchivo + "no existe");
    } catch (IOException ioe){
            System.out.println("Error: No se puede leer el archivo " + nombreArchivo );
   }
    return iNumeroLineas;
  }
    
    
    public  static void buscar (String sRuta) {
        Scanner entrada = null;
        String linea,lineaUpper;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);

        //Introducimos el texto a buscar
        System.out.print("Introduce tipo de café a buscar: ");
        String texto = sc.nextLine();
        try {
            File f = new File(sRuta);
            //creamos un Scanner para leer el fichero
            entrada = new Scanner(f);
            //mostramos el texto a buscar
            System.out.println("Café a buscar: " + texto);
            while (entrada.hasNext()) { //mientras no se llegue al final del fichero
                linea = entrada.nextLine();
                lineaUpper = linea.toUpperCase();
                
                //se lee una línea
                if (lineaUpper.contains(texto.toUpperCase())) {   //si la línea contiene el texto buscado se muestra por pantalla
                    //System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    System.out.println("El café " + texto + " existe en la lïnea nro: " + numeroDeLinea);
                    contiene = true;
                }
                numeroDeLinea++; //se incrementa el contador de líneas
            }
            if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo
                System.out.println("El café de tipo " + texto + " no se ha encontrado.");
                System.out.println("");
            }
            //System.out.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
    
   
        public static void eliminar(String ruta){
        Scanner _entrada = null;
        String _linea;
        int numeroDeLinea = 0;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);
        try {
            //Introducimos el texto a buscar
            System.out.print("Introduzca el café que desea eliminar: ");
            String _textoBuscado = sc.nextLine();
            Path path = Paths.get(ruta);
            List<String> lineas = Files.readAllLines(path);
            lineas = lineas.stream()
                            .filter(linea->!linea.toUpperCase().contains(_textoBuscado.toUpperCase()))
                            .collect(Collectors.toList());
            Files.write(path, lineas);
            System.out.println("");
            System.out.println("El café de tipo " + _textoBuscado + " ha sido eliminado.");
            System.out.println("");                
            /*if(contains(_textoBuscado.toUpperCase())){
                System.out.println("El café de tipo " + _textoBuscado + " no se ha encontrado.");
            }*/
                
        }catch (FileNotFoundException fe) {
        }catch (IOException io) {
        }
    }
        
    public static void modificar(String sRuta) throws IOException, FileNotFoundException{
       Scanner sc = new Scanner(System.in); 
    try{
        System.out.print("Introduzca el café que desea modificar: ");
        String _textoBuscado = sc.nextLine();
        buscar(sRuta);
        Path miPath = FileSystems.getDefault().getPath(sRuta);
        ArrayList<String> fileContent = new ArrayList<>(Files.readAllLines(miPath, StandardCharsets.UTF_8));
        ArrayList<String[]> miArray = new ArrayList<>();
            for (int i = 0; i < fileContent.size(); i++) {
                //aquí añades a cada elemento de miArray el resultado de separar por "," la línea
                //miArray.add(fileContent.get(i).split(","));
                miArray.add(fileContent.get(i).split(""));
            }
            } catch (FileNotFoundException e) {
                   System.out.println(e.toString());
               } catch (IOException e) {
                   System.out.println(e.toString());
               } finally {
                   /*if (entrada != null) {
                       entrada.close();
                   }*/
               }
    }
    
}//Fin

