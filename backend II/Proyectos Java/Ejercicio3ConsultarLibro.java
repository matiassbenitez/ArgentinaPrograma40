package Ejecutores;

import Entidades.Ejercicio3Libro;
import Servicios.Ejercicio3LibroServicio;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio3ConsultarLibro {

    public static void main(String[] args) {
        HashSet<Ejercicio3Libro> libro = new HashSet();
        Ejercicio3LibroServicio ls = new Ejercicio3LibroServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";
        System.out.println("Bienvenido/a");
        do {
            ls.crearLibros(libro);
            System.out.println("¿Desea crear otro libro?");
            resp = leer.next();
        } while ("si".equals(resp));
        ls.préstamo(libro);
        ls.devolución(libro);
        ls.mostrarLibros(libro);
    }

}
