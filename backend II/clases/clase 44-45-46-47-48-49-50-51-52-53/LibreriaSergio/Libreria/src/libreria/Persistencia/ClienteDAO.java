/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Persistencia;

import libreria.entidades.Cliente;

/**
 *
 * @author La Doble G
 */
public class ClienteDAO extends DAO<Cliente>{
    
    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente);
    }
    
    public void eliminar(Integer id) {
        Cliente cliente = buscarPorId(id);
        super.eliminar(cliente);
    }
    
    public Cliente buscarPorId(Integer id) {
        conectar();
        Cliente cliente = (Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.id = :id")
                .setParameter("id", id).getSingleResult();
        System.out.println(cliente.toString());
        desconectar();
        return cliente;
    }
}
