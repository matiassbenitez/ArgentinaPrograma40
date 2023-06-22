/*
 Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).

 */
package entidades;

public class Estudiantes {
    
   private String  nombre;
   private Double nota;

    public Estudiantes(){
        
    }
    public Estudiantes(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
   
   
    
}
