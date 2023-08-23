/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.ejerc1.guia166.Entidad.Editorial;
import libreria.ejerc1.guia166.Entidad.Libro;
import libreria.ejerc1.guia166.Servicio.AutorServicio;
import libreria.ejerc1.guia166.Servicio.EditorialServicio;
import libreria.ejerc1.guia166.Servicio.LibroServicio;

/**
 *
 * @author Juan Luna
 */
public class LibreriaEjerc1Guia166 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Libreria-Ejerc1-Guia166PU");
        EntityManager em = EMF.createEntityManager();
        AutorServicio svA = new AutorServicio();
        LibroServicio svL = new LibroServicio();
        EditorialServicio svE = new EditorialServicio();

        /*
    8.svA.crearAutor();
    8.System.out.println( svA.BuscarPorNombre()); id 51,Juan Franco Luna
        -------------------------------------------
    9) Búsqueda de un libro por ISBN.
        Este sout, se utiliza para ejecutar el metodo buscarLibroPorId;
        System.out.println(svE.BuscarPorNombre());
        svL.setServicios(svA, svE);
        Libro libro = svL.crearLibro();
         svL.buscarPorISBN();
        -------------------------------------------
        -------------------------------------------
    10) Búsqueda de un libro por Título.
           svL.buscarPorNombre();
        -------------------------------------------
        -------------------------------------------
        11) Búsqueda de un libro/s por nombre de Autor.
        
        -------------------------------------------
    Editorial.Autor
    svE.crearEditorial();
         */

   svL.buscarPorNombre();
      
    }
}
