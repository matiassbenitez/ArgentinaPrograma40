/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166.Persistencia;

import libreria.ejerc1.guia166.Entidad.Editorial;
import libreria.ejerc1.guia166.Entidad.Libro;

/**
 *
 * @author Juan Luna
 */
public class LibroDao extends DAO<Libro>{
            @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Long id) {
        Libro libro = this.buscarPorId(id);
        super.eliminar(libro);
    }

    public Libro buscarPorId(Long id) {
        super.conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.id LIKE :id ").setParameter("id", id).getSingleResult();
        super.desconectar();
        return libro;
    }
    public Libro buscarPorNombre(String nombre){
        super.conectar();
        Libro libro =(Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        super.desconectar();
        return libro;
    }
    public void editar(Libro libro) {
        super.guardar(libro);
    }
   public Libro buscarUnLibroPorAutor(String nombre){
       super.conectar();
       Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre").setParameter("nombre", nombre);
       super.desconectar();
       return libro;
       
   }
     
}
