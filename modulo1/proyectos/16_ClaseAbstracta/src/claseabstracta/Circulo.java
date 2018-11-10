package claseabstracta;

public class Circulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double a, double b) {
        return Math.PI * Math.pow(a, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}
