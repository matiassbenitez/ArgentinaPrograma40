
package relaciones;

import relaciones.entidades.Curso;
import relaciones.entidades.Dni;
import relaciones.entidades.Persona;
import relaciones.entidades.Profesor;


public class Relaciones {

    public static void main(String[] args) {
       
        Dni doc = new Dni("A",31567557);
        Persona p1 = new Persona("Matias", "Benitez",doc);
        System.out.println(p1.getDni().getSerie());
        System.out.println(p1.getDni().getNumero());
    }

}
