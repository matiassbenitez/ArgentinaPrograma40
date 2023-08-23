package libreria.persistencia;

import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import libreria.entidades.Cliente;
import libreria.entidades.Prestamo;

public class ClienteDAO extends DAO<Cliente> {

    public void agregarCliente(Cliente cliente) {
        agregar(cliente);
    }
    
    public void modificarCliente(Cliente cliente) {
        modificar(cliente);
    }
    
    public void eliminarCliente(Cliente cliente) {
        eliminar(cliente);
    }
    
    public Cliente buscarClientePorId(Integer id) {
        conectar();
        Cliente cliente = em.find(Cliente.class, id);
        desconectar();
        return cliente;
    }
    
    public List<Cliente> mostrarTodosLosClientes() {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        desconectar();
        return clientes;
    }
    
    public Cliente buscarClientePorDni(Long dni){
        conectar();
        Cliente cliente = em.find(Cliente.class, dni);
        desconectar();
        return cliente;
    }
    
    public List<Cliente> buscarClientePorNombre(String nombre) {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.nombre = :nombre", Cliente.class)
                .setParameter("nombre", nombre)
                .getResultList();
        desconectar();
        return clientes;
    }
    
    public List<Cliente> buscarClientePorApellido(String apellido) {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.apellido = :apellido", Cliente.class)
                .setParameter("apellido", apellido)
                .getResultList();
        desconectar();
        return clientes;
    }
    
     public Cliente buscarClientePorTelefono(String tel) {
        conectar();
        Cliente cliente = em.createQuery("SELECT c FROM Cliente c WHERE c.telefono = :telefono", Cliente.class)
                .setParameter("telefono", tel)
                .getSingleResult();               
        desconectar();
        return cliente;
    }
    
    
    public List<Cliente> buscarClientePorFechaPrestamo(Date fechaPrestamo) {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c INNER JOIN c.prestamos p WHERE p.fechaPrestamo = :fechaPrestamo", Cliente.class)
                .setParameter("fechaPrestamo", fechaPrestamo)
                .getResultList();
        desconectar();
        return clientes;
    }
    
    public List<Cliente> buscarClientePorFechaDevolucion(Date fechaDevolucion) {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c INNER JOIN c.prestamos p WHERE p.fechaDevolucion = :fechaDevolucion", Cliente.class)
                .setParameter("fechaDevolucion", fechaDevolucion)
                .getResultList();
        desconectar();
        return clientes;
    }

    public List<Prestamo> buscarPrestamosDeCliente(Cliente cliente) {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente = :cliente", Prestamo.class)
                .setParameter("cliente", cliente)
                .getResultList();
        desconectar();
        return prestamos;
    }
       
    public boolean existeCliente(Long dni){
        conectar();
        Query query = em.createNamedQuery("SELECT COUNT(c) FROM cliente c WHERE c.dni = :dni");
        query.setParameter("dni", dni);
        Long count = (Long)query.getSingleResult();        
        desconectar();
        return count > 0;
    }
    

}
