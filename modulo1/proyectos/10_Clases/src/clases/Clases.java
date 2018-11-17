package clases;
import java.util.Scanner;

public class Clases {
    public static void main(String[] args) { 
        // DECLARACIÓN DE LAS VARIABLES
        String mayus;
        boolean esMayus;
        
        // INSTANCIA DE LA CLASE Persona
        Persona p1 = new Persona();
        Persona p2 = new Persona("Pepito", "Pregunton", 1982);
        Scanner scan = new Scanner(System.in);
        
        // PRESENTO LOS DATOS
        System.out.println(p2.nombre);
        System.out.println(p2.apellido);
        System.out.println(p2.cumpleanos);
        System.out.println(p2.obtenerNombreCompleto());
        System.out.println(p2.obtenerEdad());
        System.out.println("");
                
        // PREGUNTO LOS VALORES NECESARIOS
        System.out.print("Indique su nombre: ");
        p1.nombre = scan.next();        
        System.out.print("Indique su apellido: ");
        p1.apellido = scan.next();        
        System.out.print("Indique el año de su cumpleaños: ");
        p1.cumpleanos = scan.nextInt();
        System.out.print("¿Quiere su nombre en mayúscula? (S/N): ");
        mayus = scan.next();
        
        // VALIDO LA OPCIÓN
        esMayus = ("S".equals(mayus));
        
        // MUESTRO LOS VALORES
        System.out.println("");
        System.out.println("Tu nombre completo es: " + p1.obtenerNombreCompleto(esMayus));
        System.out.println("Tu edad es: " + p1.obtenerEdad());
    }
}
