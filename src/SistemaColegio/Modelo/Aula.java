
package SistemaColegio.Modelo;

public class Aula {
    private String idAula;
    private int numeroAula;
    private int capacidad;
    private char estado;

    public Aula() {
    }
    
    public Aula(String idAula, int numeroAula, int capacidad, char estado) {
        this.idAula = idAula;
        this.numeroAula = numeroAula;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
