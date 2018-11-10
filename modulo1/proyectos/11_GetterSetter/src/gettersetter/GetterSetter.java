package gettersetter;

public class GetterSetter {
    public static void main(String[] args) {
        // INSTANCIA DE MI CLASE Persona
        Persona persona = new Persona("Anthony","Hurtado",27);

        // PRESENTO LOS DATOS
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());  
        System.out.println(persona.nombreCompleto());
        System.out.println("");
        
        // CAMBIANDO LOS VALORES
        persona.setNombre("Pedro");
        persona.setApellido("Lopez");
        persona.setEdad(25);
        
        // MUESTRO LOS DATOS
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());  
        System.out.println(persona.nombreCompleto());
    }
}
