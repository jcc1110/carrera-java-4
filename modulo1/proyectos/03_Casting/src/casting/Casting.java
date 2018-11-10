package casting;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Casting {
    public static void main(String[] args) {
        // DECLARACIÓN DE LAS VARIABLES NECESARIAS
        byte a = 12;
        Byte b = 10;
        Double c = 12.9458957;
        
        // CASTING PRIMITIVOS Y REFERENCIALES
        // IMPLICITOS
        Short aConvertido = (short)a;
        Long bConvertido = b.longValue();
        
        // EXPLICITOS
        Integer cConvertido = c.intValue();
        
        // FORMATO PARA LOS DECIMALES
        NumberFormat formatoDec = new DecimalFormat("#0.00");
        System.out.println("Formateando los decimales: " + formatoDec.format(c));
        
        // PRESENTACIÓN DE LOS VALORES
        System.out.println("El valor Short es: " + aConvertido + " - " + aConvertido.getClass());
        System.out.println("El valor Long es: " + bConvertido + " - " + bConvertido.getClass());
        System.out.println("El valor Integer es: " + cConvertido + " - " + cConvertido.getClass());
    }
}
