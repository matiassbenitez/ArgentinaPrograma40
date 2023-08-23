
package libreria.servicios;

import java.util.List;
import libreria.DAO.LibroDAO;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;


public class LibroService {

    LibroDAO dao = new LibroDAO();
    
    public Libro altaLibro(Long isbn, String titulo, Integer anio, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial){
        Libro libro = new Libro();
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setEjemplares(ejemplaresRestantes+ejemplaresPrestados);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setAlta(Boolean.TRUE);
        dao.guardar(libro);
        return libro;
    }
    
    public void bajaLibro(Libro libro){
        libro.setAlta(Boolean.FALSE);
        dao.actualizar(libro);
    }
    
       public List<Libro> listarLibros(){
        List<Libro> libros = dao.listar();
        return libros;
    } 
    
       public Libro buscarPorIsbn(Long isbn){
           Libro libro = dao.buscarPorIsbn(isbn);
           return libro;
       }
       
       public Libro buscarPorTitulo(String titulo){
           Libro libro = dao.buscarPorTitulo(titulo);
           return libro;
       }
       
       public List<Libro> buscarPorAutor(String nombre){
           List<Libro> libros = dao.buscarPorAutor(nombre);
           return libros;
       }
       
       public List<Libro> buscarPorEditorial(String nombre){
           List<Libro> libros = dao.buscarPorEditorial(nombre);
           return libros;
       }
}
