package claseabstracta;

public class Rectangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double a, double b) {
        return (a * b) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
}
