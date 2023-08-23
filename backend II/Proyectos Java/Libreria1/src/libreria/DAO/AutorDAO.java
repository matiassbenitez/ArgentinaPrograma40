
package libreria.DAO;

import libreria.entidades.Autor;


public class AutorDAO extends DAO<Autor>{
    
    @Override
    public void guardar(Autor autor){
        super.guardar(autor);
    }
    
    @Override
    public void actualizar(Autor autor){
        super.actualizar(autor);
    }
    
    public void eliminar(Integer id){
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }
    
    public Autor buscarPorId(Integer id){
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id") 
                .setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }
   
}
