package paquetesimports;
import com.oracle.externo.Saludo;
import static com.oracle.externo.Saludo.despedir;

public class PaquetesImports {
    public static void main(String[] args) {
        // INSTANCIA LA CLASE Paquetes
        Saludo per = new Saludo();
        
        // USO DEL MÉTODO NORMAL
        per.saludar();
        
        // USO DEL MÉTODO ESTÁTICO
        Saludo.despedir();
        
        // USO DEL MÉTODO ESTÁTICO IMPORTADO
        despedir();
    }
}
