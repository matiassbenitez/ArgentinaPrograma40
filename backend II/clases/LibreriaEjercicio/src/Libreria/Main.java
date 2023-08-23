package Libreria;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

/**
 *
 * @author ALEXIS.R.L
 */

public class Main {

    private static final AutorServicio auServ = new AutorServicio();
    private static final EditorialServicio edServ = new EditorialServicio();
    private static final LibroServicio liServ = new LibroServicio();
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int opcion;
        Boolean salir = false;
        while (!salir) {
            System.out.println("MENU LIBRERIA");

            System.out.println("1. BUSCAR AUTOR POR NOMBRE");
            System.out.println("2. BUSCAR LIBRO POR ISBN");
            System.out.println("3. BUSCAR LIBRO POR TITULO");
            System.out.println("4. BUSCAR LIBRO POR AUTOR");
            System.out.println("5. BUSCAR LIBRO POR EDITORIAL");
            System.out.println("6. CREAR AUTOR, EDITORIAL Y LIBRO");
            System.out.println("7. SALIR");

            System.out.println("Elija una Opción");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un nombre de autor");
                    String nomA = leer.next();
                    auServ.buscarPorNombre(nomA);
                    break;
                case 2:
                    System.out.println("Ingrese el ISBN del Libro");
                    long isbn = leer.nextLong();
                    liServ.buscarPorIsbn(isbn);
                    break;
                case 3:
                    System.out.println("Ingrese el Título del Libro");
                    String tit = leer.next();
                    liServ.buscarPorTitulo(tit);
                    break;
                case 4:
                    System.out.println("Ingrese un nombre de Autor");
                    String libroA = leer.next();
                    liServ.buscarPorAutorLibro(libroA);
                    break;
                case 5:
                    System.out.println("Ingrese un nombre de la Editorial");
                    String libroE = leer.next();
                    liServ.buscarPorEditorialLibro(libroE);
                    break;
                case 6:
                    System.out.println("crear autor");

                    Autor autor = auServ.crearAutor("cualquiera", true);
//                    Autor autor1 = auServ.crearAutor("Cristian Lasser", true);

                    Editorial editorial = edServ.crearEditorial("Oportunidades S.A ", true);
                   // Editorial editorial1 = edServ.crearEditorial("Alianza ", true);

                    Libro libro = liServ.crearLibro("Un viaje hacia mi corazon", 2018, 10, 2, 8, true, autor, editorial);
                  //  Libro libro1 = liServ.crearLibro("Un pajarito", 2020, 10, 2, 8, true, autor1, editorial1);
                    break;

                case 7:
                    System.out.println("Desea Salir de la Aplicación? S/N");
                    String res = leer.next().toLowerCase();

                    if ("s".equals(res)) {
                        salir = true;
                        break;
                    }
                default:
                    System.out.println("Solo Números entre 1 y 7");
            }
        }
        //Autor autor3 = auServ.crearAutor(au3, al3);

        //auServ.listarAutor().forEach((a) -> System.out.println(a.toString()));
    }

}
