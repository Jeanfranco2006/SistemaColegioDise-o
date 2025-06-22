package SistemaColegio.Dao;

import SistemaColegio.Database.SistemaColegioBD;
import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.Programacion;
import SistemaColegio.Modelo.Horario;
import SistemaColegio.Modelo.Aula;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramacionDAO implements Dao<Programacion>{
    private final Connection conexion;

    public ProgramacionDAO() {
        conexion = SistemaColegioBD.getInstancia().getConexion();
    }

    @Override
    public boolean registrar(Programacion p) {
        String sql = "INSERT INTO programacion (idprogramacion, idhorario, idaula, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, p.getIdProgramacion());
            stmt.setString(2, p.getHorario().getIdHorario());
            stmt.setString(3, p.getAula().getIdAula());
            stmt.setString(4, String.valueOf(p.getEstado()));
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Programacion consultarPorId(int id) {
        String sql = "SELECT * FROM programacion WHERE idprogramacion = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, String.valueOf(id));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Horario h = new Horario(); h.setIdHorario(rs.getString("idhorario"));
                Aula a = new Aula(); a.setIdAula(rs.getString("idaula"));
                return new Programacion(rs.getString("idprogramacion"), h, a, rs.getString("estado").charAt(0));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean actualizar(Programacion p) {
        String sql = "UPDATE programacion SET idhorario = ?, idaula = ?, estado = ? WHERE idprogramacion = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, p.getHorario().getIdHorario());
            stmt.setString(2, p.getAula().getIdAula());
            stmt.setString(3, String.valueOf(p.getEstado()));
            stmt.setString(4, p.getIdProgramacion());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM programacion WHERE idprogramacion = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Programacion> listarTodos() {
        List<Programacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM programacion";
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Horario h = new Horario(); h.setIdHorario(rs.getString("idhorario"));
                Aula a = new Aula(); a.setIdAula(rs.getString("idaula"));
                lista.add(new Programacion(rs.getString("idprogramacion"), h, a, rs.getString("estado").charAt(0)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
