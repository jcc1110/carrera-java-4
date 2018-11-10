package leerdatos;

public class LeerDatos {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES NECESARIAS
        int edad;
        int anio;
        String nombre;
        
        // INSTANCIA DE LA CLASE Scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        // SOLICITO POR PANTALLA EL NOMBRE DEL USUARIO
        System.out.print("Dame tu nombre: ");
        
        // CAPTURO EL DATO INGRESADO POR EL USUARIO
        nombre = scan.next();
        /*if (!nombre.matches("[a-zA-Z]+")) {
            System.out.println("El nombre solo debe contener letras");
        }*/
        
        // SOLICITO POR PANTALLA LA EDAD DEL USUARIO
        System.out.print("Dame tu edad: ");
        
        // CAPTURO EL DATO INGRESADO POR EL USUARIO
        edad = scan.nextInt();
        
        // REALIZO LA OPERACIÓN PARA CONOCER LA EDAD DEL USUARIO
        anio = 2018 - edad;
        
        // PRESENTO EL RESULTADO
        System.out.println("Hola, " + nombre + " naciste en el año " + anio);
    }
}