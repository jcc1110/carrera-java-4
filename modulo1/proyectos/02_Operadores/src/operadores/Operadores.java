package operadores;

public class Operadores {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES NECESARIAS
        int a = 6;
        int b = 2;
        int c = a - b; // 10
        System.out.println("Resultado inicial: " + c);
        
        /**
         * UTILIZANDO EL OPERADOR *= NOS SIRVE PARA
         * MULTIPLICAR DE LA SIGUIENTE FORMA
         * (VALOR_ACTUAL * VALOR_ACTUK)
         * */
        c *= c;
        
        // PRESENTACIÓN DE LOS VALORES
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        System.out.println("Resultado multiplicado: " + c);
        System.out.println("Cálculo del IVA (12%): " + (a + b + c) * 12 / 100);       
    }
}