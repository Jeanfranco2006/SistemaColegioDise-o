package SistemaColegio.Dao;

import SistemaColegio.Database.SistemaColegioBD;
import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.Matricula;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO implements Dao<Matricula>{
    private final Connection conexion;

    public MatriculaDAO() {
        conexion = SistemaColegioBD.getInstancia().getConexion();
    }

    @Override
    public boolean registrar(Matricula m) {
        String sql = "INSERT INTO matricula (idmatricula, periodoacademico, fecha, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, m.getIdMatricula());
            stmt.setString(2, m.getPeriodoAcademico());
            stmt.setDate(3, new java.sql.Date(m.getFecha().getTime()));
            stmt.setString(4, String.valueOf(m.getEstado()));
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Matricula consultarPorId(int id) {
        String sql = "SELECT * FROM matricula WHERE idmatricula = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, String.valueOf(id));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Matricula(
                    rs.getString("idmatricula"),
                    rs.getString("periodoacademico"),
                    rs.getDate("fecha"),
                    rs.getString("estado").charAt(0)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean actualizar(Matricula m) {
        String sql = "UPDATE matricula SET periodoacademico = ?, fecha = ?, estado = ? WHERE idmatricula = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, m.getPeriodoAcademico());
            stmt.setDate(2, new java.sql.Date(m.getFecha().getTime()));
            stmt.setString(3, String.valueOf(m.getEstado()));
            stmt.setString(4, m.getIdMatricula());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM matricula WHERE idmatricula = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Matricula> listarTodos() {
        List<Matricula> lista = new ArrayList<>();
        String sql = "SELECT * FROM matricula";
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Matricula(
                    rs.getString("idmatricula"),
                    rs.getString("periodoacademico"),
                    rs.getDate("fecha"),
                    rs.getString("estado").charAt(0)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
