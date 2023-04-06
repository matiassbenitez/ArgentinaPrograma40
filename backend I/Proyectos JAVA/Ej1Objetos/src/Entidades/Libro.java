/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.

 */
package Entidades;

import java.util.Scanner;

public class Libro {

    //atributos
    public String ISBN;
    private String titulo;
    private String autor;
    private int nroPag;
    
    //constructores
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int nroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
    }

       //métodos
    public void cargarLibro() {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN: ");
        ISBN = leer.next();
        System.out.println("Ingrese el título: ");
        titulo = leer.next();
        System.out.println("Ingrese el autor: ");
        autor = leer.next();
        System.out.println("Ingrese el número de páginas: ");
        nroPag = leer.nextInt();
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nroPag=" + nroPag + '}';
    }
    
    

}
