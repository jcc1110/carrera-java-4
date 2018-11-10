package streams;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // ESTABLEZCO EL ARREGLO DE nombres
        List<String> nombres = new ArrayList();
        nombres.add("Anthony");
        nombres.add("Candy");
        nombres.add("Terry");
        nombres.add("Carlos");
        
        // UTILIZO LOS FILTROS Streams
        System.out.println("Busco los nombres que comiencen con la letra C");
        nombres.stream().filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("");
        
        // ORDENO LOS NOMBRES
        System.out.println("Se ordena la lista");
        nombres.stream().sorted().forEach(System.out::println);
        System.out.println("");
        
        // RECORRO Y MANIPULO LOS NOMBRES
        System.out.println("Manipulo cada elemento");
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("");
        
        // LIMITAR LOS RESULTADOS
        System.out.println("Limito los resultados");
        nombres.stream().limit(2).forEach(System.out::println);
        System.out.println("");
        
        // CONTAR LOS ELEMENTOS
        System.out.println("Cantidad de elementos");
        System.out.println(nombres.stream().count());
    }
}
