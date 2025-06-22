//@author Cesar
package SistemaColegio.Dao;

import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO implements Dao<Alumno> {

    private Connection conexion;

    public AlumnoDAO(Connection conexion) {
        this.conexion = conexion;
    }


    @Override
    public boolean registrar(Alumno alumno) {
        String sql = "INSERT INTO Alumno (idAlumno, apoderado, grado, seccion, id_persona) " +
                     "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, alumno.getIdAlumno());
            stmt.setString(2, alumno.getApoderado());
            stmt.setString(3, alumno.getGrado());
            stmt.setString(4, alumno.getSeccion());
            stmt.setInt(5, alumno.getDni());
            stmt.setString(6, alumno.getNombres());
            stmt.setString(7, alumno.getApellidoP());
            stmt.setString(8, alumno.getApellidoM());
            stmt.setString(9, alumno.getFechaNacimiento());
            stmt.setString(10, alumno.getSexo());
            stmt.setString(11, alumno.getDireccion());
            stmt.setInt(12, alumno.getTelefono());
            stmt.setString(13, alumno.getEmail());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Alumno consultarPorId(int idAlumno) {
        String sql = "SELECT * FROM Alumno WHERE idAlumno = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idAlumno);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Alumno(
                    rs.getString("idAlumno"),
                    rs.getString("apoderado"),
                    rs.getString("grado"),
                    rs.getString("seccion"),
                    rs.getInt("dni"),
                    rs.getString("nombres"),
                    rs.getString("ApellidoP"),
                    rs.getString("ApellidoM"),
                    rs.getString("fechaNacimiento"),
                    rs.getString("sexo"),
                    rs.getString("direccion"),
                    rs.getInt("telefono"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean actualizar(Alumno alumno) {
        String sql = "UPDATE Alumno SET apoderado = ?, grado = ?, seccion = ?, nombres = ?, ApellidoP = ?, ApellidoM = ?, fechaNacimiento = ?, sexo = ?, direccion = ?, telefono = ?, email = ?, dni = ? " +
                     "WHERE idAlumno = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, alumno.getApoderado());
            stmt.setString(2, alumno.getGrado());
            stmt.setString(3, alumno.getSeccion());
            stmt.setString(4, alumno.getNombres());
            stmt.setString(5, alumno.getApellidoP());
            stmt.setString(6, alumno.getApellidoM());
            stmt.setString(7, alumno.getFechaNacimiento());
            stmt.setString(8, alumno.getSexo());
            stmt.setString(9, alumno.getDireccion());
            stmt.setInt(10, alumno.getTelefono());
            stmt.setString(11, alumno.getEmail());
            stmt.setInt(12, alumno.getDni());
            stmt.setString(13, alumno.getIdAlumno());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean eliminar(int idAlumno) {
        String sql = "DELETE FROM Alumno WHERE idAlumno = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idAlumno);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Alumno> listarTodos() {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM Alumno";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Alumno alumno = new Alumno(
                    rs.getString("idAlumno"),
                    rs.getString("apoderado"),
                    rs.getString("grado"),
                    rs.getString("seccion"),
                    rs.getInt("dni"),
                    rs.getString("nombres"),
                    rs.getString("ApellidoP"),
                    rs.getString("ApellidoM"),
                    rs.getString("fechaNacimiento"),
                    rs.getString("sexo"),
                    rs.getString("direccion"),
                    rs.getInt("telefono"),
                    rs.getString("email")
                );
                lista.add(alumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

