
package SistemaColegio.Modelo;

public class Programacion {
    private String idProgramacion;
    private Horario horario;
    private Aula aula;
    private char estado;

    public Programacion() {
    }
    
    public Programacion(String idProgramacion, Horario horario, Aula aula, char estado) {
        this.idProgramacion = idProgramacion;
        this.horario = horario;
        this.aula = aula;
        this.estado = estado;
    }

    public String getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(String idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}