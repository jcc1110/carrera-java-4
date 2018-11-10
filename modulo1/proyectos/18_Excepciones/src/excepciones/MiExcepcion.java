package excepciones;

/**
 * Construyendo mi propia excepción.
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class MiExcepcion extends Exception {
    /**
     * Declaro mi constructor y llamo al constructor padre.
     * @param _mensaje Mensaje a mostrar al usuario
     */
    public MiExcepcion(String _mensaje) {
        super(_mensaje);
    }
}
