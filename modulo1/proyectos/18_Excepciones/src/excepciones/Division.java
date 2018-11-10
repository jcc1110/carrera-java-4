package excepciones;

/**
 * Esta clase nos permite dividir dos números
 * @author Anthony Hurtado
 * @version 1.0.0
 */
public class Division {
    /**
     * Numerador de la división
     */
    private int numerador;
    /**
     * Denominador de la división
     */
    private int denominador;
        
    /**
     * Constructor de la clase
     * @param _numerador numerador
     * @param _denominador denominador
     */
    public Division(int _numerador, int _denominador) {
        this.numerador = _numerador;
        this.denominador = _denominador;
    }
    
    /**
     * Método para dividir dos números
     * @throws MiExcepcion
     */
    public void dividir() throws MiExcepcion {
        int resultado;
        
        if (this.denominador == 0) {
            throw new MiExcepcion("La división no puede ser realizada con un valor cero.");
        }
        
        resultado = this.numerador / this.denominador;
        System.out.println("El resultado es: "+ resultado);
    }
}
