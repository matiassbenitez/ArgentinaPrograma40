
package libreria.entidades;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;

    public Cliente() {
    }

    public Cliente(Long documento, String nombre, String apellido, String telefono) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("\nId: ").append(id);
        sb.append("\nDocumento: ").append(documento);
        sb.append("\nNombre: ").append(new String(nombre.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
        sb.append("\nApellido: ").append(new String(apellido.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
        sb.append("\nTelefono: ").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
