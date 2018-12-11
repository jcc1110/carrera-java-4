package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maruja
 */
public class ConexionBD {


    public static Connection ConexionBD() throws  SQLException {
        
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/atm","root","root");
        try {
            // INCLUYENDO LA LIBRERIA AL PROYECTO
            System.out.println("Conectando...");
            //LE DICE A LA CLASE QUE VA A TRAERSE LA CLASE com.mysql.jdbc.driver
            Class.forName("com.mysql.jdbc.Driver");
            //REALIZANDO LA CONEXION A LA BASE DE DATOS
            
            System.out.println("Conexión exitosa");
           
            return conn;
       
            
       }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
