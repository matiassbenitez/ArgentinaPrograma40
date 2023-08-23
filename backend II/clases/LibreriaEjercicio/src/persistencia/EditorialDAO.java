package persistencia;

import entidades.Editorial;
import java.util.List;

/**
 *
 * @author ALEXIS.R.L
 */
public class EditorialDAO extends DAO<Editorial>{
    
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
    public void eliminar(Integer id) {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    public Editorial buscarPorId(Integer id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id = :id")
                .setParameter("id", id).getSingleResult();
        System.out.println(editorial.toString());
        desconectar();
        return editorial;
    }
    
    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editorial = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        desconectar();
        return editorial;
    }
}
