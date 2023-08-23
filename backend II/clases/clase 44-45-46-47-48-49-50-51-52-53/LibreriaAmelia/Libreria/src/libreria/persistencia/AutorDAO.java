package libreria.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Autor;

public final class AutorDAO extends DAO<Autor> {

    public void agregarAutor(Autor autor) {
        agregar(autor);
    }

    public void modificarAutor(Autor autor) {
        modificar(autor);
    }

    public void eliminarAutor(Autor autor) {
        eliminar(autor);
    }

    //Lista de autores activos (alta=true)
    public List<Autor> listar() {
        try {
            conectar();
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.alta = true", Autor.class);
            List<Autor> lista = query.getResultList();
            return lista;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }

    public List<Autor> listarInactivos() {
        try {
            conectar();
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.alta = false", Autor.class);
            List<Autor> lista = query.getResultList();
            return lista;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }

    public Autor buscarPorId(int id) {
        Autor autor = null;
        if (id > 0) {
            try {
                conectar();
                autor = em.find(Autor.class, id);               
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            } finally {
                desconectar();
            }
        } else {
            System.out.println("Error: el id no es válido.");
        }
        return autor;
    }

    public Autor buscarPorNombre(String nombre) {
        Autor autor = null;
        if (!nombre.trim().isEmpty()) {
            try {
                conectar();
                TypedQuery<Autor> sentencia = em
                        .createQuery("SELECT a FROM Autor a WHERE a.nombre=:valor", Autor.class);
                sentencia.setParameter("valor", nombre);
                autor = sentencia.getSingleResult();
            } catch (Exception e) {
                System.out.println("Error:Hay varias coincidencias.");
                e.printStackTrace();
            } finally {
                desconectar();
            }
        }
        return null;
    }

    public List<Autor> buscarPorNombreLista(String nombre) {
        List<Autor> list = null;
        if (!nombre.trim().isEmpty()) {
            try {
                conectar();
                TypedQuery<Autor> sentencia = em
                        .createQuery("SELECT a FROM Autor a WHERE a.nombre=:valor", Autor.class);
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
