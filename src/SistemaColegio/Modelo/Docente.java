package SistemaColegio.Modelo;

import SistemaColegio.Interfaces.Asistencia;

public class Docente extends Persona implements Asistencia {

    private int idProfesor;
    private String titulo;
    private String fechaContrato;
    private Curso id_curso;
    private Aula id_aula;

    public Docente(int idProfesor, String titulo, String fechaContrato, Curso id_curso, Aula id_aula,
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

    
    public void asignarNotas() {

    }

    public void reporteAcademico() {

    }

    @Override
    public void registrarAsistencia() {
        
    }

    @Override
    public void reporteAsistencia() {
        
    }

    //Metodos get y set
    public Curso getId_curso() {
        return id_curso;
    }
    public void setId_curso(Curso id_curso) {
        this.id_curso = id_curso;
    }
    public Aula getId_aula() {
        return id_aula;
    }
    public void setId_aula(Aula id_aula) {
        this.id_aula = id_aula;
    }
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

}
