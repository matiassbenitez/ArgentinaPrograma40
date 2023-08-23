package persistencia;

import entidades.Autor;
import java.util.List;

/**
 *
 * @author ALEXIS.R.L
 */
public class AutorDAO extends DAO<Autor>{
    
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    public void eliminar(Integer id) {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }
    
    public Autor buscarPorId(Integer id) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        System.out.println(autor.toString());
        desconectar();
        return autor;
    }
    
    public List<Autor> listarTodos() {
        conectar();
        List<Autor> autor = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        desconectar();
        return autor;
    }
    
    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE '%" + nombre + "%'").getSingleResult();
        System.out.println(autor.toString());
        System.out.println("");
        desconectar();
        return autor;
    }
}
