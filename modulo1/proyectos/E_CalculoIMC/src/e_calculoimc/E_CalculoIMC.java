package e_calculoimc;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class E_CalculoIMC {
    public static void main(String[] args) {
        // Declaro mis variables
        double peso;
        double altura;
        double imc;
        String estado = "";
        
        // Instancia la clase Scanner
        Scanner scan = new Scanner(System.in);
        
        // Solicito los datos al usuario
        System.out.print("Indique su peso: ");
        peso = scan.nextDouble();
        
        // Solicito los datos al usuario
        System.out.print("Indique su altura: ");
        altura = scan.nextDouble();
        
        // Realizo el calculo del IMC
        imc = peso / (altura * altura);        
        NumberFormat f = new DecimalFormat("#0.0");
        
        // Valido la condición actual del usuario
        if (imc < 18.5) {
            estado = "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            estado = "Peso normal";
        } else if (imc >= 25.5 && imc <= 29.9) {
            estado = "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.5) {
            estado = "Obesidad grado I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            estado = "Obesidad grado II";
        } else if (imc >= 40.0) {
            estado = "Obesidad grado III";
        }
        
        // Imprimo resultado
        System.out.println("Tu valor IMC es: " + f.format(imc) + " y tu estado es " + estado);
    }
}
