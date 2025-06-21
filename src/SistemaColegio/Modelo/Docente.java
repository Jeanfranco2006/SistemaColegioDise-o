package SistemaColegio.Modelo;

import SistemaColegio.Interfaces.Asistencia;

public class Docente extends Persona implements Asistencia {

    private String idProfesor;
    private String titulo;
    private String fechaContrato;


    public Docente(String idProfesor, String titulo, String fechaContrato,
                   int dni, String nombres, String apellidoP, String apellidoM,
                   String fechaNacimiento, String sexo, String direccion,
                   int telefono, String email) {
        super(dni, nombres, apellidoP, apellidoM, fechaNacimiento, sexo, direccion, telefono, email);
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
    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
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
