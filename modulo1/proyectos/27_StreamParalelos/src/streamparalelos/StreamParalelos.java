package streamparalelos;
import java.util.ArrayList;
import java.util.List;

public class StreamParalelos { 
    public static void main(String[] args) {
        // CREO UN ARREGLO DE TIPO ENTERO
        List<Integer> numeros = new ArrayList();
        
        // AÑADO AL ARREGLO LOS NÚMEROS DEL 1 AL 5
        for (int i=0; i<5; i++) {
            numeros.add(i);
        }
        
        // MUESTRO LOS NÚMEROS POR stream()
        numeros.stream().forEach(System.out::println);
        
        // SEPARO LOS RESULTADOS
        System.out.println("========");
        
        // MUESTRO LOS NÚMEROS POR parallelStream()
        numeros.parallelStream().forEach(System.out::println);
    }
}
