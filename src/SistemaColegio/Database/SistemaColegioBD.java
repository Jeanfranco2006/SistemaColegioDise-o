
package SistemaColegio.Database;
import java.sql.*;
public class SistemaColegioBD {
    
    /*Patron singleton*/
    private static SistemaColegioBD instancia;
    private Connection conexion;
    
    
    private final String url = "jdbc:postgresql://localhost:5432/SistemaColegio";
    private final String Usuario = "postgres";
    private final String Clave = "root";
    
    private SistemaColegioBD() {
        try {
            conexion = DriverManager.getConnection(url,Usuario,Clave);
            System.out.println("Conexion exitosa...");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static SistemaColegioBD getInstancia() {
        if (instancia == null) {
            instancia =new SistemaColegioBD();
        }
        return instancia;
    }
    
    public Connection getConexion() {
        return conexion;
    }
 
    public static void main(String[] args) {
        SistemaColegioBD conexionBD = SistemaColegioBD.getInstancia();
        if (conexionBD.getConexion() != null) {
            System.out.println("🔗 La conexión a la base de datos está activa.");
        } else {
            System.out.println("⚠️ No se pudo establecer la conexión.");
        }
    }
    
            
}
