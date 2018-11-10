package estructurasiterativas;

public class EstructurasIterativas {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES
        int a = 1;
        
        // ESTRUCTURA ITERATIVA "While"
        while (a < 5) {
            // IMPRIMO EL VALOR
            System.out.println("While: " + a);
            
            // INCREMENTO EL VALOR DE LA VARIABLE "a" EN "1"
            a++; // a = a + 1; 
        }
        
        // ESTRUCTURA ITERATIVA "DoWhile"
        do {
            System.out.println("DoWhile: " + a);
        } while(a < 5);
        
        // ESTRUCTURA ITERATIVA "For"
        for (int i = 1; i <= 10; i++) {
            System.out.println("For #" + i);
        }
    }
}