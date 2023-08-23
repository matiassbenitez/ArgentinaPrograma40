
package libreria.DAO;

import java.util.List;
import libreria.entidades.Libro;


public class LibroDAO extends DAO<Libro>{

        @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }
    
    @Override
    public void actualizar(Libro libro){
        super.actualizar(libro);
    }
    
    public void eliminar(Long isbn){
        Libro libro = buscarPorIsbn(isbn);
        super.eliminar(libro);
    }
    
    public Libro buscarPorIsbn(Long isbn){
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.isbn = :isbn") 
                .setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo){            //TENDRIA QUE RETORNAR UNA COLLECTION???
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :titulo ") 
                .setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }
    
    public List<Libro> buscarPorEditorial(String nombre){
        conectar();
        List<Libro> libros =  em.createQuery("SELECT a FROM Libro a WHERE a.editorial.nombre LIKE :nombre ") 
                .setParameter("nombre", "%" + nombre + "%").getResultList();
        desconectar();
        return libros;
    }
    public List<Libro> buscarPorAutor(String nombre){
        conectar();
        List<Libro> libros =  em.createQuery("SELECT a FROM Libro a WHERE a.autor.nombre LIKE :nombre ") 
                .setParameter("nombre", "%" + nombre + "%").getResultList();
        desconectar();
        return libros;
    }
    
      public List<Libro> listar(){
        conectar();
        List<Libro> libros =  em.createQuery("SELECT a FROM Libro a") 
                .getResultList();
        desconectar();
        return libros;
    }
    
}
