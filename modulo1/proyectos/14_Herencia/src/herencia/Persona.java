package herencia;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    
    // MÉTODOS
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String _nombre) {
        this.nombre = _nombre.toUpperCase();
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String _apellido) {
        this.apellido = _apellido.toUpperCase();
    }
    
    public String obtenerNombreCompleto() {
        return this.getNombre() + " " + this.getApellido();
    }
}
