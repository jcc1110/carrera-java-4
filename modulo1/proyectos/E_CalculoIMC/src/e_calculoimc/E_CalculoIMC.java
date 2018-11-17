package e_calculoimc;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class E_CalculoIMC {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES
        double peso;
        double altura;
        double imc;
        String estado = "";
        
        // INSTANCIA DE LA CLASE Scanner
        Scanner scan = new Scanner(System.in);
        
        // SOLICITO EL PESO
        System.out.print("Indique su peso: ");
        peso = scan.nextDouble();
        
        // SOLICITO LA ALTURA
        System.out.print("Indique su altura: ");
        altura = scan.nextDouble();
        
        // REALIZO EL CÁLCULO IMC
        imc = peso / Math.pow(altura, 2);
        
        // VALIDO LA CONDICIÓN ACTUAL DEL USUARIO
        if (imc < 18.5) {
            estado = "Bajo peso";
        } else if (imc >= 18.5 & imc <= 24.9) {
            estado = "Peso normal";
        } else if (imc >= 25.0 & imc <= 29.9) {
            estado = "Sobrepeso";
        } else if (imc >= 30.0 & imc <= 34.9) {
            estado = "Obesidad grado I";
        } else if (imc >= 35.0 & imc <= 39.9) {
            estado = "Obesidad grado II";
        } else if (imc >= 40.0) {
            estado = "Obesidad grado III";
        }
        
        // INSTANCIA DE LA CLASE PARA FORMATEAR
        NumberFormat f = new DecimalFormat("#0.0");
        
        // IMPRIMO EL RESULTADO
        System.out.println("Tu valor IMC es: " + f.format(imc) + " y tu estado es " + estado);
    }
}
