
package SistemaColegio.Dao;

import SistemaColegio.Interfaces.Dao;
import SistemaColegio.Modelo.Aula;
import SistemaColegio.Modelo.Curso;
import SistemaColegio.Modelo.Docente;
import java.sql.*;
import java.util.List;

public class DocenteDAO implements Dao<Docente> {

    private Connection conexion;

    public DocenteDAO(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean registrar(Docente docente) {
        String sql = "INSERT INTO docente (idProfesor, titulo, fechaContrato, id_persona, id_curso, id_Aula) "+
                     "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, docente.getIdProfesor());
            stmt.setString(2, docente.getTitulo());
            stmt.setString(3, docente.getFechaContrato());
            stmt.setInt(4, docente.getDni());
            stmt.setString(5, docente.getId_curso().getIdCurso());
            stmt.setString(6, docente.getId_aula().getIdAula());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    /*Create table Docente(
idProfesor VARCHAR(20) Primary key,
titulo VARCHAR(30),
fechaContrato VARCHAR(35),
id_persona int,
id_curso VARCHAR(20),
id_Aula VARCHAR(20),
id_Usuario int,
Foreign key (id_persona) REFERENCES Persona(dni),
Foreign key (id_curso) REFERENCES Curso(idCurso),
Foreign key (id_Aula) REFERENCES Aula(idAula),
Foreign key (id_Usuario) REFERENCES PersonaUsuario(idPersonaUsuario)
);

private String idProfesor;
    private String titulo;
    private String fechaContrato;
    private Curso id_curso;
    private Aula id_aula;
      

      public Docente(String idProfesor, String titulo, String fechaContrato, Curso id_curso, Aula id_aula,
                   int dni, String nombres, String apellidoP, String apellidoM,
                   String fechaNacimiento, String sexo, String direccion,
                   int telefono, String email) {
        super(dni, nombres, apellidoP, apellidoM, fechaNacimiento, sexo, direccion, telefono, email);
        this.id_curso = id_curso;
        this.id_aula = id_aula;
        this.idProfesor = idProfesor;
        this.titulo = titulo;
        this.fechaContrato = fechaContrato;
    }
 */
    @Override
    public Docente consultarPorId(int idProfesor) {
         String sql = "SELECT * FROM Docente d " +
                 "JOIN Persona p ON d.id_persona = p.dni " +
                 "JOIN Curso c ON d.id_curso = c.idCurso " +
                 "JOIN Aula a ON d.id_Aula = a.idAula " +
                 "WHERE p.dni = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idProfesor);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                /**  public Curso(String idCurso, String grado, String nombre, char estado) { */
                /*  public Aula(String idAula, int numeroAula, int capacidad, char estado)  */
            Curso curso = new Curso(rs.getString("idCurso"), rs.getString("grado"), rs.getString("nombre"), rs.getString("estado").charAt(0)    );
            Aula aula = new Aula(rs.getString("idAula"), rs.getInt("numeroAula"), rs.getInt("capacidad"), rs.getString("estado").charAt(0));
                return new Docente(
                    rs.getInt("idProfesor"),
                    rs.getString("titulo"),
                    rs.getString("fechaContrato"),
                    curso,
                    aula,
                    rs.getInt("dni"),
                    rs.getString("nombres"),
                    rs.getString("apellidoP"),
                    rs.getString("apellidoM"),
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


    /*Create table Docente(
idProfesor VARCHAR(20) Primary key,
titulo VARCHAR(30),
fechaContrato VARCHAR(35),
id_persona int,
id_curso VARCHAR(20),
id_Aula VARCHAR(20),
id_Usuario int,
Foreign key (id_persona) REFERENCES Persona(dni),
Foreign key (id_curso) REFERENCES Curso(idCurso),
Foreign key (id_Aula) REFERENCES Aula(idAula),
Foreign key (id_Usuario) REFERENCES PersonaUsuario(idPersonaUsuario)
); */

    @Override
    public boolean actualizar(Docente docente) {
        String sql = "UPDATE Docente SET titulo = ?, fechaContrato = ? "+
                     "WHERE id_persona = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, docente.getTitulo());
            stmt.setString(2, docente.getFechaContrato());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean eliminar(int idProfesor) {
        String sql = "DELETE FROM Docente WHERE idProfesor = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idProfesor);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Docente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
