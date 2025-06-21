
package SistemaColegio.Modelo;

import java.util.Date;

public class Alumno {
    private String idAlumno;
    private String apoderado;
    private String nombres;
    private String ApellidoP;
    private String ApellidoM;
    private String sexo;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
    private char estado;

    public Alumno() {
    }
    
    public Alumno(String idAlumno, String apoderado, String nombres, String ApellidoP, String ApellidoM,
                  String sexo, String telefono, String direccion, Date fechaNacimiento, char estado) {
        this.idAlumno = idAlumno;
        this.apoderado = apoderado;
        this.nombres = nombres;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    public void verHorario(){
        
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

  

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
