
package ejercicioobjetos1.entidades;

import java.util.Scanner;

/**
 *
 * @author Tuchito
 * 
 * Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.

 */
public class Libro {
    
    Scanner leer = new Scanner(System.in);
    public String isbn;
    public String titulo;
    public String autor;
    public int nroPaginas;

    public Libro(String isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public Libro() {
    }
    
    public void crearLibro(){
        System.out.println("Ingrese el ISBN del libro: ");
        isbn = leer.nextLine();
        System.out.println("Ingrese el título del libro: ");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        autor = leer.nextLine();
        System.out.println("Ingrese el número de páginas del libro: ");
        nroPaginas = leer.nextInt();
    }
    
    

    @Override
    public String toString() {
        return "Libro{" + "leer=" + leer + ", isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nroPaginas=" + nroPaginas + '}';
    }
    
    
}

