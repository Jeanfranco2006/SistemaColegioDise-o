
package SistemaColegio.Controlador;

import SistemaColegio.Modelo.Admin;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chamo
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String [] args) {
    UsuarioDAO dao = new UsuarioDAO();
    List<Admin> admins = dao.listarTodos();

    for (Admin a : admins) {
        System.out.println("id: " + a.getIdAdmin());
        System.out.println("usuario: " + a.getUsuario());
        System.out.println("contraseña: " + a.getContraseña());
        System.out.println("-------------");
    }
    
      
    
    
}
}
