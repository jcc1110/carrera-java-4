package genericos;

public class Genericos {
    public static void main(String[] args) {
        // GENÉRICO DE TIPO integer
        ClaseGenerica<Integer> cg = new ClaseGenerica<>(20);
        cg.obtenerTipo();
        
        // GENÉRICO DE TIPO cadena
        ClaseGenerica<String> cg2 = new ClaseGenerica<>("Anthony Hurtado");
        cg2.obtenerTipo();

        // GENÉRICO DE TIPO double
        ClaseGenerica<Double> cg3 = new ClaseGenerica<>(3.14);
        cg3.obtenerTipo();
    }
}
