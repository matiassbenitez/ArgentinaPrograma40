/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author La Doble G
 */
public class EditorialDao extends DAO<Editorial>{
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
    public void eliminar(Integer id) {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    
    public Editorial buscarPorId(Integer id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id = :id")
                .setParameter("id", id).getSingleResult();
        System.out.println(editorial.toString());
        desconectar();
        return editorial;
    }
    
    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editorial = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        desconectar();
        return editorial;
    }
}
