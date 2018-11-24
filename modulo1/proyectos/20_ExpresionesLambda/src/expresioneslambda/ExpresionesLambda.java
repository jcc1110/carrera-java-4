package expresioneslambda;

public class ExpresionesLambda {
    public static void main(String[] args) {
        // VARIABLES
        int resultado;
        
        // INSTANCIA DE LA CLASE Aritmetica
        Aritmetica arit = new Aritmetica();
        resultado = arit.sumar(3, 2);
        System.out.println("Resultado: " + resultado);
        
        // USO DE LA EXPRESIÓN LAMBDA
        Operacion op = (x, y) -> x + y * 14;
        resultado = op.sumar(3, 2);
        System.out.println("Resultado (Lambda): " + resultado);
    }
}
