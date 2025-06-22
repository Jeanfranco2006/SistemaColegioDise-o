
package SistemaColegio.Modelo;

public class Alumno extends Persona{
    private String idAlumno;
    private String apoderado;
    private String grado;
    private String seccion;

    public Alumno() {
    }
    
    public Alumno(String idAlumno, String apoderado, String grado, String seccion, int dni, String Nombres, String ApellidoP, String ApellidM, 
            String FechaNacimiento, String Sexo, String direccion, int telefono, String email){
    super(dni, Nombres, ApellidoP, ApellidM, FechaNacimiento, Sexo, direccion, telefono, email);
        this.idAlumno = idAlumno;
        this.apoderado = apoderado;
        this.grado = grado;
        this.seccion = seccion;
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
}
