package claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {
        // INSTANCIA DE LA CLASE Circulo Y Rectangulo
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        
        // UTILIZO LOS MÉTODOS IMPLEMENTADOS
        System.out.println("El área de un círculo es: " + circulo.calcularArea(2, 0));
        System.out.println("El área de un rectángulo es: " + rectangulo.calcularArea(46, 50));
        
        // DIBUJANDO LAS FIGUJAS GEOMETRICAS
        circulo.dibujar();
        rectangulo.dibujar();
    }    
}
