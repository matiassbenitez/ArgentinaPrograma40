/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.ejerc1.guia166.Persistencia;

import libreria.ejerc1.guia166.Entidad.Autor;
import libreria.ejerc1.guia166.Entidad.Editorial;

/**
 *
 * @author Juan Luna
 */
public class EditorialDao extends DAO<Editorial> {
        @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(Integer id) {
        Editorial editorial = this.buscarPorId(id);
        super.eliminar(editorial);
    }

    public Editorial buscarPorId(Integer id) {
        super.conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id =: id ").setParameter("id", id);
        super.desconectar();
        return editorial;
    }
       public Editorial buscarPorNombre(String nombre) {
        super.conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        super.desconectar();
        return editorial;
    }
    public void editar(Editorial editorial) {
        super.guardar(editorial);
    }
}
