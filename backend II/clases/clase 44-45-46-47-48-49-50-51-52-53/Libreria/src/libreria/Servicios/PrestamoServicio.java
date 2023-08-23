/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.Servicios;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import libreria.Persistencia.PrestamoDAO;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

/**
 *
 * @author La Doble G
 */
public class PrestamoServicio {
    
    private final PrestamoDAO daoP;

    public PrestamoServicio() {
        this.daoP = new PrestamoDAO();
    }

    public Prestamo registrarPrestamo(Date fechaPrestamo, Date fechaDevolucion,Libro libro,Cliente cliente){
       Prestamo prestamo = new Prestamo();
       LibroServicio liServ = new LibroServicio();
       
       try {
           prestamo.setFechaPrestamo(fechaPrestamo);
           prestamo.setFechaDevolucion(fechaDevolucion);
           prestamo.setLibro(libro);
           prestamo.setCliente(cliente);
           liServ.editarLibro(libro,1);
           daoP.guardar(prestamo);
           return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //falta terminar!!
    public Prestamo devolverPrestamo(Prestamo prestamo){
       LibroServicio liServ = new LibroServicio();
       
       try {
           prestamo.setFechaDevolucion(new Date(123,7,5));
           liServ.editarLibro(prestamo.getLibro(), 2);
           daoP.editar(prestamo);
           return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo buscarPorId(Integer id) {
        try {
            return daoP.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Prestamo> buscarPorPrestCliente(long dni) {
        try {
            
            return daoP.buscarPorPrestCliente(dni);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
