package ejercicio1guia11.entidades.Servicio;

import ejercicio1guia11.entidades.Perro;
import ejercicio1guia11.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

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
public class ServicioPersonaPerro {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    public void crearPersona(ArrayList<Persona> persona){
        String res;
        do {
            
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido");
        String apellido = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("ingrese el DNI");
        int DNI = leer.nextInt();
        
        persona.add(new Persona (nombre, apellido, edad, DNI));
            System.out.println("desea ingresar otra persona? SI / NO");
            res = leer.next();
        } while (res.equalsIgnoreCase("SI"));
    }
    public void crearPerro(ArrayList<Perro> perro){
        String res;
        do {
            
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la raza");
        String raza = leer.next();
        System.out.println("ingrese el tamañio");
        String tamanio = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        
        perro.add(new Perro (nombre, raza, tamanio, edad));
            System.out.println("desea ingresar otro perro? SI / NO");
            res = leer.next();
        } while (res.equalsIgnoreCase("SI"));
    }
    public void asignar (ArrayList<Persona> persona, ArrayList<Perro> perro){
        int cont=0;
        
        for (Persona persona1 : persona) {
            persona1.setPerro(perro.get(cont));
            cont++;
            
        }
}
}
