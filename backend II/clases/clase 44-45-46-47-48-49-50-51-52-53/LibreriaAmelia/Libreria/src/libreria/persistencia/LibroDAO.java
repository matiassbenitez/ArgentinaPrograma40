package libreria.persistencia;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    public void agregarLibro(Libro libro) {
        if (libro != null && libro.getTitulo() != null && libro.getAutor() != null && libro.getEditorial() != null) {
            if (!existeLibro(libro.getIsbn())) {
                agregar(libro);
            } else {
                System.out.println("Error: El libro con ISBN " + libro.getIsbn() + " ya existe en la base de datos.");
            }
        } else {
            System.out.println("Error: Todos los campos (título, autor, editorial) son obligatorios.");
        }
    }

    public void editarLibro(Libro libro) {
        if (libro != null) {
            modificar(libro);

        } else {
            System.out.println("Error: Todos los campos (título, autor, editorial) son obligatorios.");
        }
    }

    public void eliminarLibro(Libro libro) {
        if (libro != null && libro.getId() != null) {
            eliminar(libro);

        } else {
            System.out.println("Error: El libro no es válido.");
        }
    }

    public void darDeAlta(Libro libro) {
        libro.setAlta(true);
        modificar(libro);
    }

    public void darDeBaja(Libro libro) {
        libro.setAlta(false);
        modificar(libro);
    }

    public List<Libro> listar() {
        try {
            conectar();
            List<Libro> lista = em.createQuery("SELECT l from Libro l").getResultList();
            return lista;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }

    public List<Libro> listarInactivos() {
        try {
            conectar();
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.alta = false", Libro.class);
            List<Libro> lista = query.getResultList();
            return lista;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            return null;
        } finally {
            desconectar();
        }
    }

    //9) Búsqueda de un libro por ISBN.
    public Libro buscarPorISBN(Long isbn) {
        Libro libro = null;
        if (isbn != null && isbn > 0) {
            try {
                conectar();
                Query query = em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn", Libro.class);
                query.setParameter("isbn", isbn);
                libro = (Libro) query.getSingleResult();
            } catch (Exception e) {
                System.out.println("Error de Sistema");
                e.printStackTrace();
            } finally {
                desconectar();
            }
            return libro;
        } else {
            System.out.println("Error: el ISBN no es válido");
        }
        return libro;
    }

    //Buscar por Id
    public Libro buscarPorId(int id) {
        Libro libro = null;
        if (id > 0) {
            try {
                conectar();
                libro = em.find(Libro.class, id);
            } catch (Exception e) {
                System.out.println("Error de Sistema");
                e.printStackTrace();
            } finally {
                desconectar();
            }
            return libro;
        } else {
            System.out.println("Error: el ID no es válido");
        }
        return libro;
    }

    //10) Búsqueda de un libro por Título.
    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> libros = null;
        try {
            conectar();
            TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo", Libro.class);
            query.setParameter("titulo", titulo);
            libros = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return libros;
    }

    //11) Búsqueda de un libro/s por nombre de Autor
    public List<Libro> buscarPorAutor(String nombreAutor) {
        List<Libro> lista = null;
        try {
            conectar();
            TypedQuery<Libro> query = em.createNamedQuery("Libro.buscarPorNombreAutor", Libro.class);
            query.setParameter("nombre", nombreAutor);
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return lista;
    }

    //12) Búsqueda de un libro/s por nombre de Editorial.
    public List<Libro> buscarPorEditorial(String nombreEditorial) {
        List<Libro> lista = null;
        try {
            conectar();
            TypedQuery<Libro> query = em.createNamedQuery("Libro.buscarPorEditorial", Libro.class);
            query.setParameter("nombreEditorial", nombreEditorial);
            lista = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return lista;
    }

    private boolean existeLibro(Long isbn) {
        try {
            conectar();
            TypedQuery<Long> query = em.createQuery("SELECT COUNT(l) FROM Libro l WHERE l.isbn = :isbn", Long.class);
            query.setParameter("isbn", isbn);
            Long count = query.getSingleResult();
            return count > 0;
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            desconectar();
        }
        return false;
    }

    public void prestarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("Error: El libro es nulo.");
            return;
        }

        if (libro.getEjemplaresRestantes() <= 0) {
            System.out.println("Error: No hay ejemplares disponibles para prestar.");
            return;
        }
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
        modificar(libro);
    }

}
