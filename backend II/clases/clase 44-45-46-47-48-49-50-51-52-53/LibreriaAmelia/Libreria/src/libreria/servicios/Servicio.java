package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class Servicio {

    LibroDAO ld = new LibroDAO();
    LibroServicio ls = new LibroServicio();
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();
    ClienteServicio cs = new ClienteServicio();

    public void mostrarMenu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op;
        do {
            System.out.println(" ");
            System.out.println("===== MENÚ =====");
            System.out.println("1. Menú Libro");
            System.out.println("2. Menú Autor");
            System.out.println("3. Menú Editorial");
            System.out.println("4. Préstamo");
            System.out.println("5. Cliente");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción y presione enter: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    int op1 = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("===== MENÚ LIBRO =====");
                        System.out.println("1. Cargar Libro");
                        System.out.println("2. Mostrar Libros");
                        System.out.println("3. Buscar Libros");
                        System.out.println("4. Dar de alta libro");
                        System.out.println("5. Dar de baja libro");
                        System.out.println("6. Editar libro");
                        System.out.println("7. Eliminar libro");
                        System.out.println("8. Salir");
                        System.out.print("Seleccione una opcion y presione enter: ");
                        op1 = leer.nextInt();
                        switch (op1) {
                            case 1:
                                ls.crearLibro();
                                System.out.println(" ");
                                break;
                            case 2:
                                ls.mostrarLibros();
                                System.out.println(" ");
                                break;
                            case 3:
                                int op2 = 0;
                                do {
                                    System.out.println(" ");
                                    System.out.println("===== MENÚ BUSCAR =====");
                                    System.out.println("1. Buscar libro por ISBN");
                                    System.out.println("2. Buscar libro por Título");
                                    System.out.println("3. Buscar libro por Nombre de Autor");
                                    System.out.println("4. Buscar libro por Editorial");
                                    System.out.println("5. Salir");
                                    System.out.print("Seleccione una opcion y presione enter: ");
                                    op2 = leer.nextInt();
                                    switch (op2) {
                                        case 1:
                                            System.out.print("Ingrese el ISBN del libro: ");
                                            Long isbn = leer.nextLong();
                                            ls.buscarLibroPorISBN(isbn);
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.print("Ingrese el título del libro: ");
                                            String titulo = leer.next();
                                            ls.buscarLibroPorTitulo(titulo);
                                            System.out.println(" ");
                                            break;
                                        case 3:
                                            System.out.print("Ingrese el nombre del autor: ");
                                            String nombreAutor = leer.next();
                                            ls.buscarLibroPorNombreDeAutor(nombreAutor);
                                            System.out.println(" ");
                                            break;
                                        case 4:
                                            System.out.print("Ingrese el nombre de la editorial: ");
                                            String nombreEditorial = leer.next();
                                            ls.buscarLibroPorEditorial(nombreEditorial);
                                            System.out.println(" ");
                                            break;
                                        case 5:
                                            System.out.println("Saliendo");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Intente nuevamente.");
                                    }
                                } while (op2 != 5);
                                break;

                            case 4:
                                System.out.println(" ");
                                ls.mostrarLibrosInactivos();
                                List<Libro> librosInactivos = ld.listarInactivos();
                                if (librosInactivos.isEmpty()) {
                                    break;
                                }
                                System.out.print("Ingrese el Id del libro que desea dar de alta: ");
                                int idAlta = leer.nextInt();
                                if (idAlta == 0) {
                                    break;
                                }
                                ls.darDeAltaLibro(idAlta);
                                break;
                            case 5:
                                ls.mostrarLibros();
                                System.out.print("Ingrese el Id del libro que desea dar de baja: ");
                                int idBaja = leer.nextInt();
                                ls.darDeBajaLibro(idBaja);
                                break;
                            case 6:
                                int op5 = 0;
                                do {
                                    System.out.println(" ");
                                    System.out.println("===== MENÚ EDITAR =====");
                                    System.out.println("1. Editar ISBN");
                                    System.out.println("2. Editar Título");
                                    System.out.println("3. Editar año");
                                    System.out.println("4. Editar la cantidad de ejemplares");
                                    System.out.println("5. Salir");
                                    System.out.print("Seleccione una opcion y presione enter: ");
                                    op5 = leer.nextInt();
                                    switch (op5) {
                                        case 1:
                                            ls.mostrarLibros();
                                            System.out.print("Ingrese el id del libro que desea modificar: ");
                                            int id = leer.nextInt();
                                            ls.modificarISBN(id);
                                            break;
                                        case 2:
                                            ls.mostrarLibros();
                                            System.out.print("Ingrese el id del libro que desea modificar: ");
                                            int id1 = leer.nextInt();
                                            ls.modificarTitulo(id1);
                                            break;
                                        case 3:
                                            ls.mostrarLibros();
                                            System.out.print("Ingrese el id del libro que desea modificar : ");
                                            int id2 = leer.nextInt();
                                            ls.modificarAnio(id2);
                                            break;
                                        case 4:
                                            ls.mostrarLibros();
                                            System.out.print("Ingrese el id del libro que desea modificar: ");
                                            int id3 = leer.nextInt();
                                            ls.modificarEjemplares(id3);
                                            break;
                                        case 5:
                                            System.out.println("Saliendo");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Intente nuevamente.");
                                    }
                                } while (op5 != 5);
                                break;

                            case 7:
                                ls.eliminarLibro();
                                break;
                            case 8:
                                System.out.println("Saliendo...");
                                op1 = 8;
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }

                    } while (op1 != 8);
                    break;

                case 2:
                    int op3 = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("===== MENÚ AUTOR =====");
                        System.out.println("1. Cargar Autor");
                        System.out.println("2. Mostrar Autor");
                        System.out.println("3. Dar de alta autor");
                        System.out.println("4. Dar de baja autor");
                        System.out.println("5. Editar autor");
                        System.out.println("6. Eliminar autor");
                        System.out.println("7. Salir");
                        System.out.print("Seleccione una opcion y presione enter: ");
                        op3 = leer.nextInt();
                        switch (op3) {
                            case 1:
                                as.crearAutor();
                                System.out.println(" ");
                                break;
                            case 2:
                                as.mostrarAutor();
                                System.out.println(" ");
                                break;
                            case 3:
                                as.altaAutor();
                                System.out.println(" ");
                                break;
                            case 4:
                                as.bajaAutor();
                                System.out.println(" ");
                                break;
                            case 5:
                                as.editarAutor();
                                System.out.println(" ");
                                break;
                            case 6:
                                as.eliminarAutor();
                                System.out.println(" ");
                                break;
                            case 7:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }
                    } while (op3 != 7);
                    break;

                case 3:
                    int op4 = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("===== MENÚ EDITORIAL =====");
                        System.out.println("1. Cargar Editorial");
                        System.out.println("2. Mostrar Editorial");
                        System.out.println("3. Dar de alta editorial");
                        System.out.println("4. Dar de baja editorial");
                        System.out.println("5. Editar editorial");
                        System.out.println("6. Eliminar editorial");
                        System.out.println("7.Salir");
                        System.out.print("Seleccione una opción y presione enter: ");
                        op4 = leer.nextInt();
                        switch (op4) {
                            case 1:
                                es.crearEditorial();
                                System.out.println(" ");
                                break;
                            case 2:
                                es.mostrarEditorial();
                                System.out.println(" ");
                                break;
                            case 3:
                                es.altaEditorial();
                                System.out.println(" ");
                                break;
                            case 4:
                                es.bajaEditorial();
                                System.out.println(" ");
                                break;
                            case 5:
                                es.editarEditorial();
                                System.out.println(" ");
                                break;
                            case 6:
                                es.eliminarEditorial();
                                break;
                            case 7:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }

                    } while (op4 != 7);
                    break;

                case 4:
                    ls.prestarLibro();
                    break;
                case 5:
                    int op5 = 0;
                    do {
                        System.out.println(" ");
                        System.out.println("===== MENÚ CLIENTE =====");
                        System.out.println("1. Cargar Cliente");
                        System.out.println("2. Mostrar Clientes");
                        System.out.println("3. Buscar Clientes");
                        System.out.println("4. Editar Cliente");
                        System.out.println("5. Eliminar editorial");
                        System.out.println("6.Salir");
                        System.out.print("Seleccione una opción y presione enter: ");
                        op5 = leer.nextInt();
                        switch (op5) {
                            case 1:
                                es.crearEditorial();
                                System.out.println(" ");
                                break;
                            case 2:
                                int op6 = 0;
                                do {
                                    System.out.println(" ");
                                    System.out.println("===== MENÚ BUSCAR CLIENTES =====");
                                    System.out.println("1. Buscar por Id");
                                    System.out.println("2. Buscar por DNI");
                                    System.out.println("3. Buscar por Nombre");
                                    System.out.println("4. Buscar por Apellido");
                                    System.out.println("5. Buscar por Teléfono");
                                    System.out.println("6. Buscar por Fecha de Prestamo");
                                    System.out.println("7. Buscar por Fecha de Devolución");
                                    System.out.println("8. Buscar por Préstamo");
                                    System.out.println("9.Salir");
                                    System.out.print("Seleccione una opción y presione enter: ");
                                    op6 = leer.nextInt();
                                    switch (op6) {
                                        case 1:
                                            System.out.print("Ingrese el Id del Cliente: ");
                                            int id = leer.nextInt();
                                            cs.mostrarClientesPorId(id);
                                            System.out.println(" ");
                                            break;
                                        case 2:
                                            System.out.print("Ingrese el DNI del Cliente:");
                                            Long dni = leer.nextLong();
                                            cs.mostrarClientesPorDni(dni);
                                            System.out.println(" ");
                                            break;
                                        case 3:
                                            System.out.print("Ingrese el nombre del Cliente: ");
                                            String nombre = leer.next();
                                            cs.mostrarClientesPorNombre(nombre);
                                            System.out.println(" ");
                                            break;
                                        case 4:
                                            System.out.print("Ingrese el apellido del Cliente: ");
                                            String apellido = leer.next();
                                            cs.mostrarClientePorApellido(apellido);
                                            System.out.println(" ");
                                            break;
                                        case 5:
                                            System.out.println("");
                                            System.out.println(" ");
                                            break;
                                        case 6:
                                            es.bajaEditorial();
                                            System.out.println(" ");
                                            break;
                                        case 7:
                                            es.bajaEditorial();
                                            System.out.println(" ");
                                            break;
                                        case 8:
                                            es.bajaEditorial();
                                            System.out.println(" ");
                                            break;
                                        case 9:
                                            System.out.println("Saliendo...");
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Intente nuevamente.");
                                    }

                                } while (op6 != 9);
                                break;

                            case 3:
                                es.bajaEditorial();
                                System.out.println(" ");
                                break;
                            case 4:
                                es.editarEditorial();
                                System.out.println(" ");
                                break;
                            case 5:
                                es.eliminarEditorial();
                                break;
                            case 6:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }

                    } while (op5 != 6);
                    break;

                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (op != 6);
    }
}
