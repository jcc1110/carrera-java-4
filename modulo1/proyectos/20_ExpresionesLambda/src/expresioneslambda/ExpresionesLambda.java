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
        /*Operacion op = (int a, int b) -> {
            int result;
            result = (a + b) / 2;
            return result;
        };*/
        Operacion op = (a, b) -> (a + b)/2;
        
        // OPERACIÓN Y MUESTRA DE LOS DATOS
        resultado = op.sumar(3, 2);
        System.out.println("Resultado (Lambda): " + resultado);
    }
}
