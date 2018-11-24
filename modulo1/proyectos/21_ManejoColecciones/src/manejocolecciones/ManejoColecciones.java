package manejocolecciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManejoColecciones {
    public static void main(String[] args) {
        // LISTA ESTRUCTURADA DE DATOS
        List empleados = new ArrayList();
        empleados.add("Anthony Hurtado");
        empleados.add("Pepe Mujica");
        recorrer(empleados);
        
        // CONJUNTO DE DATOS
        Set tareas = new HashSet();
        tareas.add("Limpiar mi cuarto");
        tareas.add("Sacar la basura");
        recorrer(tareas);
        
        // MAPA DE CLAVE:VALOR
        Map usuarios = new HashMap();
        usuarios.put("s24dafszf", "anhurtado");
        usuarios.put("asda96341", "pemujica");
        recorrer(usuarios.keySet());
        recorrer(usuarios.values());
    }
    
    // RECORRO LA COLECCIÓN E IMPRIMO CADA ELEMENTO
    public static void recorrer(Collection coleccion) {        
        // PROGRAMACIÓN FUNCIONAL
        coleccion.forEach(elemento -> System.out.println(elemento.toString().toUpperCase()));
        //coleccion.forEach(System.out::println);
        
        // PROGRAMACIÓN IMPERATIVA
        /*for(Object elemento : coleccion) {
            System.out.println(elemento);
        }*/
        System.out.println("");
    }
}
