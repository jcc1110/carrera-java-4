package com.sia_cafeteria.implement;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clase para manejo de archivos
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class Archivos {
    // CREAR UN ARCHIVO
    public static void Crear(String ruta) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            
            if (!archivo.exists()){
            
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

    // ESCRIBIR DENTRO DE UN ARCHIVO
    public static void Escribir(String ruta, String nombre, String texto) {
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
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // LEER LA INFORMACIÓN DE UN ARCHIVO
    public static void Leer(String ruta) {
        try {
            // INSTANCIA DE Archivo
            File archivo = new File(ruta);
            
            // UTILIZO LAS CLASES BufferedRead y FileReader
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            
            // LEER LA INFORMACIÓN DEL ARCHIVO
            String _leer;
            _leer = br.readLine();
            System.out.println("Listado de Café");
            while (_leer != null) {
                System.out.println(_leer);
                _leer = br.readLine();
            }
            
            // CIERRO LA CONEXIÓN
            br.close();
            
            // IMPRIMO UN MENSAJE
            System.out.println("Se ha listado correctamente.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

// AGREGAR INFORMACIÓN AL ARCHIVO
    public static void Agregar(String ruta) {
        Scanner sc = new Scanner(System.in);

        //Introducimos el texto a buscar
        System.out.print("Introduzca el cafe a agregar: ");
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
            System.out.println("Agregado correctamente el cafe " + texto);
            System.out.println("");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //BUSCAR INFORMACION EN UN ARCHIVO
    public static int Buscar(String _nombreArchivo, String _textoABuscar){
        Scanner _entrada = null;
        String _linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        int _salida=0;
        String _textoBuscado;
        Scanner sc = new Scanner(System.in);

        //Para seleccionar el archivo
        //JFileChooser j = new JFileChooser();
        //j.showOpenDialog(j);
        if (_textoABuscar.equals("")){
        //Introducimos el texto a buscar
        System.out.print("Introduce texto a buscar: ");
        _textoBuscado = sc.nextLine();
        }else{ _textoBuscado=_textoABuscar; }
        
        try {
            //guardamos el path del fichero en la variable ruta
            //String ruta = j.getSelectedFile().getAbsolutePath();
            //creamos un objeto File asociado al fichero seleccionado
            File f = new File(_nombreArchivo);
            //creamos un Scanner para leer el fichero
            _entrada = new Scanner(f);
            //mostramos el nombre del fichero
            //System.out.println("Archivo: " + f.getName());
            //mostramos el texto a buscar
            //System.out.println("Texto a buscar: " + texto);
            while (_entrada.hasNext()) { //mientras no se llegue al final del fichero
                _linea = _entrada.nextLine();  //se lee una línea
                if (_linea.contains(_textoBuscado)) {   //si la línea contiene el texto buscado se muestra por pantalla
                    System.out.println("El tipo de cafe " +_textoBuscado + " esta disponible. Se encuentra en la linea nro. " + numeroDeLinea);
                    _salida=numeroDeLinea;
                    contiene = true;
                }
                numeroDeLinea++; //se incrementa el contador de líneas
            }
            if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo
                System.out.println(_textoBuscado + " no se ha encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (_entrada != null) {
                _entrada.close();
                System.out.println("Presione una tecla para continuar");
                Scanner s = new Scanner(System.in);
                System.out.println(s.next());
            }
        }
        return _salida;
    }
    
    public static void Modificar(String _ruta, String _nombreArchivo){
        FileWriter fichero = null;
        PrintWriter escritor = null;
        Scanner sc = new Scanner(System.in);
        int _numLinea=0;
        try {
            //Introducimos el texto a buscar
            System.out.print("Introduce el cafe que desea modificar: ");
            String _textoBuscado = sc.nextLine();
            _numLinea=Buscar(_nombreArchivo,_textoBuscado);
            Path path = Paths.get(_ruta);
            List<String> lineas = Files.readAllLines(path);
            fichero = new FileWriter(_ruta);
            escritor = new PrintWriter(fichero);
            escritor.flush();
            System.out.print("Introduce el nuevo nombre del cafe a modificar: ");
            String _textoAModificar = sc.nextLine();
            lineas.set(_numLinea, _textoAModificar);
            lineas.remove(_numLinea);
            Files.write(path, lineas);
            /*split[posicion] = nuevaLinea;
            for(int x = 0; x < split.length; x++){
                escritor.write(split[x]);
                escritor.println();
             }*/
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de texto: ");
        } finally {
            if(fichero != null){
                try {
                    fichero.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar archivo de texto: ");
                }
            }
        }
    }
    
    //ELIMINAR INFORMACION DE UN ARCHIVO
    public static void Eliminar(String rutaAlFichero){
        Scanner _entrada = null;
        String _linea;
        int numeroDeLinea = 0;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);
        try {
            //Introducimos el texto a buscar
            System.out.print("Introduce el cafe que desea eliminar: ");
            String _textoBuscado = sc.nextLine();
            Path path = Paths.get(rutaAlFichero);
            List<String> lineas = Files.readAllLines(path);
            lineas = lineas.stream()
                            .filter(linea->!linea.contains(_textoBuscado))
                            .collect(Collectors.toList());
            Files.write(path, lineas);
        }catch (FileNotFoundException fe) {
        }catch (IOException io) {
        }
    }
    
    //VALIDAR NUMERO DE LINEAS DE UN ARCHIVO
    public static int ValidarNumLineas(String _nombreArchivo){
        int _numLine=0;
        try {
            String _string="";
            FileReader _fileReader = new FileReader(_nombreArchivo);
            BufferedReader _bufferReader = new BufferedReader(_fileReader);
            while ((_string=_bufferReader.readLine())!= null) {
                _numLine++;                
            }
        } catch (FileNotFoundException fe) {
            System.out.println("Nombre de fichero (archivo) al cual hace referencia no existe.");
        }catch (IOException io) {
            System.out.println("Existen problemas para el acceso al fichero (archivo).");
        }
        return _numLine;
    }
}