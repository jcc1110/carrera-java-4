package interfaces;

public class Interfaces {
    public static void main(String[] args) {
        // INSTANCIA DE LA CLASE ConexionOracle
        ConexionOracle cnn = new ConexionOracle();
        
        // LLAMANDO A LOS MÉTODOS NECESARIOS
        cnn.conectar();
        cnn.listar();
        cnn.desconectar();

        // ESTABLECIENDO EL VALOR Y MOSTRANDOLO
        cnn.setServiceName("xe");
        System.out.println(cnn.getServiceName());
    }
}
