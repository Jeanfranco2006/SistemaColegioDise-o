
package SistemaColegio.Modelo;

public class Horario {
    private String idHorario;
    private String diaSemana;
    private String horaEntrada;
    private String horaSalida;
    private Aula aula;

    public Horario() {
    }
    
    public Horario(String idHorario, String diaSemana, String horaEntrada, 
            String horaSalida, Aula aula) {
        this.idHorario = idHorario;
        this.diaSemana = diaSemana;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.aula = aula;
    }

    public void verDisponibilidad(){
        
    }
    
    //Metodo get y set
    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
}
