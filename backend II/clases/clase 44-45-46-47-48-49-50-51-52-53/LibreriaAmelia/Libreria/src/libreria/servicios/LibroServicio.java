package libreria.servicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    LibroDAO libroDAO = new LibroDAO();
    AutorDAO autorDAO = new AutorDAO();
    EditorialDAO editorialDAO = new EditorialDAO();
    AutorServicio as = new AutorServicio();
    EditorialServicio es = new EditorialServicio();

    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro libro = new Libro();
        boolean crearOtroLibro = false;
        do {
            System.out.print("Ingrese el ISBN del libro: ");
            Long isbn = 0L;
            try {
                isbn = leer.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un n�mero v�lido.");
                leer.nextLine(); // Limpia el b�fer en caso de error
                continue; // Salta a la siguiente iteraci�n del bucle
            }

            System.out.print("Ingrese el t�tulo del libro: ");
            String titulo = leer.next();

            System.out.print("Ingrese el a�o del libro: ");
            int aaaa = 0;
            try {
                aaaa = leer.nextInt();
                if (aaaa <= 0) {
                    System.out.println("El a�o debe ser mayor a 0.");
                    leer.nextLine(); // Limpia el b�fer en caso de error
                    continue; // Salta a la siguiente iteraci�n del bucle
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un n�mero v�lido.");
                leer.nextLine(); // Limpia el b�fer en caso de error
                continue; // Salta a la siguiente iteraci�n del bucle
            }

            System.out.print("Ingrese la cantidad de ejemplares: ");
            int ejemplares = 0;
            try {
                ejemplares = leer.nextInt();
                if (ejemplares <= 0) {
                    System.out.println("La cantidad de ejemplares debe ser mayor a 0.");
                    leer.nextLine(); // Limpia el b�fer en caso de error
                    continue; // Salta a la siguiente iteraci�n del bucle
                }
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es un n�mero v�lido.");
                leer.nextLine(); // Limpia el b�fer en caso de error
                continue; // Salta a la siguiente iteraci�n del bucle
            }

            as.mostrarAutor();

            int autorId = 0;
            boolean autorValido = false;
            while (!autorValido) {
                try {
                    System.out.println("Ingrese el ID del autor o ingrese 0 para crear un nuevo autor:");
                    autorId = leer.nextInt();
                    autorValido = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error: El dato ingresado no es v�lido. Intente nuevamente.");
                    leer.nextLine(); // Limpiar el b�fer de entrada
                    //autorId = leer.nextInt();
                }
            }

            Autor autor = null;
            if (autorId != 0) {
                autor = autorDAO.buscarPorId(autorId);
            }

            if (autor == null) {
                autor = as.crearAutorMenu();
            }

            es.mostrarEditorial();

            int editorialId = 0;
            boolean editorialValida = false;
            while (!editorialValida) {
                try {
                    System.out.println("Ingrese el ID de la editorial o ingrese 0 para crear una nueva editorial:");
                    editorialId = leer.nextInt();
                    editorialValida = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error: El dato ingresado no es v�lido. Intente nuevamente.");
                    leer.nextLine(); // Limpiar el b�fer de entrada
                    //editorialId = leer.nextInt();
                }
            }

            Editorial editorial = null;
            if (editorialId != 0) {
                editorial = editorialDAO.buscarPorId(editorialId);
            }

            if (editorial == null) {
                editorial = es.crearEditorialMenu();
            }

//            System.out.println("titulo: " + titulo);
//            System.out.println("autor: " + autor);
//            System.out.println("editorial: " + editorial);

            if (titulo.isEmpty() || autor == null || editorial == null) {
                System.out.println("Error: Los datos ingresados son inv�lidos.");                
            }

            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAnio(aaaa);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(ejemplares);
            libro.setAlta(true);
            libro.setAutor(autor);
            libro.setEditorial(editorial);

            libroDAO.agregarLibro(libro);
            System.out.println("Libro creado exitosamente.");
            libro = new Libro(isbn, titulo, aaaa, ejemplares, ejemplares, ejemplares, true, autor, editorial);

            System.out.println("�Desea crear otro libro? (S/N)");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                crearOtroLibro = true;
                break;
            }
            leer.nextLine(); // Consumir el salto de l�nea antes de repetir el bucle

        } while (!crearOtroLibro);

        return libro;
    }

    public void darDeAltaLibro(int id) {        
        Libro libro = libroDAO.buscarPorId(id);
        if (libro != null) {
            libroDAO.darDeAlta(libro);
            System.out.println("Libro dado de alta exitosamente.");
        } else {
            System.out.println("No se encontr� ning�n libro con el Id proporcionado.");            
            return; // Salir del m�todo y regresar al men� de libros
            
        }
    }

    public void darDeBajaLibro(int id) {
        Libro libro = libroDAO.buscarPorId(id);
        if (libro != null) {
            libroDAO.darDeBaja(libro);
            System.out.println("Libro dado de baja exitosamente.");
        } else {
            System.out.println("No se encontr� ning�n libro con el Id proporcionado.");
            return; // Salir del m�todo y regresar al men� de libros
        }
    }

    public void mostrarLibros() {
        List<Libro> libros = libroDAO.listar();
        if (libros != null && !libros.isEmpty()) {
            System.out.println("Lista de Libros:");
            libros.forEach(System.out::println);
        } else {
            System.out.println("No se encontraron Libros.");            
        }
        System.out.println(" ");
    }

    public void mostrarLibrosInactivos() {
        List<Libro> librosInactivos = libroDAO.listarInactivos();
        if (librosInactivos != null && !librosInactivos.isEmpty()) {
            System.out.println("Lista de libros inactivos:");
            librosInactivos.forEach(System.out::println);
        } else {
            System.out.println("No se encontraron libros inactivos.");
        }
        System.out.println(" ");
    }

    public void modificarISBN(int id) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta = " ";
        do {
            Libro libro = libroDAO.buscarPorId(id);

            if (libro != null) {
                System.out.print("Ingrese el nuevo ISBN del libro: ");
                long nuevoISBN = leer.nextLong();

                libro.setIsbn(nuevoISBN);

                libroDAO.editarLibro(libro);
                System.out.println("ISBN del libro modificado exitosamente.");
            } else {
                System.out.println("No se encontr� ning�n libro con el ID proporcionado.");
            }

            System.out.println("desea modificar el ISBN de otro Libro?(S/N): ");
            rta = leer.next();

        } while (rta.equalsIgnoreCase("S"));
    }

    public void modificarTitulo(int id) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta = " ";
        do {
            Libro libro = libroDAO.buscarPorId(id);

            if (libro != null) {
                System.out.print("Ingrese el nuevo T�tulo del libro: ");
                String nuevoTitulo = leer.next();

                libro.setTitulo(nuevoTitulo);

                libroDAO.editarLibro(libro);
                System.out.println("T�tulo del libro modificado exitosamente.");
            } else {
                System.out.println("No se encontr� ning�n libro con el ID proporcionado.");
            }
            System.out.println("desea modificar el ISBN de otro Libro?(S/N): ");
            rta = leer.next();

        } while (rta.equalsIgnoreCase("S"));
    }

    public void modificarAnio(int id) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta = " ";
        do {
            Libro libro = libroDAO.buscarPorId(id);

            if (libro != null) {
                System.out.print("Ingrese el nuevo a�o del libro: ");
                int nuevoAnio = leer.nextInt();

                libro.setAnio(id);

                libroDAO.editarLibro(libro);
                System.out.println("A�o del libro modificado exitosamente.");
            } else {
                System.out.println("No se encontr� ning�n libro con el ID proporcionado.");
            }
            System.out.println("desea modificar el ISBN de otro Libro?(S/N): ");
            rta = leer.next();

        } while (rta.equalsIgnoreCase("S"));
    }

    public void modificarEjemplares(int id) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta = " ";
        do {
            Libro libro = libroDAO.buscarPorId(id);

            if (libro != null) {
                System.out.print("Ingrese la nueva cantidad de ejemplares del libro: ");
                int nuevaCantEjemplares = leer.nextInt();

                libro.setEjemplares(nuevaCantEjemplares);

                libroDAO.editarLibro(libro);
                System.out.println("Cantidad de ejemplares del libro modificada exitosamente.");
            } else {
                System.out.println("No se encontr� ning�n libro con el ID proporcionado.");
            }
            System.out.println("desea modificar el ISBN de otro Libro?(S/N): ");
            rta = leer.next();

        } while (rta.equalsIgnoreCase("S"));
    }

    // 9) Muestra b�squeda de un libro por ISBN.
    public void buscarLibroPorISBN(Long isbn) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
        Libro libro = libroDAO.buscarPorISBN(isbn);
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("Libro no encontrado");
        }
    } catch (InputMismatchException e) {
        System.out.println("Error: El valor ingresado no es un n�mero v�lido.");
        // Limpiar el b�fer de entrada
        leer.nextLine();
        // Volver a solicitar el ISBN
        System.out.print("Ingrese el ISBN del libro: ");
        Long nuevoISBN = leer.nextLong();
        buscarLibroPorISBN(nuevoISBN);
    }
    }

    //10) Muestra b�squeda de un libro por T�tulo.
    public void buscarLibroPorTitulo(String titulo) {
        List<Libro> libros = libroDAO.buscarPorTitulo(titulo);
        if (!libros.isEmpty()) {
            System.out.println("Libros encontrados:");
            for (Libro libroEncontrado : libros) {
                System.out.println(libroEncontrado);
                System.out.println("-------------------");
            }
        } else {
            System.out.println("No se encontraron libros con el t�tulo: " + titulo);
        }
    }

    //11) Muestra b�squeda de un libro/s por nombre de Autor
    public void buscarLibroPorNombreDeAutor(String nombreAutor) {
        List<Libro> lista = libroDAO.buscarPorAutor(nombreAutor);
        if (!lista.isEmpty()) {
            System.out.println("Libros encontrados del autor: " + nombreAutor + " :");
            System.out.println(lista);
            System.out.println("-------------------");
        } else {
            System.out.println("No se encontraron libros del autor: " + nombreAutor);
        }

    }

    //12) Muestra b�squeda de un libro/s por nombre de Editorial.
    public void buscarLibroPorEditorial(String nombreEditorial) {
        List<Libro> lista = libroDAO.buscarPorEditorial(nombreEditorial);
        if (!lista.isEmpty()) {
            System.out.println("Libros encontrados de la editorial: " + nombreEditorial + " :");
            System.out.println(lista);
            System.out.println("-------------------");
        } else {
            System.out.println("No se encontraron libros de la editorial: " + nombreEditorial);
        }
    }

    public void prestarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rta = "S";
        do {
            System.out.print("Ingrese el titulo del libro que desea prestar: ");
            String tituloLibro = leer.next();

            // Buscar el libro por t�tulo en el LibroDAO
            List<Libro> librosEncontrados = libroDAO.buscarPorTitulo(tituloLibro);

            if (librosEncontrados.isEmpty()) {
                System.out.println("No se encontr� un libro con ese t�tulo.");
            } else {
                System.out.println("Libros encontrados con ese t�tulo.");

                for (int i = 0; i < librosEncontrados.size(); i++) {
                    Libro libro = librosEncontrados.get(i);
                    System.out.println((i + 1) + ") " + libro);
                }

                System.out.print("Ingrese el n�mero correspondiente al libro que desea prestar: ");
                int opcion = leer.nextInt();

                if (opcion >= 1 && opcion <= librosEncontrados.size()) {
                    Libro libroSeleccionado = librosEncontrados.get(opcion - 1);
                    libroDAO.prestarLibro(libroSeleccionado);
                    System.out.println("Libro prestado exitosamente.");
                } else {
                    System.out.println("Opci�n inv�lida. No se realiz� el pr�stamo.");
                }
            }
            System.out.println("Desea prestar otro libro?(S/N");
            rta = leer.next();

        } while (rta.equalsIgnoreCase("S"));
    }

    public void eliminarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        do {
            // Mostrar lista de libros
            mostrarLibros();

            // Solicitar al usuario el ID o nombre del libro que desea eliminar
            System.out.print("Ingrese el ID o el nombre del libro que desea eliminar: ");
            String input = leer.next();

            // Verificar si el input es un n�mero (ID) o una cadena (nombre)
            boolean isId = input.matches("\\d+");

            // Buscar el libro en la base de datos
            Libro libroAEliminar = null;
            if (isId) {
                // Buscar por ID
                int id = Integer.parseInt(input);
                libroAEliminar = libroDAO.buscarPorId(id);
            } else {
                // Buscar por nombre
                libroAEliminar = (Libro) libroDAO.buscarPorTitulo(input);
            }

            // Verificar si se encontr� el libro y proceder con la eliminaci�n
            if (libroAEliminar != null) {
                libroDAO.eliminarLibro(libroAEliminar);
                System.out.println("Libro eliminado exitosamente.");
            } else {
                System.out.println("No se encontr� ning�n libro con el ID o nombre proporcionado.");
            }

            System.out.print("�Desea eliminar otro libro? (S/N): ");
            String respuesta = leer.next();

            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }

        } while (true);
    }

}
