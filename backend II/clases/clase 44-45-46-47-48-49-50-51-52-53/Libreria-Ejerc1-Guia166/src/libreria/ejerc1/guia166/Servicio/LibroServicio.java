/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166.Servicio;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.ejerc1.guia166.Entidad.Autor;
import libreria.ejerc1.guia166.Entidad.Editorial;
import libreria.ejerc1.guia166.Entidad.Libro;
import libreria.ejerc1.guia166.Persistencia.AutorDao;
import libreria.ejerc1.guia166.Persistencia.EditorialDao;
import libreria.ejerc1.guia166.Persistencia.LibroDao;


/**
 *
 * @author Juan Luna
 */
public class LibroServicio {
    /*
        private LibroDao dao;

    public LibroServicio() {
        this.dao = new LibroDao();
    }
    private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Libreria-Ejerc1-Guia166PU");
    private EntityManager em = EMF.createEntityManager();
    */
  
private LibroDao dao;
private AutorServicio autorServicio;
private EditorialServicio editorialServicio;
  
    public LibroServicio() {
        this.dao = new LibroDao();
    }
    public void setServicios(AutorServicio autorServicio,EditorialServicio editorialServicio){
        this.autorServicio = autorServicio ;
        this.editorialServicio = editorialServicio;
    }
    public Libro crearLibro(){
        Libro libro = new Libro();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        try {
           /*
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;
            */
            System.out.println("Ingrese titulo: ");
            String titulo = entrada.next();
            System.out.println("Sout anio: ");
            Integer anio = entrada.nextInt();
            System.out.println("Cantidad total de ejemplares: ");
            Integer ejemplares = entrada.nextInt();
            System.out.println("Ejemplares prestados");
            Integer ejemplaresPrestados = entrada.nextInt();
            System.out.println("Ejemplares restantes a prestar: ");
            Integer ejemplaresRestantes = entrada.nextInt();
            Boolean alta = true;
            Editorial editorial = editorialServicio.BuscarPorNombre();
            Autor autor = autorServicio.BuscarPorNombre();
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAutor(autor);
            libro.setAlta(alta);
            libro.setEditorial(editorial);
            dao.guardar(libro);
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }
    public void buscarPorISBN(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el id del libro: ");
        Long id = entrada.nextLong();
        Libro libro = dao.buscarPorId(id);
        System.out.println(libro);  
    }
    public void buscarPorNombre(){
         Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del libro a buscar: ");
        String nombre = entrada.next();
        Libro libro = dao.buscarPorNombre(nombre);
        System.out.println(libro);
       
        
    }
    /*
    11) Búsqueda de un libro/s por nombre de Autor.
    */
    public void busquedaDeLibroPorAutor(){
         Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre del autor: ");
        String nombreAutor = entrada.next();
        Libro libro = dao.buscarUnLibroPorAutor(nombreAutor);
        System.out.println(libro);
    }
}
