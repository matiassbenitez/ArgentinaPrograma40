package guia11ej1.servicios;

import guia11ej1.entidades.Perro;
import guia11ej1.entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void elegirMascota(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        for (Persona persona : personas) {
            System.out.println("Lista de Mascotas: ");
            for (Perro perro : perros) {
                System.out.println(perro);
            }
            boolean encontrado;
            boolean adoptado;
            do {
            System.out.println(persona.getNombre() + ", ingrese el nombre de la mascota a adoptar: ");
            String nombre = leer.next();
            encontrado = false;
            adoptado = false;
                for (Persona person : personas) {
                    if (person.getPerro() != null) {
                        if (person.getPerro().getNombre().equals(nombre)) {
                            encontrado = true;
                        }
                    }
                }
                if (encontrado) {
                    System.out.println("El perro ya se encuentra adoptado, por favor elija otro: ");
                } else {
                    Iterator<Perro> iterador = perros.iterator();
                    while (iterador.hasNext()){
                        Perro p = iterador.next();
                        if (p.getNombre().equals(nombre)){
                            persona.setPerro(p);
                            System.out.println("El perro fue adoptado.");
                            adoptado = true;
                        }
                        if (!iterador.hasNext()){
                            if (!adoptado){
                                System.out.println("El perro no existe.");
                            }
                        }
                    }
                }
            } while (encontrado || !adoptado);

        }

    }

    public void mostrar(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " es dueño/a de " + persona.getPerro().getNombre());
        }
    }
}
