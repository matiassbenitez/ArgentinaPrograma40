package ejercicio1guia11;

import ejercicio1guia11.entidades.Perro;
import ejercicio1guia11.entidades.Persona;
import ejercicio1guia11.entidades.Servicio.ServicioPersonaPerro;
import java.util.ArrayList;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio1Guia11 {

    public static void main(String[] args) {
        ArrayList <Persona> persona = new ArrayList<>();
        ArrayList <Perro> perro = new ArrayList<>();
        ServicioPersonaPerro spp = new ServicioPersonaPerro();
        
        spp.crearPersona(persona);
        
        spp.crearPerro(perro);
        
        spp.asignar(persona, perro);
        for (Persona persona1 : persona) {
            System.out.println(persona1);
        }
    }

}
