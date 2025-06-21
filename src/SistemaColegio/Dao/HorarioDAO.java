 //@author César
package SistemaColegio.Dao;

import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.Aula;
import SistemaColegio.Modelo.Horario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HorarioDAO implements Dao<Horario> {

    private Connection conexion;

    public HorarioDAO(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean registrar(Horario horario) {
        String sql = "INSERT INTO horarios (idHorario, diaSemana, horaEntrada, horaSalida, id_Aula) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, horario.getIdHorario());
            stmt.setString(2, horario.getDiaSemana());
            stmt.setString(3, horario.getHoraEntrada());
            stmt.setString(4, horario.getHoraSalida());
            stmt.setString(5, horario.getAula().getIdAula()); // suponiendo que Aula tiene getIdAula()
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Horario consultarPorId(int idHorario) {
        String sql = "SELECT * FROM horarios WHERE idHorario = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idHorario);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Aula aula = new Aula();
                aula.setIdAula(rs.getString("id_Aula")); // Solo id, puedes cargar más luego si quieres

                return new Horario(
                    rs.getString("idHorario"),
                    rs.getString("diaSemana"),
                    rs.getString("horaEntrada"),
                    rs.getString("horaSalida"),
                    aula
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean actualizar(Horario horario) {
        String sql = "UPDATE horarios SET diaSemana = ?, horaEntrada = ?, horaSalida = ?, id_Aula = ? WHERE idHorario = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, horario.getDiaSemana());
            stmt.setString(2, horario.getHoraEntrada());
            stmt.setString(3, horario.getHoraSalida());
            stmt.setString(4, horario.getAula().getIdAula());
            stmt.setString(5, horario.getIdHorario());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean eliminar(int idHorario) {
        String sql = "DELETE FROM horarios WHERE idHorario = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idHorario);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Horario> listarTodos() {
        List<Horario> lista = new ArrayList<>();
        String sql = "SELECT * FROM horarios";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Aula aula = new Aula();
                aula.setIdAula(rs.getString("id_Aula"));

                Horario horario = new Horario(
                    rs.getString("idHorario"),
                    rs.getString("diaSemana"),
                    rs.getString("horaEntrada"),
                    rs.getString("horaSalida"),
                    aula
                );
                lista.add(horario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

