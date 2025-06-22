
package SistemaColegio.Dao;

import SistemaColegio.Database.SistemaColegioBD;
import SistemaColegio.Modelo.Curso;
import SistemaColegio.Interfaces.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CursoDAO implements Dao<Curso>{

    private final Connection conexion;

    public CursoDAO() {
        conexion = SistemaColegioBD.getInstancia().getConexion();
    }

    public List<Curso> listarTodos() {
    List<Curso> listCurso = new ArrayList<>(); 
    
    
    /*Leer*/
    String sql = "SELECT * FROM cursos";

    try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            listCurso.add(new Curso(rs.getString("id"), rs.getString("nombre"), rs.getString("grado"), rs.getCharacterStream("estado")));

        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("⚠️ Error al listar cursos.");
    }

    if (listCurso.isEmpty()) {
        System.out.println("❗ No se encontraron registros o la conexión falló.");
    }

    return listCurso;
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

    @Override
    public boolean registrar(Curso t) {
        throw new UnsupportedOperationException("No yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Curso consultarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Curso t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
