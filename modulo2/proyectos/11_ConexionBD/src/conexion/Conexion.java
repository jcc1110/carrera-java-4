package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {        
        try {
            // INCLUYENDO LA LIBRERIA AL PROYECTO
            System.out.println("Conectando...");
            Class.forName("com.mysql.jdbc.Driver");

            // REALIZANDO LA CONEXIÓN A LA BASE DE DATOS
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/prueba", "root", "root");
            System.out.println("Conexión exitosa");

            // PREPARANDO UNA CONSULTA
            Statement sta = con.createStatement();
            
            // CREANDO UN NUEVO REGISTRO EN LA BASE DE DATOS
            int resultado = sta.executeUpdate(
                "INSERT INTO usuario (id, usuario, clave) VALUES (3, 'adolfo', '123456789')");
            System.out.println("Resultado: " + resultado);             
            
            // CONSULTA A LA BASE DE DATOS
            ResultSet rs = sta.executeQuery("SELECT * FROM usuario");

            // RECORRIENDO EL RESULTADO
            while(rs.next()) {
                // IMPRIMIENTO CADA REGISTRO
                System.out.println(
                    rs.getInt("id") + " - " + 
                    rs.getString("usuario") + " - " + 
                    rs.getString("clave")
                );
            }            
        } catch (ClassNotFoundException ce) {
            System.out.println(ce.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
