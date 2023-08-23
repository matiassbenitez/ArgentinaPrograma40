
package libreria.servicios;

import java.util.Date;
import java.util.List;
import libreria.DAO.PrestamoDAO;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;


public class PrestamoService {

    PrestamoDAO dao = new PrestamoDAO();
    
    public Prestamo altaPrestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente){
        Prestamo prestamo = new Prestamo();
        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setFechaDevolucion(fechaDevolucion);
        prestamo.setLibro(libro);
        prestamo.setCliente(cliente);
        dao.guardar(prestamo);
        return prestamo;
    }
    
    public void bajaPrestamo(Prestamo prestamo){
        dao.eliminar(prestamo.getId());
    }
    
       public List<Prestamo> listarAutores(){
        List<Prestamo> prestamos = dao.listar();
        return prestamos;
    } 
       
      public void registrarPrestamo(Prestamo prestamo){
          if (prestamo.getLibro().getEjemplaresRestantes()>0) {
          prestamo.getLibro().setEjemplaresPrestados(prestamo.getLibro().getEjemplaresPrestados()+1);
          prestamo.getLibro().setEjemplaresRestantes(prestamo.getLibro().getEjemplaresRestantes()-1);
          }
      }
      
      public void registrarDevolucion(Prestamo prestamo){
          if (prestamo.getLibro().getEjemplaresPrestados()>0) {
          prestamo.getLibro().setEjemplaresRestantes(prestamo.getLibro().getEjemplaresRestantes()+1);
          prestamo.getLibro().setEjemplaresPrestados(prestamo.getLibro().getEjemplaresPrestados()-1);
          }
      }
    
}
