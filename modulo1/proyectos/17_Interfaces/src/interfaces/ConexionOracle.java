package interfaces;

public class ConexionOracle implements IAccesoDatos, IAccesoOracle {
    // ATRIBUTOS
    private String serviceName;
    
    @Override
    public void conectar() {
        System.out.println("Método implementado conectar");
    }

    @Override
    public void desconectar() {
        System.out.println("Método implementado desconectar");
    }

    @Override
    public void listar() {
        System.out.println("Método implementado listar");
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    @Override
    public void setServiceName(String _sn) {
        this.serviceName = _sn;
    }
}
