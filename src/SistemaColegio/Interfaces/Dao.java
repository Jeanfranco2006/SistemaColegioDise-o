/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaColegio.Interfaces;
import java.util.List;
public interface Dao<T> {
   
    boolean registrar(T t);
    T consultarPorId(int id);
    boolean actualizar(T t);
    boolean eliminar(int id);
    List<T> listarTodos();
}

