package SistemaColegio.Modelo;

import SistemaColegio.Interfaces.Asistencia;
import SistemaColegio.Interfaces.IMatricula;

public class Admin implements Asistencia, IMatricula {

    private int idAdmin;
    private String usuario;
    private String contraseña;

    public Admin() {
    }

    public Admin(int idAdmin, String usuario, String contraseña) {
        this.idAdmin = idAdmin;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    //Interface Asistencia
    @Override
    public void registrarAsistencia() {

    }

    @Override
    public void reporteAsistencia() {

    }
    
    //Interface Matricula
    @Override
    public void gestionarMatricula() {
        
    }

    @Override
    public void ReporteMatricula() {
        
    }
    
    //Metodos get y set
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
