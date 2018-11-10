package concurrencia;

public class HiloContador extends Thread {
    // ATRIBUTOS
    Contador contador;

    // CONSTRUCTOR
    public HiloContador(String name, Contador counter) {
        // LLAMO AL CONSTRUCTOR DE LA CLASE PADRE (Thread)
        // Y LE PASO EL NOMBRE DEL HILO
        super(name);
        this.contador = counter;
    }
    
    // IMPLEMENTO EL MÉTODO run() DE LA CLASE PADRE (Thread)
    @Override
    public void run() {
        try {
            String mensaje;
            for (int i=0; i<10; i++) {
                // VARIABLE NECESARIA
                int valorContador;
                
                // DECORADOR PARA SINCRONIZAR LA EJECUCIÓN DE LOS HIJOS
                // synchronized(this.contador) {
                    // OBTENGO EL VALOR ACTUAL DEL OBJETO
                    valorContador = this.contador.getContador();
                    
                    // DETENGO POR UN 1 MILISEGUNDO LA EJECUCIÓN DEL HIJO
                    Thread.sleep(500);
                    
                    // ESTABLEZCO EL VALOR DE LA PROPIEDAD
                    this.contador.setContador(valorContador + 1);
                    
                    // IMPRIMO EL VALOR ACTUAL
                    mensaje = "Hilo: "+ super.getName() +" / ";
                    mensaje += "Prioridad: "+ super.getPriority() +" / ";
                    mensaje += "Contador: "+ valorContador;
                    System.out.println(mensaje);
                //}
            }
        } catch (InterruptedException e) {
            // MUESTRO EL MENSAJE DE LA EXCEPCIÓN PRODUCIDA
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}