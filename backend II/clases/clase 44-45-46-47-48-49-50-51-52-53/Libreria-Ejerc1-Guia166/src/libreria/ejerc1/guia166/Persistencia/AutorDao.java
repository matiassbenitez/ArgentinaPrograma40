/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166.Persistencia;

import libreria.ejerc1.guia166.Entidad.Autor;

/**
 *
 * @author Juan Luna
 */
public class AutorDao extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) {
        Autor autor = this.buscarPorId(id);
        super.eliminar(autor);
    }

    public Autor buscarPorId(Integer id) {
        super.conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id =: dni ").setParameter("dni", id).getSingleResult();
        super.desconectar();
        return autor;
    }
    public Autor buscarPorNombre(String nombre) {
        super.conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        super.desconectar();
        return autor;
    }
    public void editar(Autor autor) {
        super.guardar(autor);
    }

}
