package variables;

public class Variables {
    // DECLARACIÓN DE VARIABLES GLOBALES
    static byte a = 7;
    static int b = 5;
    
    // DECLARACIÓN DE UNA CONSTANTE
    static final double PI = 3.14;

    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLE LOCAL
        Integer c = 1;
        
        // PRESENTACIÓN DE LOS VALORES
        System.out.println("El valor de mi variable global es: " + a);
        System.out.println("El valor de mi variable global es: " + b);
        System.out.println("El valor de mi constante es: " + PI);
        System.out.println("El valor de mi variable referencial es: " + c);
        
        // MODIFICACIÓN DE LA VARIABLE GLOBAL
        a = 12;
        
        // MODIFICACIÓN DE LA VARIABLE LOCAL
        c = 20;
        
        // PRESENTACIÓN DE LOS VALORES
        System.out.println("El valor de mi variable global modificada es: " + a);
        System.out.println("El valor de mi variable local modificada es: " + c);        
    }
}
