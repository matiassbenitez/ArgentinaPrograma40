
package libreria.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Prestamo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Libro libro;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamo{");
        sb.append("Id: ").append(id);
        sb.append("\nFecha Prestamo: ").append(fechaPrestamo);
        sb.append("\nFecha Devolucion: ").append(fechaDevolucion);
        sb.append("\nLibro: ").append(libro);
        sb.append("\nCliente: ").append(cliente);
        sb.append('}');
        return sb.toString();
    }
   
    
    
    
    
    
}
