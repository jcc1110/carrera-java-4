package estructurasdecontrol;
import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES
        int dia;
        String diaSeleccionado;
        
        // INSTANCIA DE LA CLASE Scanner
        Scanner scan = new Scanner(System.in);
        
        // SOLICITO EL DATO AL USUARIO
        System.out.print("Introduzca un número de un día de la semana: ");
        
        // CAPTURO EL VALOR INGRESADO
        dia = scan.nextInt();
        
        // ESTABLEZCO LA ESTRUCTURA DE CONTROL Y EVALUO LA VARIABLE "dia"
        switch (dia) {
            case 1: diaSeleccionado = "Lunes"; break;
            case 2: diaSeleccionado = "Martes"; break;
            case 3: diaSeleccionado = "Miércoles"; break;
            case 4: diaSeleccionado = "Jueves"; break;
            case 5: diaSeleccionado = "Viernes"; break;
            case 6: diaSeleccionado = "Sábado"; break;
            case 7: diaSeleccionado = "Domingo"; break;
            default: diaSeleccionado = "No es un día válido"; break;
        }
        
        // MOSTRANDO EL RESULTADO
        System.out.println(diaSeleccionado);
    }
}
