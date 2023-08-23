/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Servicios;

import libreria.Persistencia.ClienteDAO;
import libreria.entidades.Cliente;

/**
 *
 * @author La Doble G
 */
public class ClienteServicio {
    
    private final ClienteDAO daoC;

    public ClienteServicio() {
        this.daoC = new ClienteDAO();
    }
    
    public Cliente crearCliente(long documento,String nombre,String apellido,String telefono){
       Cliente cliente = new Cliente();
       try {
           cliente.setDocumento(documento);
           cliente.setNombre(nombre);
           cliente.setApellido(apellido);
           cliente.setTelefono(telefono);
           daoC.guardar(cliente);
           return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Cliente buscarPorId(Integer id) {
        try {
            return daoC.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
