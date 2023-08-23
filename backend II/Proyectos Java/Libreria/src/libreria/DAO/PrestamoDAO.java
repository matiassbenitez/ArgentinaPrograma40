
package libreria.DAO;

import java.util.List;
import libreria.entidades.Prestamo;


public class PrestamoDAO extends DAO<Prestamo> {

         @Override
    public void guardar(Prestamo prestamo){
        super.guardar(prestamo);
    }
    
    @Override
    public void actualizar(Prestamo prestamo){
        super.actualizar(prestamo);
    }
    
    public void eliminar(Integer id){
        Prestamo prestamo = buscarPorId(id);
        super.eliminar(prestamo);
    }
    
    public Prestamo buscarPorId(Integer id){
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT a FROM Prestamo a WHERE a.id = :id") 
                .setParameter("id", id).getSingleResult();
        desconectar();
        return prestamo;
    }
    
      public List<Prestamo> listar(){
        conectar();
        List<Prestamo> prestamos =  em.createQuery("SELECT a FROM Prestamo a") 
                .getResultList();
        desconectar();
        return prestamos;
    }
    
}
