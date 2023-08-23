package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import persistencia.LibroDAO;

/**
 *
 * @author ALEXIS.R.L
 */
public class LibroServicio {
    
    private final LibroDAO dao;

    public LibroServicio() {
        this.dao = new LibroDAO();
    }
    
    public Libro crearLibro(String titulo,Integer anio,Integer ejemplares,Integer ejemplaresPrestados,Integer ejemplaresRestantes,boolean alta,Autor autor,Editorial editorial){
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(alta);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            dao.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
     public Libro buscarPorIsbn(long isbn) {
        try {
            return dao.buscarPorIsbn(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
     
    public Libro buscarPorTitulo(String titulo) {
        try {
            return dao.buscarPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro buscarPorAutorLibro(String autor) {
        try {
            return dao.buscarPorAutorLibro(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro buscarPorEditorialLibro(String editorial) {
        try {
            return dao.buscarPorEditorialLibro(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
