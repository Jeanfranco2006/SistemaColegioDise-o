
package SistemaColegio.Dao;

import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements Dao<Persona> {

    private Connection conexion;

    public Persona(Connection conexion) {
        this.conexion = conexion;
    }

@Override
    public boolean registrar(Persona persona) {
        String sql = "INSERT INTO Persona (dni, Nombres, ApellidoP, ApellidoM, FechaNacimiento, Sexo, direccion, telefono, email) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, persona.getDni());
            stmt.setString(2, persona.getNombres());
            stmt.setString(3, persona.getApellidoP());
            stmt.setString(4, persona.getApellidM());
            stmt.setString(5, persona.getFechaNacimiento());
            stmt.setString(6, persona.getSexo());
            stmt.setString(7, persona.getDireccion());
            stmt.setInt(8, persona.getTelefono());
            stmt.setString(9, persona.getEmail());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Persona consultarPorId(int dni) {
        String sql = "SELECT * FROM Persona WHERE dni = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, dni);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Persona(
                    rs.getInt("dni"),
                    rs.getString("Nombres"),
                    rs.getString("ApellidoP"),
                    rs.getString("ApellidoM"),
                    rs.getString("FechaNacimiento"),
                    rs.getString("Sexo"),
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
    public boolean actualizar(Persona persona) {
        String sql = "UPDATE Persona SET Nombres = ?, ApellidoP = ?, ApellidoM = ?, FechaNacimiento = ?, Sexo = ?, direccion = ?, telefono = ?, email = ?" +
                     "WHERE dni = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, persona.getNombres());
            stmt.setString(2, persona.getApellidoP());
            stmt.setString(3, persona.getApellidM());
            stmt.setString(4, persona.getFechaNacimiento());
            stmt.setString(5, persona.getSexo());
            stmt.setString(6, persona.getDireccion());
            stmt.setInt(7, persona.getTelefono());
            stmt.setString(8, persona.getEmail());
            stmt.setInt(9, persona.getDni());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean eliminar(int dni) {
        String sql = "DELETE FROM Persona WHERE dni = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, dni);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Persona> listarTodos() {
        List<Persona> lista = new ArrayList<>();
        String sql = "SELECT * FROM Persona";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Persona persona = new Persona(
                    rs.getInt("dni"),
                    rs.getString("Nombres"),
                    rs.getString("ApellidoP"),
                    rs.getString("ApellidoM"),
                    rs.getString("FechaNacimiento"),
                    rs.getString("Sexo"),
                    rs.getString("direccion"),
                    rs.getInt("telefono"),
                    rs.getString("email")
                );
                lista.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }