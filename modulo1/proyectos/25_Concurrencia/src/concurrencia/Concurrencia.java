package concurrencia;

public class Concurrencia {
    public static void main(String[] args) {
        // CREO UN OBJETO Contador
        Contador contador = new Contador(); 
        
        // CREO DOS OBJETOS DE TIPO HiloContador
        HiloContador h1 = new HiloContador("PrimerHilo", contador);
        HiloContador h2 = new HiloContador("SegundoHilo", contador);
        HiloContador h3 = new HiloContador("TercerHilo", contador);
        
        // CAMBIANDO LA PRIORIDAD DE LOS HILOS
        h1.setPriority(4);
        h2.setPriority(1);
        h3.setPriority(3);
        
        // INICIO LOS HILOS
        h1.start();
        h2.start();
        h3.start();
    }
}
