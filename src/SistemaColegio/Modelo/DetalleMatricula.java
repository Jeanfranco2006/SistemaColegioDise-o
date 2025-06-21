
package SistemaColegio.Modelo;

public class DetalleMatricula {
    private Matricula matricula;
    private Curso curso;
    
    public DetalleMatricula() {
    }
    
    public DetalleMatricula(Matricula matricula, Curso curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
