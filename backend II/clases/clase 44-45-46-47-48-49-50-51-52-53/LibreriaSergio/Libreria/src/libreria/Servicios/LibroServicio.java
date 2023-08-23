/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Servicios;

import libreria.Persistencia.LibroDAO;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

/**
 *
 * @author La Doble G
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
    
    public Libro editarLibro(Libro libro,int cod){
        try {
            if(cod==1){
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
            }else{
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()+1);
            }
            dao.editar(libro);
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
