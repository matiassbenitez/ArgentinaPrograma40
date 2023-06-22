/**
 *  Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
 * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */
package guia11ej1;

import guia11ej1.entidades.Perro;
import guia11ej1.entidades.Persona;
import guia11ej1.servicios.Servicio;
import java.util.ArrayList;

public class Guia11ej1 {
    
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        Servicio sv = new Servicio();
        
        Persona persona1= new Persona("Matias", "Benitez", 38, "321654");
        personas.add(new Persona("Tucho", "Kpo", 25, "121546"));
        personas.add(new Persona("Marcela", "Gallarda", 45, "1256897"));
        personas.add(new Persona("Alma", "Mia", 12, "135646"));
        personas.add(new Persona("Graciela", "Alfano", 62, "31313131"));
        
        Perro perro1 = new Perro("Pipo", "Beagle", 12, "Grande");
        persona1.setPerro(perro1);
        perros.add(new Perro("Paul", "Gato", 7, "Grande"));
        perros.add(new Perro("Fiocco", "Labrador", 14, "Mediano"));
        perros.add(new Perro("Luz", "Caniche", 10, "Chico"));
        perros.add(new Perro("Negra", "Siberiano", 8, "Gigante"));
        
//        personas.get(0).setPerro(perros.get(0));
//        perro1.setEdad(5);
//        System.out.println(persona1.getPerro());
//        System.out.println(perro1);
        sv.elegirMascota(personas, perros);
        sv.mostrar(personas);
        
        
    }
    
}
