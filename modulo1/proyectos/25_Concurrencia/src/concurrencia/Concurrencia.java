package concurrencia;

public class Concurrencia {
    public static void main(String[] args) {
        // CREO UN OBJETO Contador
        Contador contador = new Contador(); 
        
        // CREO DOS OBJETOS DE TIPO HiloContador
        HiloContador h1 = new HiloContador("PrimerHilo", contador);
        HiloContador h2 = new HiloContador("SegungoHilo", contador);
        
        // CAMBIANDO LA PRIORIDAD DE LOS HILOS
        h1.setPriority(4);
        h2.setPriority(1);
        
        // INICIO LOS HILOS
        h1.start();
        h2.start();
    }
}
