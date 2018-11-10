package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES
        int a = 6;
        int b = 5;
        
        // CONDICIONES: if / else if / else
        if (a == b) {
            System.out.println("Es igual");
        } else if (a > b) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es diferente");
        }
    }
}