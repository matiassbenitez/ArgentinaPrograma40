/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.ClienteServicio;
import libreria.Servicios.EditorialServicio;
import libreria.Servicios.LibroServicio;
import libreria.Servicios.PrestamoServicio;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;


public class Libreria {

    private static final AutorServicio auServ = new AutorServicio();
    private static final EditorialServicio edServ = new EditorialServicio();
    private static final LibroServicio liServ = new LibroServicio();
    private static final ClienteServicio cliServ = new ClienteServicio();
    private static final PrestamoServicio preServ = new PrestamoServicio();
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        while(!salir){
            System.out.println("MENU LIBRERIA");

            System.out.println("1. BUSCAR AUTOR POR NOMBRE");
            System.out.println("2. BUSCAR LIBRO POR ISBN");
            System.out.println("3. BUSCAR LIBRO POR TITULO");
            System.out.println("4. BUSCAR LIBRO POR AUTOR");
            System.out.println("5. BUSCAR LIBRO POR EDITORIAL");
            System.out.println("6. CREAR AUTOR, EDITORIAL Y LIBRO");
            System.out.println("7. CREAR CLIENTE");
            System.out.println("8. REGISTRAR UN PRESTAMO");
            System.out.println("9. REGISTRAR DEVOLUCION");
            System.out.println("10. BUSCAR PRESTAMO POR CLIENTE");
            System.out.println("11. SALIR");
            
            System.out.println("Elija una Opción");
            opcion = leer.nextInt();
            
            switch(opcion)
            {
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
                    Autor autor = auServ.crearAutor("Juan Iraolagoitia", true);
                    Editorial ed = edServ.crearEditorial("Santillana", true);
                    Libro lib = liServ.crearLibro("Platero y yo", 1970, 10, 3, 7, true, autor, ed);
                    break;
                case 7:
                    Cliente cliente = cliServ.crearCliente(29200020, "Sergio", "Garcia", "3705897897");
                    Cliente cliente2 = cliServ.crearCliente(28023697, "Daniel", "Perez", "3705898797");
                    Cliente cliente3 = cliServ.crearCliente(30587963, "Maria", "Fernandez", "3705007897");
                    System.out.println("Proceso realizado con exito!");
                    break;
                case 8:
                    Libro libID = liServ.buscarPorIsbn(2);
                    Cliente cliID = cliServ.buscarPorId(1);
                    Prestamo pres = preServ.registrarPrestamo(new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), libID, cliID);
                    System.out.println("Proceso realizado con exito!");
                    break;
                case 9:
                    Prestamo prestamo1 = preServ.buscarPorId(1);
                    preServ.devolverPrestamo(prestamo1);
                    break;
                case 10:
                    System.out.println("Ingrese el DNI del Cliente");
                    long dni = leer.nextLong();
                    preServ.buscarPorPrestCliente(dni);
                    break;
                case 11:
                    System.out.println("Desea Salir de la Aplicación? S/N");
                    String res = leer.next().toLowerCase();
                    
                    if("s".equals(res)){
                        salir = true;
                        break;
                    }
                default:
                    System.out.println("Solo Números entre 1 y 11");
            }
        }
    }
    
}
