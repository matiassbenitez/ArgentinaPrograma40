/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author La Doble G
 */
public class AutorDAO extends DAO<Autor>{
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }
    
    public void eliminar(Integer id) {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }
    
    public Autor buscarPorId(Integer id) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        System.out.println(autor.toString());
        desconectar();
        return autor;
    }
    
    public List<Autor> listarTodos() {
        conectar();
        List<Autor> autor = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        desconectar();
        return autor;
    }
    
    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE '%" + nombre + "%'").getSingleResult();
        System.out.println(autor.toString());
        System.out.println("");
        desconectar();
        return autor;
    }
}
