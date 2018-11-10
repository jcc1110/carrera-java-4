package forkjoinframework;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

public class SumarEnteros extends RecursiveTask<Long> {
    // Atributos
    private final int[] numeros;
    private Long suma = new Long(0);
    private int inicio = 0;
    private final int cortes = 50;
    
    // Constructor
    public SumarEnteros(int[] _numeros, int _inicio) {
        this.numeros = _numeros;
        this.inicio = _inicio;
    }
 
    @Override
    protected Long compute() {
        // Establezco el punto final para tomar un corte
        int fin = (this.inicio + this.cortes) > this.numeros.length ? this.numeros.length : (this.inicio + this.cortes);

        // Tomar un parte del arreglo para procesarlo
        int[] parte = Arrays.copyOfRange(this.numeros, this.inicio, fin);
        
        // Creo un objeto null de la clase SumarEnteros
        SumarEnteros subTarea = null;
    
        // =================INICIO========================
        // Mientras no llegue al final del arreglo
        if(this.inicio < this.numeros.length) {            
            // Creo la tarea para seguir partiendo el arreglo
            subTarea = new SumarEnteros(this.numeros, this.inicio + this.cortes);
      
            // Dejo la tarea disponible para que el pool la ejecute
            subTarea.fork();
        }
        // =================FIN========================
        
        // Hago el trabajo de sumar el corte actual
        int i = 0;
        while(parte != null && i < this.cortes && i+1 < parte.length) {
            try {
                // Imprimo la parte por donde voy
                System.out.println(parte[i]);
                
                // Sumo los números
                this.suma += parte[i];
            } catch (Exception ex) {
                // Muestro la excepción en caso de producirse
                System.out.println(ex.getMessage());
            }
            
            // Incremento la variable en 1
            i++;
        }
        
        // Le pido a mi subtarea que me regrese su resultado y se lo sumo a la cuenta que llevo
        if(subTarea != null) {
            // Resultado -> Error
            //this.suma += subTarea.join();
            
            // Resultado -> Exception
            try {
                this.suma += subTarea.get();
            } catch (InterruptedException | ExecutionException ex) {
                System.out.println(ex.getMessage());
            }
        }

        // Retorno el resultado de la suma
        return this.suma;
    }
}
