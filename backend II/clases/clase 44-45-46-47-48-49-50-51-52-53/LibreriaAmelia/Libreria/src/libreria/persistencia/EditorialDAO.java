
package libreria.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;


public class EditorialDAO extends DAO<Editorial>{
    
    
    public void agregarEditorial(Editorial editorial){
        agregar(editorial);
    }
    
    public void modificarEditorial(Editorial editorial) {
        modificar(editorial);
    }

    public void eliminarEditorial(Editorial editorial) {
        eliminar(editorial);
    }
    
        
    public List<Editorial> listar() {
        try {
            conectar();
            List<Editorial> lista = em.createQuery("SELECT e from Editorial e").getResultList();
            return lista;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }
    
    public List<Editorial> listarInactivos() {
        try {
            conectar();
            TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e WHERE e.alta = false", Editorial.class);
            List<Editorial> lista = query.getResultList();
            return lista;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }
    

    public Editorial buscarPorId(int id) {
        Editorial editorial = null;
        if (id > 0) {
            try {
                conectar();
                editorial = em.find(Editorial.class, id);
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            } finally {
                desconectar();
            }
        } else {
            System.out.println("Error: el id no es válido.");
        }
        return editorial;
    }

    public Editorial buscarPorNombre(String nombre) {
        Editorial editorial = null;
        if (!nombre.trim().isEmpty()) {
            try {
                conectar();
                TypedQuery<Editorial> sentencia = em
                        .createQuery("SELECT e FROM Editorial e WHERE e.nombre=:valor", Editorial.class);
                sentencia.setParameter("valor", nombre);
                editorial = sentencia.getSingleResult();
            } catch (Exception e) {
                System.out.
                        println("Error:Hay varias coincidencias.");
                e.printStackTrace();
            } finally {
                desconectar();
            }
        }
        return null;
    }

    public List<Editorial> buscarPorNombreLista(String nombre) {
        List<Editorial> list = null;
        if (!nombre.trim().isEmpty()) {
            try {
                conectar();
                TypedQuery<Editorial> sentencia = em
                        .createQuery("SELECT e FROM Editorial e WHERE e.nombre=:valor", Editorial.class);
                sentencia.setParameter("valor", nombre);
                list = sentencia.getResultList();
            } catch (Exception e) {
                System.out.println("Error:");
                e.printStackTrace();
            } finally {
                desconectar();
            }
        }
        return list;
    }
  
    
    
    
    
}
