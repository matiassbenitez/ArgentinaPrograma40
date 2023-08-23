
package libreria.servicios;

import java.util.List;
import libreria.DAO.ClienteDAO;
import libreria.entidades.Cliente;


public class ClienteService {

    ClienteDAO dao = new ClienteDAO();
    
    public Cliente altaCliente(Long documento, String nombre, String apellido, String telefono){
        Cliente cliente = new Cliente();
        cliente.setApellido(apellido);
        cliente.setDocumento(documento);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        dao.guardar(cliente);
        return cliente;
    }
    
    public void bajaCliente(Cliente cliente){
        dao.eliminar(cliente.getId());
    }
    
       public List<Cliente> listarAutores(){
        List<Cliente> clientes = dao.listar();
        return clientes;
    } 
    
}
