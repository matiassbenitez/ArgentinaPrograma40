package persistencia;

import entidades.Libro;
import java.util.List;

/**
 *
 * @author ALEXIS.R.L
 */
public class LibroDAO extends DAO<Libro>{
    public void guardar(Libro libro) {
        super.guardar(libro);
    }
    
    public void eliminar(long isbn) {
        Libro libro = buscarPorIsbn(isbn);
        super.eliminar(libro);
    }
    
    public Libro buscarPorIsbn(long isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        System.out.println(libro.toString());
        System.out.println("");
        desconectar();
        return libro;
    }
    
    public List<Libro> listarTodos() {
        conectar();
        List<Libro> libro = em.createQuery("SELECT l FROM Libro l")
                .getResultList();
        desconectar();
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE '%" + titulo + "%'").getSingleResult();
        System.out.println(libro.toString());
        System.out.println("");
        desconectar();
        return libro;
    }
    
    public Libro buscarPorAutorLibro(String autor) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.autor "
                + "a WHERE a.nombre LIKE '%" + autor + "%'").getSingleResult();
        System.out.println(libro.toString());
        System.out.println("");
        desconectar();
        return libro;
    }
    
    public Libro buscarPorEditorialLibro(String editorial) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.editorial "
                + "e WHERE e.nombre LIKE '%" + editorial + "%'").getSingleResult();
        System.out.println(libro.toString());
        System.out.println("");
        desconectar();
        return libro;
    }
}
