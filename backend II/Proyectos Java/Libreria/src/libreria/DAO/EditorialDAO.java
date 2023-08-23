
package libreria.DAO;


import java.util.List;
import libreria.entidades.Editorial;


public class EditorialDAO extends DAO<Editorial>{

     @Override
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
    
    @Override
    public void actualizar(Editorial editorial){
        super.actualizar(editorial);
    }
    
    public void eliminar(Integer id){
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    public Editorial buscarPorId(Integer id){
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id = :id") 
                .setParameter("id", id).getSingleResult();
        desconectar();
        return editorial;
    }
    
      public List<Editorial> listar(){
        conectar();
        List<Editorial> editoriales =  em.createQuery("SELECT a FROM Editorial a") 
                .getResultList();
        desconectar();
        return editoriales;
    }
    
}
