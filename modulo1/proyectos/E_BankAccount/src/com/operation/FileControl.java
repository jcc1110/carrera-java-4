package com.operation;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileControl {
    // Atributos
    private String pathFile;
    private String information;
    
    // Método de lectura del archivo
    public List<String> readContent() {
        // Creo la instancia del objeto
        File fileObject = new File(this.getPathFile());
        List<String> infoList = new ArrayList();
        try {
            // Leyendo el archivo
            BufferedReader _entry = new BufferedReader(new FileReader(fileObject));
            
            // Me ubico en la primera posición
            this.setInformation(_entry.readLine());
            infoList.add(this.getInformation());
            
            // Recorro la información del archivo
            while (this.getInformation() != null) {
                this.setInformation(_entry.readLine());
                if (this.getInformation() != null) {
                    infoList.add(this.getInformation());
                }
            }
            
            // Cierro la conexión al archivo
            _entry.close();
        } catch (IOException ex) {
            // Muestro el mensaje de la excepción en caso de producirse
            System.out.println(ex.getMessage());
        } catch(Exception e) {
            // Muestro el mensaje de la excepción generica
            System.out.println(e.getMessage());
        }
        
        // Devuelvo el arreglo con los datos
        return infoList;
    }

    // Métodos get y set
    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
