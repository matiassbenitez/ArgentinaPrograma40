
package libreria.DAO;

import java.util.List;
import libreria.entidades.Cliente;


public class ClienteDAO extends DAO<Cliente> {

        @Override
    public void guardar(Cliente cliente){
        super.guardar(cliente);
    }
    
    @Override
    public void actualizar(Cliente cliente){
        super.actualizar(cliente);
    }
    
    public void eliminar(Integer id){
        Cliente cliente = buscarPorId(id);
        super.eliminar(cliente);
    }
    
    public Cliente buscarPorId(Integer id){
        conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT a FROM Cliente a WHERE a.id = :id") 
                .setParameter("id", id).getSingleResult();
        desconectar();
        return cliente;
    }
    
    public List<Cliente> listar(){
        conectar();
        List<Cliente> clientes =  em.createQuery("SELECT a FROM Cliente a") 
                .getResultList();
        desconectar();
        return clientes;
    }
   
    
}
