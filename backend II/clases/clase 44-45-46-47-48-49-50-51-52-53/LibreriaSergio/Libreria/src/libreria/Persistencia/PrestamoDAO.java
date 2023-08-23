/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Persistencia;

import java.util.List;
import libreria.entidades.Prestamo;

/**
 *
 * @author La Doble G
 */
public class PrestamoDAO extends DAO<Prestamo>{
    
    @Override
    public void guardar(Prestamo prestamo) {
        super.guardar(prestamo);
    }
    
    public void eliminar(Integer id) {
        Prestamo prestamo = buscarPorId(id);
        super.eliminar(prestamo);
    }
    
    public Prestamo buscarPorId(Integer id) {
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery("SELECT p FROM Prestamo p WHERE p.id = :id")
                .setParameter("id", id).getSingleResult();
        System.out.println(prestamo.toString());
        desconectar();
        return prestamo;
    }
    
    public void editar(Prestamo prestamo) {
        super.editar(prestamo);
    }
    
    public List<Prestamo> buscarPorPrestCliente(long dni) {
        conectar();
        List<Prestamo> prest = em.createQuery("SELECT p FROM Prestamo p JOIN p.cliente "
                + "c WHERE c.documento = " + dni + "").getResultList();
        System.out.println("");
        System.out.println(prest.toString());
        System.out.println("");
        desconectar();
        return prest;
    }
}
