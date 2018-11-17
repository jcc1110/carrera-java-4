package clasesanidadas;

// CLASE PRINCIPAL
public class Operaciones {
    // ATRIBUTOS
    static int c = 10;
    int d = 11;
    
    // INSTANCIA DE LA CLASE ANIDADA Suma
    Suma suma = new Suma();
    
    // CONSTRUCTOR
    public Operaciones() {
        System.out.println("Hola desde el constructor de la clase principal");
        suma.saludar();
    }
    
    // CLASE ANIDADA
    public static class Suma {
        // ATRIBUTOS
        private int a;
        private int b;
        
        // MÉTODOS
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
        
        public int calcular() {
            System.out.println("Valor interno: " + c);
            
            // INSTANCIA DE LA CLASE PRINCIPAL Operacion
            Operaciones op = new Operaciones();
            
            // IMPRIMO UN VALOR
            System.out.println("Clase externa: " + op.d);            
            
            // REALIZO LA SUMA
            return this.getA() + this.getB();
        }
        
        public void saludar() {
            System.out.println("Hola desde Sumar");
        }
    }
    
    public class Resta {}
    
    public class Multiplicacion {}
}
