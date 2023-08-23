/*
Al alumno le toca desarrollar, las siguientes funcionalidades:
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
• Validar campos obligatorios.
• No ingresar datos duplicados.

1) Al alumno le toca desarrollar, las siguientes funcionalidades:
3) Crear entidad Préstamo
4) Registrar el préstamo de un libro.
5) Devolución de un libro
6) Búsqueda de todos los préstamos de un Cliente.
*/
package libreria;

import libreria.DAO.AutorDAO;
import libreria.DAO.DAO;
import libreria.DAO.EditorialDAO;
import libreria.DAO.LibroDAO;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.PrestamoService;



public class Libreria {

    public static void main(String[] args) {
        
        //PrestamoService ps = new PrestamoService();
        DAO dao = new DAO();
        //AutorDAO as = new AutorDAO();
        //EditorialDAO ed = new EditorialDAO();
        //LibroDAO ld = new LibroDAO();
        try {
//            Autor autor = new Autor(1, "Matias", true);
//            Editorial editorial = new Editorial();
//            editorial.setAlta(Boolean.TRUE);
//            editorial.setNombre("Hola");
//            Libro libro = new Libro();
//            libro.setAlta(Boolean.TRUE);
//            libro.setAnio(1985);
//            libro.setAutor(autor);
//            libro.setEditorial(editorial);
//            libro.setEjemplares(100);
//            libro.setEjemplaresPrestados(30);
//            libro.setEjemplaresRestantes(70);
//            libro.setIsbn(Long.MIN_VALUE);
//            libro.setTitulo("Chau");
            //as.guardar(autor);
           //ed.guardar(editorial);
            //ld.guardar(libro);
            //System.out.println(ld.buscarPorNombre("Chau"));
            //System.out.println(ld.buscarPorEditorial("Hol"));
        } catch (Exception e) {
        }
        
    }

}
