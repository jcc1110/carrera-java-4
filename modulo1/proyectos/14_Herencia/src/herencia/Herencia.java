package herencia;

public class Herencia {
    public static void main(String[] args) {
        // CLASE Empleado
        Empleado empleado = new Empleado();
        empleado.setNombre("Anthony");
        empleado.setApellido("Hurtado");
        
        // PRESENTO LOS DATOS
        System.out.println( empleado.getNombre() );
        System.out.println( empleado.getApellido() );
        System.out.println( empleado.setSueldo(1800) );
        System.out.println( empleado.getSueldo() );
    }
}
