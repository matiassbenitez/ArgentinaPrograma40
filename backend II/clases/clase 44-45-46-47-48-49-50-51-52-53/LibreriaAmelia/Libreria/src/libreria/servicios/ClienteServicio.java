package libreria.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Prestamo;
import libreria.persistencia.ClienteDAO;

public class ClienteServicio {

    ClienteDAO cd = new ClienteDAO();

    public Cliente crearCliente() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cliente cliente = null;
        try {
            System.out.print("Ingrese el documento del cliente: ");
            Long dni = leer.nextLong();
            leer.nextLine();
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = leer.next();
            System.out.print("Ingrese el apellido del cliente: ");
            String apellido = leer.next();
            System.out.print("Ingrese el teléfono del cliente: ");
            String tel = leer.next();

            //Validaciones
            if (dni == null || nombre.isEmpty() || apellido.isEmpty() || tel.isEmpty()) {
                System.out.println("Error: Todos los campos son obligatorios. Vuelva a intentarlo.");
            } else if (cd.existeCliente(dni)) {
                System.out.println("Error: Ya existe un cliente con el mismo documento.Vuelva a intentarlo.");
            } else {
                // Crear cliente
                cliente = new Cliente(dni, nombre, apellido, tel);
                cd.agregarCliente(cliente);
                System.out.println("Cliente creado exitosamente");
            }
        } catch (Exception e) {
            System.out.println("Error: Se produjo una excepción durante la creación del cliente.");
            e.printStackTrace();

        } finally {
            leer.close();
        }
        return cliente;
    }
    
    
    public void mostarClientes(){
        List<Cliente> clientes = new ArrayList<>();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    
    public Cliente mostrarClientesPorId(Integer id) {
        return cd.buscarClientePorId(id);
    }
    
    public Cliente mostrarClientesPorDni(Long dni) {
        return cd.buscarClientePorDni(dni);
    } 
    
    public List<Cliente> mostrarClientesPorNombre(String nombre){
        return cd.buscarClientePorNombre(nombre);
    }
    
    public List<Cliente> mostrarClientePorApellido(String apellido){
        return cd.buscarClientePorApellido(apellido);
    }
    
    public Cliente mostrarClientePorTelefono(String telefono){
        return cd.buscarClientePorTelefono(telefono);
    }
    
    public List<Cliente> mostrarClientesPorFechaDePrestamo(Date fechaPrestamo){
        return cd.buscarClientePorFechaPrestamo(fechaPrestamo);
    }
    
    public List<Cliente> mostrarClientesPorFechaDeDevolucion(Date fechaDevolucion){
        return cd.buscarClientePorFechaDevolucion(fechaDevolucion);
    }
    
    public List<Prestamo> buscarPrestamosDeCliente(Cliente cliente) {
        return cd.buscarPrestamosDeCliente(cliente);
    }
    

}
