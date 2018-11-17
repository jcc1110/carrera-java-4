package herencia;

public class Empleado extends Persona {
    // ATRIBUTOS
    private int sueldo;
        
    // MÉTODOS
    public String getSueldo() {        
        StringBuilder sb = new StringBuilder();
        sb.append("El sueldo de ");
        sb.append(super.getNombre());
        sb.append(", ");
        sb.append(super.getApellido());
        sb.append(" es Bs. ");
        sb.append(this.sueldo);
        return sb.toString().toUpperCase();
    }
    
    public String setSueldo(int _sueldo) {
        String mensaje;
        if (_sueldo <= 1800) {
            this.sueldo = _sueldo;
            mensaje = "Sueldo actualizado con éxito";
        } else {
            this.sueldo = 0;
            mensaje = "El sueldo no puedo ser superior a los BsS. 1.800";
        }
        return mensaje;
    }
}
