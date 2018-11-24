package genericos;

public class ClaseGenerica<T> {
    // ATRIBUTO GENÉRICO
    T atributo;
    
    // CONSTRUCTOR
    public ClaseGenerica(T _atributo) {
        this.atributo = _atributo;
    }
    
    // MÉTODO PARA OBTENER EL TIPO DE DATO
    public void obtenerTipo() {
        System.out.println(
            "T es: "+ this.atributo.getClass().getName() +
            " y su valor es "+ this.atributo
        );
    }
}
