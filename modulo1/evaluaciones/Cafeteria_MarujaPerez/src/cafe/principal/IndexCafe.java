/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe.principal;


import java.io.IOException;
import java.util.Scanner;
import static cafe.archivo.Manejo.anexar;
import static cafe.archivo.Manejo.buscar;
import static cafe.archivo.Manejo.cargarDatos;
import static cafe.archivo.Manejo.crear;
import static cafe.archivo.Manejo.eliminar;
import static cafe.archivo.Manejo.leer;
import static cafe.archivo.Manejo.modificar;
import static cafe.archivo.Manejo.validarCargaArchivo;

/**
 *
 * @author maruja
 */
public class IndexCafe {
public static final String NOMBREARCHIVO ="cafe.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*=================================================================== */
         // RUTA DEL ARCHIVO
        try{
        String ruta = "cafe.txt";
        int iNroLinea, opcion;
        
        // OPERACIONES CON EL ARCHIVO
        crear(ruta);
        iNroLinea = validarCargaArchivo(NOMBREARCHIVO);
        //System.out.println(iNroLinea);
        cargarDatos(ruta,NOMBREARCHIVO,iNroLinea);
        System.out.println("");
        
        leer(ruta);

        // Menu
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("Por favor, Introduzca la opción a utilizar");

        do {
            // Imprimo las opciones
            System.out.println("1 - Listar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Agregar");
            System.out.println("4 - Modificar");
            System.out.println("5 - Eliminar");
            System.out.println("6 - Salir");
            System.out.print("Opción: ");
            opcion = scan.nextInt();
            
            // Validar opcion seleccionada
            switch (opcion) {
                case 1:
                    leer(ruta);break;
                case 2:
                    buscar(ruta);break;
                case 3:
                    anexar(ruta);break;
                case 4:
                   modificar(ruta);break;
                case 5:
                    eliminar(ruta);break;    
                
           }
        } while(opcion != 6);
        System.out.println("¡Hasta Luego!");
        
        //anexar(ruta, "Anexando información al archivo");
        //System.out.println("");
        }catch (Exception ex) {
            System.out.println("La opción utilizada no es valida. Error en el sistema.");

        }
    }
    

}
