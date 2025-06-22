package SistemaColegio.Interfaces;
import java.util.List;
public interface Dao<T> {
   
    boolean registrar(T t);
    T consultarPorId(int id);
    boolean actualizar(T t);
    boolean eliminar(int id);
    List<T> listarTodos();
}

