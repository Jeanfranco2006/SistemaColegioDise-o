
package SistemaColegio.Modelo;

import java.util.Date;

public class Matricula {
    private String idMatricula;
    private String periodoAcademico;
    private Date fecha;
    private char estado;

    public Matricula() {
    }
    
    public Matricula(String idMatricula, String periodoAcademico, Date fecha, char estado) {
        this.idMatricula = idMatricula;
        this.periodoAcademico = periodoAcademico;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public void reporteComprobante(){
        
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
