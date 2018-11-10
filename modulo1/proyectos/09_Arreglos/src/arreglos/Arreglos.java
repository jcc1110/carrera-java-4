package arreglos;
import java.util.ArrayList;

public class Arreglos {
    public static void main(String[] args) {
        /**
         * PRIMERA FORMA DE DECLARAR UN ARREGLO:
         * ESTABLECIENDO LOS VALORES AL INICIO
         * */
        String[] nombres = {"Anthony", "Ricardo", "Ana", "Petra"};
        int[] numeros = {1, 2, 3};
        
        /** 
         * SEGUNDA FORMA DE DECLARAR UN ARREGLO:
         * EL VALOR ENTRE CORCHETES SERÁ LA LONGITUD QUE TENDRÁ EL ARREGLO
         * */
        String[] apellidos = new String[2];
        apellidos[0] = "Hurtado";
        apellidos[1] = "Perez";
        
        // MOSTRANDO LOS VALORES
        System.out.println(nombres[2] + " " + apellidos[1] + " " + numeros[2]);
        System.out.println(""); 
        
        /* ========================================== */

        // INSTANCIA DE LA CLASE ArrayList
        ArrayList<String> arreglo = new ArrayList<>();
        
        // AGREGO ELEMENTOS A MI ArrayList
        arreglo.add("Anthony");
        arreglo.add("Ruben");
        arreglo.add("Pedro");
        
        // MUESTRO LOS VALORES      
        System.out.println("La cantidad de elementos del arreglo son: " + arreglo.size());
        System.out.println("Valor en la posición 1: " + arreglo.get(1));
        
        // ELIMINO UN REGISTRO, INDICANDO SU POSICIÓN
        arreglo.remove(2);
        
        // MOSTRANDO EL ARREGLO COMPLETO
        System.out.println("Lista de elementos:" + arreglo);
    }
}