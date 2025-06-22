
package SistemaColegio.Controlador;
import SistemaColegio.Database.SistemaColegioBD;
import SistemaColegio.Modelo.Admin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private final Connection conexion;

    public UsuarioDAO() {
        conexion = SistemaColegioBD.getInstancia().getConexion();
    }

    public List<Admin> listarTodos() {
    List<Admin> lista = new ArrayList<>(); 
    
    
    /*Leer*/
    String sql = "SELECT * FROM usuarios";

    try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            lista.add(new Admin(rs.getInt("id"), rs.getString("usuario"), rs.getString("contraseña")));

        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("⚠️ Error al listar usuarios.");
    }

    if (lista.isEmpty()) {
        System.out.println("❗ No se encontraron registros o la conexión falló.");
    }

    return lista;
}
    
    public boolean validar(String usuario, String contraseña) {
        String sql = "SELECT * FROM usuarios WHERE usuario= ? and contraseña=?";
        
        try (PreparedStatement stmt = conexion.prepareStatement(sql)){
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    

}
