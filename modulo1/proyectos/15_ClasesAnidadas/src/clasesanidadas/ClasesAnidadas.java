package clasesanidadas;

public class ClasesAnidadas {
    public static void main(String[] args) {
        // INSTANCIA DE LA CLASE ANIDADA
        Operaciones.Suma suma = new Operaciones.Suma();

        // ESTABLECIENDO VALORES A LAS PROPIEDADES
        suma.setA(3);
        suma.setB(4);

        // IMPRIMIENDO LOS VALORES
        System.out.println("Resultado: " + suma.calcular());
    }
}
