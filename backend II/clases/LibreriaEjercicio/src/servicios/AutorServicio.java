package servicios;

import entidades.Autor;
import java.util.List;
import persistencia.AutorDAO;

/**
 *
 * @author ALEXIS.R.L
 */
public class AutorServicio {
    
    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }
    
    public Autor crearAutor(String nombre,Boolean alta){
       Autor autor = new Autor();
       try {
            autor.setNombre(nombre);
            autor.setAlta(alta);
            DAO.guardar(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Autor buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Autor buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public List<Autor> listarAutor() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
