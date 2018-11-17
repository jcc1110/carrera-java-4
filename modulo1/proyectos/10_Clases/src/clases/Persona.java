package clases;

public class Persona {
    // ATRIBUTOS
    public String nombre;
    public String apellido;
    public int cumpleanos;
    
    // CONSTRUCTOR #01
    public Persona() { }
    
    // CONSTRUCTOR #02
    public Persona(String firstname, String lastname, int birthdate) {
        this.nombre = firstname;
        this.apellido = lastname;
        this.cumpleanos = birthdate;
    }
    
    // MÉTODOS
    public String obtenerNombreCompleto(boolean mayus) {
        String cadena = this.nombre +" "+ this.apellido;  
        return (mayus) ? cadena.toUpperCase() : cadena.toLowerCase();
    }
    
    public String obtenerNombreCompleto() {
        return this.apellido + ", " + this.nombre;
    }
    
    public int obtenerEdad() {
        return 2018 - this.cumpleanos;
    }
}
