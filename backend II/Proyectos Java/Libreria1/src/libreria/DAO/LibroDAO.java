
package libreria.DAO;

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
    
}
