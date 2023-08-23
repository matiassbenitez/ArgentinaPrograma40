
package libreria.entidades;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Autor implements Serializable {
    
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id; 
  private String nombre;
  private Boolean alta;

    public Autor() {
    }

    public Autor(String nombre, Boolean alta) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(id);
        sb.append("\tNombre: ").append(new String(nombre.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
        sb.append("\t alta: ").append(alta);        
        return sb.toString();
    }
  
  
    
    
    
    
}
