package herencia;

public class Empleado extends Persona {
    // ATRIBUTOS
    private int sueldo;
        
    // MÉTODOS
    public String getSueldo() {
        String formato = "El sueldo de "+ super.getNombre();
        formato += ", " + super.getApellido();
        formato += " es Bs. " + this.sueldo;
        return formato.toUpperCase();
    }
    
    public String setSueldo(int _sueldo) {
        String mensaje = "";
        if (_sueldo <= 10) {
            this.sueldo = _sueldo;
            mensaje = "Sueldo actualizado con éxito";
        } else {
            this.sueldo = 0;
            mensaje = "El sueldo no puedo ser superior a los Bs. 10,00";
        }
        return mensaje;
    }
}
