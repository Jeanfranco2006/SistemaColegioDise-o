package SistemaColegio.Dao;

import SistemaColegio.Database.SistemaColegioBD;
import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.DetalleMatricula;
import SistemaColegio.Modelo.Curso;
import SistemaColegio.Modelo.Matricula;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetalleMatriculaDAO implements Dao<DetalleMatricula>{
    private final Connection conexion;

    public DetalleMatriculaDAO() {
        conexion = SistemaColegioBD.getInstancia().getConexion();
    }

    @Override
    public boolean registrar(DetalleMatricula d) {
        String sql = "INSERT INTO detallematricula (idmatricula, idcurso) VALUES (?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, d.getMatricula().getIdMatricula());
            stmt.setString(2, d.getCurso().getIdCurso());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public DetalleMatricula consultarPorId(int id) {
        String sql = "SELECT * FROM detallematricula WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Matricula m = new Matricula(); m.setIdMatricula(rs.getString("idmatricula"));
                Curso c = new Curso(); c.setIdCurso(rs.getString("idcurso"));
                return new DetalleMatricula(m, c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean actualizar(DetalleMatricula d) {
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM detallematricula WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<DetalleMatricula> listarTodos() {
        List<DetalleMatricula> lista = new ArrayList<>();
        String sql = "SELECT * FROM detallematricula";
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Matricula m = new Matricula(); m.setIdMatricula(rs.getString("idmatricula"));
                Curso c = new Curso(); c.setIdCurso(rs.getString("idcurso"));
                lista.add(new DetalleMatricula(m, c));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
