package SistemaColegio.Modelo;

public class Curso {

    private String idCurso;
    private String nombre;
    private String grado;
    private char estado;
    

    public Curso() {
    }
    
    public Curso(String idCurso, String grado, String nombre, char estado) {
        this.idCurso = idCurso;
        this.grado = grado;
        this.nombre = nombre;
        this.estado = estado;
    }

    public void agregarEstudiante(){
        
    }
    
    public void agregarDocente(){
        
    }
    
    //Metodos get y set
    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
