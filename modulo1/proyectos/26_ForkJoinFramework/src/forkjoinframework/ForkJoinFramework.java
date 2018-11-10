package forkjoinframework;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinFramework {
    public static void main(String[] args) {
        // Variables necesarias
        int[] numerosASumar = new int[200];
        long resultado;
        
        // Llenamos el arreglo con valores aleatorios
        Random ran = new Random();
        for(int i=0; i<numerosASumar.length; i++) {
            numerosASumar[i] = ran.nextInt();
        }
        
        // Creamos la instancia necesaria
        ForkJoinPool fjp = new ForkJoinPool();
        
        // Tomamos el tiempo al iniciar
        long tiempoInicio = System.currentTimeMillis();
        
        // Iniciamos la ejecución
        resultado = fjp.invoke(new SumarEnteros(numerosASumar, 0));
        
        // Tomamos el tiempo al terminar y le restamos el tiempo inicial
        float tiempo = (System.currentTimeMillis() - tiempoInicio);
        
        // Imprimiendo los valores
        System.out.println("================");
        System.out.println("Suma: " + resultado);
        System.out.println("Tiempo: " + tiempo);
    }
}