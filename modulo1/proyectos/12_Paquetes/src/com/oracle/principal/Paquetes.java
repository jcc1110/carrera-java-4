package com.oracle.principal;
import com.oracle.externo.Saludo;
import static com.oracle.externo.Saludo.despedir;

public class Paquetes {
    public static void main(String[] args) {
        // INSTANCIA LA CLASE Paquetes
        Saludo sal = new Saludo();
        
        // USO DEL MÉTODO NORMAL
        sal.saludar();
        
        // USO DEL MÉTODO ESTÁTICO
        Saludo.despedir();
        
        // USO DEL MÉTODO ESTÁTICO IMPORTADO
        despedir();
    }
}
