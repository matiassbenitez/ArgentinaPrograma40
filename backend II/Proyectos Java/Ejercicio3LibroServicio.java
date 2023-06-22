package Servicios;

import Entidades.Ejercicio3Libro;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3LibroServicio {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibros(HashSet<Ejercicio3Libro> libro) {
        System.out.println("Ingrese el título del libro");
        String título = leer.next();
        System.out.println("Ingrese el/la autor/a de ese libro");
        String autor = leer.next();
        System.out.println("Ingrese el número de ejemplares impresos");
        int ejemplares = leer.nextInt();
        System.out.println("De esos ejemplares impresos, ¿cuántos se prestaron?");
        int ejemplaresPrestados = leer.nextInt();
        libro.add(new Ejercicio3Libro(título, autor, ejemplares, ejemplaresPrestados));
    }

    public boolean préstamo(HashSet<Ejercicio3Libro> libro) {
        boolean libroPrestado = false;
        System.out.println("Ingrese el título del libro para buscar el mismo");
        String buscar = leer.next();
        for (Ejercicio3Libro ejercicio3Libro : libro) {
            if (ejercicio3Libro.getTítulo().equals(buscar)) {
                if (ejercicio3Libro.getEjemplares() > ejercicio3Libro.getEjemplaresPrestados()) {
                    ejercicio3Libro.setEjemplaresPrestados(ejercicio3Libro.getEjemplaresPrestados() + 1);
                    libroPrestado = true;
                }
            }
        }
        if (libroPrestado) {
            System.out.println("Se encontró el título del libro " + buscar + " y ya fue solicitado");
        } else {
            System.out.println("Lo siento. No quedan más ejemplares del libro " + buscar + " para prestar");
        }
        return libroPrestado;
    }

    public boolean devolución(HashSet<Ejercicio3Libro> libro) {
        boolean libroDevuelto = false;
        System.out.println("Ingrese el título del libro para devolver el mismo");
        String buscar = leer.next();
        for (Ejercicio3Libro ejercicio3Libro : libro) {
            if (ejercicio3Libro.getTítulo().equals(buscar)) {
                if (ejercicio3Libro.getEjemplaresPrestados() > 0) {
                    ejercicio3Libro.setEjemplaresPrestados(ejercicio3Libro.getEjemplaresPrestados() - 1);
                    libroDevuelto = true;
                }
            }
        }
        if (libroDevuelto) {
            System.out.println("Se encontró el título del libro " + buscar + " y ya se puede devolver");
        } else {
            System.out.println("Lo siento, todos los ejemplares del libro " + buscar + " ya fueron devueltos");
        }
        return libroDevuelto;
    }

    public void mostrarLibros(HashSet<Ejercicio3Libro> libro) {
        System.out.println(libro);
    }

}
